package com.example.routes

import com.example.models.ApiResponse
import com.example.models.Titan
import com.example.repository.TitanRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.insertTitan() {
    val titanRepository: TitanRepository by inject()

    post("/titans/add") {
        try {
            val name = call.request.queryParameters["name"]!!
            val type = call.request.queryParameters["type"]!!
            val image = call.request.queryParameters["image"]!!
            val about = call.request.queryParameters["about"]!!
            val inheritors = call.request.queryParameters["inheritors"]!!
            val abilities = call.request.queryParameters["abilities"]!!
            val otherNames = call.request.queryParameters["otherNames"]!!
            val height = call.request.queryParameters["height"]?.toInt() ?: 0
            val rating = call.request.queryParameters["rating"]?.toDouble() ?: 0.0


            val apiResponse = titanRepository.insertTitan(
                name, image, about, rating, height,
                type, inheritors, abilities, otherNames
            )
            call.respond(
                message = if (apiResponse) "Success" else "Failure",
                status = HttpStatusCode.OK
            )
        } catch (e: Exception) {
            call.respond(
                message = ApiResponse(success = false, message = e.localizedMessage.toString()),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}