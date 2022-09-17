package ftech.ai.plugins


import ftech.ai.factory.DaoFactory
import ftech.ai.model.Response
import ftech.ai.model.User
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    val apiRegister = DaoFactory.getRegisterDao()
    routing {
        post("/register") {
            val user = call.receive<User>()
            call.respond(apiRegister.insertUser(user))
        }

        get("/login/{userName?}/{password?}") {
            val userName = call.parameters["userName"]
            val password = call.parameters["password"]

            call.respond(apiRegister.checkLogin(userName!!, password!!))
        }
    }
}