package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Home(
    val listFlight: MutableList<Flight>,
    val listPromotion: MutableList<Promotion>,
    val listHotel: MutableList<Hotel>

)

@Serializable
data class Flight(val id_flight: Int, val image_flight: String, val title_flight: String, val date_flight: String)

@Serializable
data class Promotion(val id_promotion: Int, val image_promotion: String)

@Serializable
data class Hotel(
    val id_hotel: Int,
    val name_hotel: String,
    val image_hotel: String,
    val accommodationPolicies_hotel: String,
    val description_hotel: String,
    val star_home: Float
)