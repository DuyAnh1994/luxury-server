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
    val apiHotelDetail = DaoFactory.getDetailDao()
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

        post("/home/flight") {
            val flight = call.receive<Flight>()
            call.respond(apiHome.insertFlight(flight))
        }


        post("/home/promotion") {
            val promotion = call.receive<Promotion>()
            call.respond(apiHome.insertPromotion(promotion))
        }


        post("/home/hotel") {
            val hotel = call.receive<Hotel>()
            call.respond(apiHome.insertHotel(hotel))
        }

        get("/hotel/detail/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiHotelDetail.getImageDetail(id))
        }

        get("/hotel/facilities/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiHotelDetail.getFacilities(id))
        }

        get("/hotel/policies/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiHotelDetail.getPolicies(id))
        }

        get("/hotel/description/{id?}") {
            val id = (call.parameters["id"])!!.toInt()
            call.respond(apiHotelDetail.getDescription(id))
        }

    }

}