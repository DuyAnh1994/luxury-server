package ftech.ai.database

import ftech.ai.model.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


object QuerySql {
    private const val tbUser: String = "travelluxury.user"
    private const val tbFlight: String = "travelluxury.flight"
    private const val tbCity: String = "travelluxury.city"
    private const val tbPromotion: String = "travelluxury.promotion"
    private const val tbHotel: String = "travelluxury.hotel"
    private const val tbImageDetail: String = "travelluxury.image"
    private const val tbRating: String = "travelluxury.rating"
    private const val tbFacilities: String = "travelluxury.facilitieshotel"
    private const val tbPolicies: String = "travelluxury.policies"
    private const val tbDescription: String = "travelluxury.descriptionhotel"
    private const val tbAddress: String = "travelluxury.address"
    private const val tbReview: String = "travelluxury.review"
    private const val tbRoom: String = "travelluxury.room"
    private const val tbRoomDetail: String = "travelluxury.roomdetail"
    private const val tbRoomFacilities: String = "travelluxury.roomfacilities"
    private const val tbFacilitiesRoom: String = "travelluxury.facilities"
    private const val tbRoomFeature: String = "travelluxury.roomfeature"
    private const val tbBathroom: String = "travelluxury.bathroom"
    private const val tbBooking: String = "travelluxury.booking"
    private const val tbPayment: String = "travelluxury.payment"


    fun checkEmail(email: String): String {
        return "select count(userID) as sl from ${tbUser} group by travelluxury.user.userName having travelluxury.user.userName = '${email}'"
    }

    fun insertUser(user: UserRegister): String {
        val stringDate = user.birthday
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH)
        val birthday = LocalDate.parse(stringDate, formatter)
        return "insert into ${tbUser}(userName,password,fullName,gender,phoneNumber,birthday) values('${user.user_name}','${user.password}','${user.full_name}','${user.gender}','${user.phone_number}','${birthday}')"
    }

    fun checkLogin(username: String, password: String): String {
        return "select * from ${tbUser} Where ${tbUser}.userName = '${username}' AND ${tbUser}.password = '${password}'"
    }

    fun getFlight(): String {
        return "Select * from ${tbFlight}"
    }

    fun getPromotion(): String {
        return "Select * from ${tbPromotion}"
    }

    fun getCity(): String {
        return "Select * from ${tbCity}"
    }

    fun sqlHotel(id: Int): String {
        return ""
    }


    fun sqlImageDetail(id: Int): String {
        return "Select * From ${tbImageDetail} where ${tbImageDetail}.idHotel = '${id}' AND ${tbImageDetail}.idRoom = 0"
    }


    fun sqlRating(id: Int): String {
        return "Select * From ${tbRating} where ${tbRating}.idHotel = '${id}'"
    }

    fun sqlCountReview(id: Int): String {
        return "Select count(${tbReview}.id) from ${tbReview} group by ${tbReview}.hotelId having ${tbReview}.hotelId = ${id}"
    }

    fun sqlSumRatingReview(id: Int): String {
        return "Select Sum(${tbReview}.rating) from ${tbReview} group by ${tbReview}.hotelId having ${tbReview}.hotelId = ${id}"
    }

    fun sqlUpdateRating(point: Float, count: Int, id: Int): String {
        return "UPDATE ${tbRating} Set ${tbRating}.point = '${point}',${tbRating}.count = '${count}' Where ${tbRating}.idHotel = '${id}'"
    }


    fun sqlHotelInfo(id: Int): String {
        return "Select ${tbHotel}.hotelId,${tbHotel}.name,${tbHotel}.star, ${tbAddress}.detail  From  ${tbHotel} INNER JOIN ${tbAddress} ON ${tbHotel}.hotelId = ${tbAddress}.hotelId" + " where ${tbHotel}.hotelId = '${id}'"
    }

    fun sqlFacilities(id: Int): String {
        return "Select * From ${tbFacilities} where ${tbFacilities}.idHotel = '${id}'"
    }

    fun sqlPolicies(id: Int): String {
        return "Select * From ${tbPolicies} where ${tbPolicies}.idHotel = '${id}'"
    }

    fun sqlDescription(id: Int): String {
        return "Select * From ${tbDescription} where ${tbDescription}.idHotel = '${id}'"
    }

    fun sqlRoom(id: Int): String {
        return """
                Select ${tbRoom}.roomId,${tbRoom}.name,${tbRoom}.currentPrice,
                ${tbRoomDetail}.maxGuest,${tbRoomDetail}.bedType,${tbRoomDetail}.breakFast,${tbRoomDetail}.refundable, ${tbRoomDetail}.formula,${tbRoomDetail}.sell
                from ${tbRoom} Inner join ${tbRoomDetail} On ${tbRoom}.roomId = ${tbRoomDetail}.idRoom where ${tbRoom}.idHotel = '${id}'
        """.trimIndent()

    }

    fun sqlImageRoom(id: Int): String {
        return "Select ${tbImageDetail}.url,${tbImageDetail}.idRoom from ${tbImageDetail} where ${tbImageDetail}.idHotel = '${id}'"
    }

    fun sqlRoomInfo(id: Int): String {
        return """
                 Select ${tbRoom}.roomId,${tbRoom}.name,${tbRoomDetail}.maxGuest,
                ${tbRoomDetail}.roomSize,${tbRoomDetail}.bedType,${tbRoomFacilities}.extraBenefit,${tbRoomFacilities}.reschedule,${tbRoomDetail}.formula,${tbRoomDetail}.sell
                from (${tbRoom} Inner join ${tbRoomDetail} On ${tbRoom}.roomId = ${tbRoomDetail}.idRoom ) Inner Join ${tbRoomFacilities}
                 On ${tbRoom}.roomId = ${tbRoomFacilities}.idRoom where ${tbRoom}.roomId = '${id}'
        """.trimIndent()

    }

    fun sqlImageRoomDetail(id: Int): String {
        return "Select ${tbImageDetail}.url From ${tbImageDetail} Where ${tbImageDetail}.idRoom = '${id}'"
    }

    fun sqlRoomFeature(id: Int): String {
        return "Select ${tbRoomFeature}.name from ${tbRoomFeature} where ${tbRoomFeature}.idRoom = '${id}'"
    }

    fun sqlRoomFacilities(id: Int): String {
        return "Select ${tbFacilitiesRoom}.name from ${tbFacilitiesRoom} where ${tbFacilitiesRoom}.idRoom ='${id}'"
    }

    fun sqlBathroom(id: Int): String {
        return "Select ${tbBathroom}.name from ${tbBathroom} where ${tbBathroom}.idRoom = '${id}'"
    }

    fun sqlListHotel(id: Int): String {

        return """
            SELECT ${tbHotel}.hotelId, ${tbHotel}.name,${tbHotel}.star,${tbAddress}.detail,${tbRating}.point,${tbRating}.count , ${tbRoom}.currentPrice, ${tbHotel}.image 
                             from ((${tbHotel} inner join ${tbAddress} on ${tbHotel}.hotelId = ${tbAddress}.hotelId) inner join 
                            ${tbRating} on ${tbHotel}.hotelId = ${tbRating}.idHotel ) inner join ${tbRoom} on ${tbHotel}.hotelId = ${tbRoom}.idHotel 
                             where ${tbHotel}.idCity = '${id}' AND ( ${tbRoom}.idHotel ,${tbRoom}.currentPrice )  IN (Select ${tbRoom}.idHotel, Min(${tbRoom}.currentPrice) from ${tbRoom} Group by ${tbRoom}.idHotel) 
        """.trimIndent()

    }

    fun sqlListBooking(id: Int): String {
        return "select userID,roomID, checkin, checkout from travelluxury.booking   where travelluxury.booking.roomID = '${id}' order by travelluxury.booking.checkout desc "
    }

    fun sqlInsertBooking(booking: Booking): String {
        return """
          insert into travelluxury.booking(userID,roomID,status,mgsStatus,checkin,checkout)
           value('${booking.user_id}','${booking.room_id}','1','Chờ xác nhận','${booking.checkin}','${booking.checkout}')
     """.trimIndent()
    }

    fun sqlBooking(id: Int): String {
        return """
           select bookingID,travelluxury.city.name,travelluxury.hotel.name,travelluxury.room.name,travelluxury.hotel.image,checkin,checkout,currentPrice,status,mgsStatus from travelluxury.booking inner join travelluxury.room on travelluxury.booking.roomID = travelluxury.room.roomId inner join
           travelluxury.hotel on travelluxury.room.idHotel = travelluxury.hotel.hotelId inner join travelluxury.city on travelluxury.city.cityId = travelluxury.hotel.idCity where travelluxury.booking.userID = '${id}'
        """.trimIndent()
    }

    fun sqlUpdate(status: Int, msgStatus: String, idBooking: Int): String {
        return """
            update travelluxury.booking set travelluxury.booking.status = '${status}', travelluxury.booking.mgsStatus = '${msgStatus}' where travelluxury.booking.bookingID = '${idBooking}';
        """.trimIndent()
    }

    fun sqlHistory(id: Int): String {
        return "select * from travelluxury.payment where travelluxury.payment.userID = '${id}' "
    }
}