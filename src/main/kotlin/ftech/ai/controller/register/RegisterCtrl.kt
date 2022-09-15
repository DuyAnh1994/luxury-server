package ftech.ai.controller.register

import ftech.ai.factory.DaoFactory
import ftech.ai.model.*

class RegisterCtrl {

    private val registerDao = DaoFactory.getRegisterDao()
    fun apiUser(user: User): Response<User> {

        when (registerDao.insertUser(user)) {
            1 -> {
                val response = Response<User>(ResponseSuccess.code, ResponseSuccess.msg)
                response.data = registerDao.getUser()[0]
                return response
            }

            0 -> {
                return Response(ResponseFail.code, ResponseFail.msg)
            }

            -1 -> {
                return Response(ResponseErrorEmail.code, ResponseErrorEmail.msg)
            }

            else -> {
                return Response(ResponseFail.code, ResponseFail.msg)
            }
        }

    }


}