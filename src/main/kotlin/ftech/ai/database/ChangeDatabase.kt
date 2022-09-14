package ftech.ai.database

import java.sql.ResultSet

object ChangeDatabase {

    private lateinit var resultSet: ResultSet
    private val connection = Database().getConnection()
    private val statement = connection!!.createStatement()

    fun getData(sql: String): ResultSet {
        try {
            resultSet = statement.executeQuery(sql)
        } catch (e: Exception) {
            e.message
        }
        return resultSet
    }

    fun setData(sql: String): String {
        return try {
            statement.executeUpdate(sql)
            "Success"
        } catch (e: Exception) {
            e.message!!
        }
    }

}