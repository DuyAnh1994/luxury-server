package ftech.ai.plugins


import ftech.ai.database.ChangeDatabase
import ftech.ai.factory.DaoFactory
import ftech.ai.model.*
import io.ktor.http.*
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
            call.respond(apiListBooking.getBooking(booking))
        }

        post("v1/home/hotel/list/booking/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiListBooking.getListBooking(id))
            call.respond(apiListBooking.getListBooking(id))
            call.respond(apiListBooking.getListBooking(id))
            call.respond(apiListBooking.getListBooking(id))
            call.respond(apiListBooking.getListBooking(id))
            call.respond(apiListBooking.getListBooking(id))
        }

        post("v1/home/hotel/list/update/booking/{status?}/{msgStatus?}/{idBooking?}") {
            val status = call.parameters["status"]!!.toInt()
            val msgStatus = call.parameters["msgStatus"]!!
            val idBooking = call.parameters["idBooking"]!!.toInt()

            call.respond(apiListBooking.getUpdateBooking(status, msgStatus, idBooking))
        }

        post("v1/home/hotel/user/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiListBooking.getHistory(id))
        }
    }

}