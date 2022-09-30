package ftech.ai.model

import java.util.Date

data class Booking(val userId: Int, val roomId: Int, val checkin: String, val checkout: String)

data class BookingInfo(
    val bookingId: Int,
    val nameCity: String,
    val nameHotel: String,
    val nameRoom: String,
    val checkin: Date,
    val checkout: Date,
    val priceRoom: Double,
    val status: Int,
    val msgStatus: String
)
