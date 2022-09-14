package ftech.ai.factory

import ftech.ai.dao.register.IUserDao
import ftech.ai.dao.register.UserDaoImpl

object DaoFactory {

    private val userDaoImpl = UserDaoImpl()

    fun getUserDao() : IUserDao{
        return userDaoImpl
    }

}