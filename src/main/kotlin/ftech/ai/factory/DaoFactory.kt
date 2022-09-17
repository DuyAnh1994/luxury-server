package ftech.ai.factory

import ftech.ai.dao.register.IRegisterDao
import ftech.ai.dao.register.RegisterDaoImpl


object DaoFactory {

    private val registerDaoImpl = RegisterDaoImpl()

    fun getRegisterDao(): IRegisterDao {
        return registerDaoImpl
    }


}