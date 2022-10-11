package ftech.ai.dao.booking

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*


class BookingDaoImpl : IBookingDao {


    override fun getListBooking(id: Int): Response<MutableList<BookingInfo>> {
        val sql = QuerySql.sqlBooking(id)
        val listBooking: MutableList<BookingInfo> = ArrayList()
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            listBooking.add(DataInfo.getBookingInfo(result))
        }
        val response = Response<MutableList<BookingInfo>>(Success.CODE, Success.MSG)
        response.data = listBooking
        return response
    }

    override fun getBooking(booking: Booking): Response<MutableList<BookingInfo>> {
        val sqlInsert = QuerySql.sqlInsertBooking(booking)
        ChangeDatabase.setData(sqlInsert)
        val sqlBooking = QuerySql.sqlBooking(booking.user_id)
        val listBook: MutableList<BookingInfo> = ArrayList()
        val result = ChangeDatabase.getData(sqlBooking)
        while (result.next()) {
            listBook.add(DataInfo.getBookingInfo(result))
        }
        val response = Response<MutableList<BookingInfo>>(Success.CODE, Success.MSG)
        response.data = listBook
        return response
    }

    override fun getUpdateBooking(payment: Payment): Response<String> {
        val sql = QuerySql.sqlDelete(payment)
        ChangeDatabase.setData(sql)
        val sqlInsert = QuerySql.sqlInsertHistory(payment)
        ChangeDatabase.setData(sqlInsert)
        val response = Response<String>(Success.CODE, Success.MSG)
        response.data = "Thanh toán thành công"
        return response
    }

    override fun getHistory(id: Int): Response<MutableList<Payment>> {
        val sql = QuerySql.sqlHistory(id)
        val result = ChangeDatabase.getData(sql)
        val listBooked: MutableList<Payment> = ArrayList()
        while (result.next()) {
            listBooked.add(DataInfo.getHistory(result))
        }

        val response = Response<MutableList<Payment>>(Success.CODE, Success.MSG)
        response.data = listBooked
        return response
    }
}