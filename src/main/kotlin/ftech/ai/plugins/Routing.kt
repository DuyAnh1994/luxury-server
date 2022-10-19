package ftech.ai.plugins


import ftech.ai.factory.DaoFactory
import ftech.ai.model.*
import io.ktor.http.content.*
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
    val apiListBooking = DaoFactory.getListBooking()
    val apiListRoomSearch = DaoFactory.getSearchBook()
    val apiOrder = DaoFactory.getOrder()

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

        get("v1/home/hotel/list/booking/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiListBooking.getListBooking(id))
        }

        post("v1/home/hotel/payment") {
            val payment = call.receive<Payment>()
            call.respond(apiListBooking.getUpdateBooking(payment))
        }

        get("v1/home/hotel/user/history/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiListBooking.getHistory(id))
        }

        get("v1/search/booking/hotel") {
            val searchHotel = call.receive<SearchHotel>()
            call.respond(apiListRoomSearch.getSearchHotel(searchHotel))
        }

        get("v1/search/booking/room") {
            val searchRoom = call.receive<SearchRoom>()
            call.respond(apiListRoomSearch.getSearchRoom(searchRoom))
        }

        get("v1/insert") {
            call.respond(apiListRoomSearch.getInsert())
        }

        get("v1/food") {
            call.respond(apiOrder.getListFood())
        }
        get("v1/drink") {
            call.respond(apiOrder.getListDrink())
        }
        get("v1/location/receive") {
            call.respond(apiOrder.getListLocation())
        }

        get("v1/food/detail/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiOrder.getFoodDetail(id))
        }

        get("v1/drink/detail/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiOrder.getDrinkDetail(id))
        }

        post("v1/order") {
            val order = call.receive<Order>()
            call.respond(apiOrder.getOrder(order))
        }

        delete("v1/cancel/{id?}") {
            val id = call.parameters["id"]!!.toInt()
            call.respond(apiOrder.cancelOrder(id))
        }

    }

}