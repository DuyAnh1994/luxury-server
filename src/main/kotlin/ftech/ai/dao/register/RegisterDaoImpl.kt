package ftech.ai.dao.register

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*


class RegisterDaoImpl : IRegisterDao {


    override fun getUser(): MutableList<User> {
        val listUser: MutableList<User> = ArrayList()
        val sql = "Select * from user"
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            listUser.add(DataInfo.getUser(result))
        }

        return listUser
    }

    override fun insertUser(user: User): Response<MutableList<User>> {
        val sqlCheck = QuerySql.checkEmail(user.user_name)
        var check = 0
        val result = ChangeDatabase.getData(sqlCheck)
        while (result.next()) {
            check = result.getInt(1)
            break
        }
        return if (check != 1) {
            val sqlInsert = QuerySql.insertUser(user)
            if (ChangeDatabase.setData(sqlInsert) == "1") {
                val response = Response<MutableList<User>>(ResponseSuccess.code, ResponseSuccess.msg)
                response.data = getUser()
                response
            } else {
                Response(ResponseFail.code, ResponseFail.msg)
            }

        } else {
            Response(ResponseErrorEmail.code, ResponseErrorEmail.msg)
        }
    }

    override fun checkLogin(userName: String, password: String): Response<User> {
        val sqlCheckLogin = QuerySql.checkLogin(userName, password)
        val listUser: MutableList<User> = ArrayList()
        val result = ChangeDatabase.getData(sqlCheckLogin)


        while (result.next()) {
            listUser.add(DataInfo.getUser(result))
        }

        return if (listUser.size != 0) {
            val response = Response<User>(ResponseLoginSuccess.code, ResponseLoginSuccess.msg)
            response.data = listUser[0]
            response
        } else {
            Response(ResponseLoginFail.code, ResponseLoginFail.msg)
        }

    }

}