package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/index") {
//            call.respondText()
        }
    }
}


data class Response<T>(val code: Int, val msg: String? = null) {
    var data: T? = null
}