package com.example.routes

import com.example.repository.TitanRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchTitans() {
    val titanRepository: TitanRepository by inject()

    get("/aot/titans/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = titanRepository.searchTitans(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}