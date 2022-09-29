package ftech.ai.model

import kotlinx.serialization.Serializable


@Serializable
data class Hotel(
    val id_hotel: Int,
    val name: String,
    val star: Float,
    val address: String,
    val rating_point: Float,
    val rating_count: Int,
    val smallest_room_price: Int,
    val image: String
)