package ftech.ai.plugins


import ftech.ai.factory.DaoFactory
import ftech.ai.model.Response
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/user") {

            val sql =
                "Insert Into user(userName,password,fullName,gender,phoneNumber,email ) Values('vucuong@gmail.com','125463456','VuQCuong','Nam',123456712,'vucuong@gmail.com')"

            val response = Response<String>(0,"Success")
            response.data = DaoFactory.getUserDao().insertUser(sql)
            call.respond(HttpStatusCode.OK,response)
        }

    }
}