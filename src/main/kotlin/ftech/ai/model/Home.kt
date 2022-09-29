package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Home(
    val list_flight: MutableList<Flight>,
    val list_promotion: MutableList<Promotion>,
    val list_city: MutableList<City>

)

@Serializable
data class Flight(val id_flight: Int, val image_flight: String, val title_flight: String, val date_flight: String)

@Serializable
data class Promotion(val id_promotion: Int, val image_promotion: String)


@Serializable
data class City(val id_city: Int, val name: String,val image: String)
