package ftech.ai.main

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ftech.ai.plugins.configureRouting
import ftech.ai.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8091, host = "192.168.4.197") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
