package com.example.plugins

import com.example.routes.getAllTitans
import com.example.routes.root
import com.example.routes.searchTitans
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getAllTitans()
        searchTitans()

        static("/images") {
            resources("images")
        }
    }
}
