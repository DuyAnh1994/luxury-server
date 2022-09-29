package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class HotelDetail(
    val list_image: MutableList<String>,
    val hotel_info: HotelInfo,
    val rating: Rating,
    val list_facilities: MutableList<String>,
    val list_policies: MutableList<Policies>,
    val list_description: MutableList<String>
)

@Serializable
data class HotelInfo(val id: Int, val name: String, val star: Float, val address: String)

@Serializable
data class Rating(val point: Float, val count: Int)

@Serializable
data class Policies(val type: String, val description: String)




