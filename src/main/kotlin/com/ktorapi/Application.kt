package com.ktorapi

import com.ktorapi.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.cors.*
fun main() {
    embeddedServer(Netty, port = 9292, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(CORS)
    configureSerialization()
    configureRouting()
}
