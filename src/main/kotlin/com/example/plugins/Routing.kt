package com.example.plugins

import com.example.dao.IUserDao
import com.example.dao.UserDaoImpl
import com.example.model.Response
import com.example.model.User
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    val userDao: IUserDao = UserDaoImpl()

    routing {
        get("/user") {
            val listUser = userDao.getAllUser()
            val response = Response<MutableList<User>>(200, "Success")
            response.data = listUser

            call.respond(HttpStatusCode.OK, response)
        }
    }
}