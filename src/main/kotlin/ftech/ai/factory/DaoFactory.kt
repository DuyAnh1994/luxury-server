package ftech.ai.factory

import ftech.ai.dao.home.HomeDaoImpl
import ftech.ai.dao.home.IHomeDao
import ftech.ai.dao.home.hoteldetail.DetailDaoImpl
import ftech.ai.dao.home.hoteldetail.IDetailDao
import ftech.ai.dao.register.IRegisterDao
import ftech.ai.dao.register.RegisterDaoImpl


object DaoFactory {

    private val registerDaoImpl = RegisterDaoImpl()
    private val homeDaoImpl = HomeDaoImpl()
    private val detailImpl = DetailDaoImpl()
    fun getRegisterDao(): IRegisterDao {
        return registerDaoImpl
    }

    fun getHomeDao(): IHomeDao {
        return homeDaoImpl
    }

    fun getDetailDao(): IDetailDao {
        return detailImpl
    }


}