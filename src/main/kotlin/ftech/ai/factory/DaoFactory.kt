package ftech.ai.factory

import ftech.ai.dao.home.HomeDaoImpl
import ftech.ai.dao.home.IHomeDao
import ftech.ai.dao.home.hotel.HotelDaoImpl
import ftech.ai.dao.home.hotel.IHotelDao
import ftech.ai.dao.home.hotel.hoteldetail.HotelDetailDaoImpl
import ftech.ai.dao.home.hotel.hoteldetail.IHotelDetailDao
import ftech.ai.dao.home.room.IRoomDao
import ftech.ai.dao.home.room.RoomDaoImpl
import ftech.ai.dao.home.room.roomdetail.IRoomDetailDao
import ftech.ai.dao.home.room.roomdetail.RoomDetailDaoImpl
import ftech.ai.dao.register.IRegisterDao
import ftech.ai.dao.register.RegisterDaoImpl


object DaoFactory {

    private val registerDaoImpl = RegisterDaoImpl()
    private val homeDaoImpl = HomeDaoImpl()
    private val detailDaoImpl = HotelDetailDaoImpl()
    private val roomDaoImpl = RoomDaoImpl()
    private val roomDetailDaoImpl = RoomDetailDaoImpl()
    private val hotelDaoImpl = HotelDaoImpl()
    fun getRegisterDao(): IRegisterDao {
        return registerDaoImpl
    }

    fun getHomeDao(): IHomeDao {
        return homeDaoImpl
    }

    fun getHotelDetailDao(): IHotelDetailDao {
        return detailDaoImpl
    }

    fun getRoomDao(): IRoomDao {
        return roomDaoImpl
    }

    fun getRoomDetail(): IRoomDetailDao {
        return roomDetailDaoImpl
    }

    fun getListHotel(): IHotelDao {
        return hotelDaoImpl
    }


}