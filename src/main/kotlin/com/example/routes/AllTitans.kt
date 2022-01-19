package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.TitanRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllTitans() {
    val titanRepository: TitanRepository by inject()

    get("/titans") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 3

            val apiResponse = titanRepository.getAllTitans(page = page, limit = limit)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Please Enter a Valid Number."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "No Titan Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}