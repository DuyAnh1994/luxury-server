package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Booking(val user_id: Int, val room_id: Int, val checkin: String, val checkout: String)

@Serializable
data class BookingInfo(
    val booking_id: Int,
    val name_city: String,
    val name_hotel: String,
    val name_room: String,
    val image_room: String,
    val check_in: String,
    val check_out: String,
    val price_room: Double,
    val status: Int,
    val msg_status: String
)

@Serializable
data class Payment(
    val payment_id: Int,
    val user_id: Int,
    val room_id: Int,
    val check_in: String,
    val checkout: String,
    val price: Double
)

data class ImageInsert(val url: String, val id: Int)

@Serializable
data class SearchHotel(val idCity: Int, val checkin: String, val checkout: String, val default: Int)

@Serializable
data class SearchRoom(val idHotel: Int, val checkin: String, val checkout: String, val default: Int)