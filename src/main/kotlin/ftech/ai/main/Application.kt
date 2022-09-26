package ftech.ai.main

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ftech.ai.plugins.configureRouting
import ftech.ai.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8087,host = "127.0.0.1") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
