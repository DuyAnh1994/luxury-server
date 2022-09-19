package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class HotelDetail(
    val listImage: MutableList<String>,
    val hotelInfo: HotelInfo,
    val rating: Rating,
    val listFacilities: MutableList<String>,
    val listPolicies: MutableList<Policies>,
    val listDescription: MutableList<String>
)

@Serializable
data class HotelInfo(val id: Int, val name: String, val star: Float, val address: String)

@Serializable
data class Rating(val point: Float, val count: Int)

@Serializable
data class Policies(val type: String, val description: String)




