package ftech.ai.plugins


import ftech.ai.factory.DaoFactory
import ftech.ai.model.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    val apiRegister = DaoFactory.getRegisterDao()
    val apiHome = DaoFactory.getHomeDao()
    val apiHotelDetail = DaoFactory.getHotelDetailDao()
    val apiRoom = DaoFactory.getRoomDao()
    val apiRoomDetail = DaoFactory.getRoomDetail()
    val apiListHotel = DaoFactory.getListHotel()
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

        get("/home") {
            call.respond(apiHome.getHome())
        }


        get("home/hotel/detail/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiHotelDetail.hotelDetail(id))
        }

        get("home/room/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiRoom.getRoom(id))
        }

        get("home/room/detail/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiRoomDetail.getRoomDetail(id))
        }

        get ( "home/city/hotel/{id?}" ){
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiListHotel.getHotel(id))
        }

    }

}