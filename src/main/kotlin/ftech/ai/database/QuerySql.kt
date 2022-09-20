package ftech.ai.database

import ftech.ai.model.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


object QuerySql {
    private const val tbUser: String = "travelluxury.user"
    private const val tbFlight: String = "travelluxury.flight"
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


    fun checkEmail(email: String): String {
        return "select count(userID) as sl from ${tbUser} group by travelluxury.user.userName having travelluxury.user.userName = '${email}'"
    }

    fun insertUser(user: User): String {
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

    fun insertFlight(flight: Flight): String {
        val stringDate = flight.date_flight
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH)
        val date = LocalDate.parse(stringDate, formatter)
        return "Insert Into ${tbFlight}(image,title,date) Values('${flight.image_flight}','${flight.title_flight}','${date}')"
    }

    fun getPromotion(): String {
        return "Select * from ${tbPromotion}"
    }

    fun insertPromotion(promotion: Promotion): String {
        return "Insert Into ${tbPromotion}(image) Values('${promotion.image_promotion}')"
    }

    fun getHotel(): String {
        return "Select * from ${tbHotel}"
    }

    fun insertHotel(hotel: Hotel): String {
        return "Insert Into ${tbHotel}(name,image,accommodationPolicies,description,star) Values('${hotel.name_hotel}','${hotel.image_hotel}','${hotel.accommodationPolicies_hotel}','${hotel.description_hotel}','${hotel.star_home}')"
    }

    fun sqlImageDetail(id: Int): String {
        return "Select * From ${tbImageDetail} where ${tbImageDetail}.idHotel = '${id}'"
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
        return "Select ${tbHotel}.hotelId,${tbHotel}.name,${tbHotel}.star, ${tbAddress}.detail  From  ${tbHotel} INNER JOIN ${tbAddress} ON ${tbHotel}.hotelId = ${tbAddress}.hotelId" +
                " where ${tbHotel}.hotelId = '${id}'"
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
        return "Select ${tbRoom}.roomId,${tbRoom}.name,${tbRoom}.currentPrice,${tbRoom}.description," +
                "${tbRoomDetail}.maxGuest,${tbRoomDetail}.bedType,${tbRoomDetail}.breakFast,${tbRoomDetail}.refundable " +
                "from ${tbRoom} Inner join ${tbRoomDetail} On ${tbRoom}.roomId = ${tbRoomDetail}.idRoom where ${tbRoom}.idHotel = '${id}'"
    }

    fun sqlImageRoom(id: Int): String {
        return "Select ${tbImageDetail}.url,${tbImageDetail}.idRoom from ${tbImageDetail} where ${tbImageDetail}.idHotel = '${id}'"
    }
}