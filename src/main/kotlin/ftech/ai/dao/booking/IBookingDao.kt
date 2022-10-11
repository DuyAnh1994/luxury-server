package ftech.ai.dao.booking

import ftech.ai.model.*

interface IBookingDao {
    fun getListBooking(id: Int): Response<MutableList<BookingInfo>>
    fun getBooking(booking: Booking): Response<MutableList<BookingInfo>>
    fun getUpdateBooking(payment: Payment): Response<String>
    fun getHistory(id: Int): Response<MutableList<Payment>>
}