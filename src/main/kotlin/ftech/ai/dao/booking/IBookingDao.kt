package ftech.ai.dao.booking

import ftech.ai.model.Booking
import ftech.ai.model.BookingInfo
import ftech.ai.model.Payment
import ftech.ai.model.Response

interface IBookingDao {
    fun getListBooking(id: Int): Response<MutableList<Booking>>
    fun getBooking(booking: Booking): Response<MutableList<BookingInfo>>
    fun getUpdateBooking(status: Int, msgStatus: String, idBooking: Int): Response<String>
    fun getHistory(id: Int) :  Response<MutableList<Payment>>
}