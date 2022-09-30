package ftech.ai.plugins


import ftech.ai.factory.DaoFactory
import ftech.ai.model.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.awt.print.Book

fun Application.configureRouting() {

    val apiRegister = DaoFactory.getRegisterDao()
    val apiHome = DaoFactory.getHomeDao()
    val apiHotelDetail = DaoFactory.getHotelDetailDao()
    val apiRoom = DaoFactory.getRoomDao()
    val apiRoomDetail = DaoFactory.getRoomDetail()
    val apiListHotel = DaoFactory.getListHotel()
    val apiListBooking = DaoFactory.getListBooking()
    routing {
        post("/v1/register") {
            val user = call.receive<UserRegister>()
            call.respond(apiRegister.insertUser(user))
        }

        post("/v1/login/{username?}/{password?}") {
            val userName = call.parameters["username"]
            val password = call.parameters["password"]

            call.respond(apiRegister.checkLogin(userName!!, password!!))
        }

        get("/v1/home") {
            call.respond(apiHome.getHome())
        }


        get("v1/home/hotel/detail/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiHotelDetail.hotelDetail(id))
        }

        get("v1/home/room/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiRoom.getRoom(id))
        }

        get("v1/home/room/detail/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiRoomDetail.getRoomDetail(id))
        }

        get("v1/home/city/hotel/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiListHotel.getHotel(id))
        }
        post("v1/home/hotel/booking") {
            val booking = call.receive<Booking>()
          //  call.respond(apiListBooking.getBooking())
        }

    }

}