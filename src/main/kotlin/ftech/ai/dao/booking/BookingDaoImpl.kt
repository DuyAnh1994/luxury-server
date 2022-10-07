package ftech.ai.dao.booking

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*


class BookingDaoImpl : IBookingDao {

    var check = false
    var page = 0

    override fun getListBooking(id: Int): Response<MutableList<Booking>> {
        val sql = QuerySql.sqlListBooking(id)
        val listBooking: MutableList<Booking> = ArrayList()
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            listBooking.add(DataInfo.getBooking(result))
        }
        val response = Response<MutableList<Booking>>(Success.CODE, Success.MSG)
        response.data = listBooking
        return response
    }

    override fun getBooking(booking: Booking): Response<MutableList<BookingInfo>> {
        val sqlInsert = QuerySql.sqlInsertBooking(booking)
        ChangeDatabase.setData(sqlInsert)

        if (check) {
            page += 5
        } else {
            page = 0
        }
        val sqlBooking = QuerySql.sqlBooking(booking.user_id, page)
        val listBook: MutableList<BookingInfo> = ArrayList()
        val result = ChangeDatabase.getData(sqlBooking)
        while (result.next()) {
            listBook.add(DataInfo.getBookingInfo(result))
        }
        check = listBook.size > 0
        val response = Response<MutableList<BookingInfo>>(Success.CODE, Success.MSG)
        response.data = listBook
        return response
    }

    override fun getUpdateBooking(status: Int, msgStatus: String, idBooking: Int): Response<String> {
        val sql = QuerySql.sqlUpdate(status, msgStatus, idBooking)
        ChangeDatabase.setData(sql)
        val response = Response<String>(Success.CODE, Success.MSG)
        response.data = "Update thành công"
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