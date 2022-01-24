package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.TitanRepository
import com.example.utils.Constants
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.insertTitan() {
    val titanRepository: TitanRepository by inject()

    post("/titans/add") {
        try {
            val name = call.request.queryParameters[Constants.NAME]!!
            val type = call.request.queryParameters[Constants.TYPE]!!
            val image = generateImagePath(name)
            val about = call.request.queryParameters[Constants.ABOUT]!!
            val inheritors = call.request.queryParameters[Constants.INHERITORS]!!
            val abilities = call.request.queryParameters[Constants.ABILITIES]!!
            val otherNames = call.request.queryParameters[Constants.OTHER_NAMES]!!
            val height = call.request.queryParameters[Constants.HEIGHT]?.toInt() ?: 0
            val rating = call.request.queryParameters[Constants.RATING]?.toDouble() ?: 0.0

            val apiResponse = titanRepository.insertTitan(
                name, image, about, rating, height,
                type, inheritors, abilities, otherNames
            )

            if (apiResponse) {
                call.respond(
                    message = ApiResponse(success = true, message = "Inserted data successfully"),
                    status = HttpStatusCode.OK
                )
            } else {
                call.respond(
                    message = ApiResponse(success = true, message = "Something went wrong , Please try again"),
                    status = HttpStatusCode.BadRequest
                )
            }

        } catch (e: Exception) {
            call.respond(
                message = ApiResponse(success = false, message = e.localizedMessage.toString()),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}

fun generateImagePath(name: String): String {
    var tempName = name.lowercase()
    tempName = tempName.replace("titan", "")
    tempName = tempName.replace(" ", "")
    return "/images/${tempName}.jpg"
}