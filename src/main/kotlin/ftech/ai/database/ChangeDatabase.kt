package ftech.ai.database

import java.sql.ResultSet
import java.sql.Statement

object ChangeDatabase {

    private lateinit var resultSet: ResultSet
    private val connection = Database().getConnection()
    private val statement: Statement =
        connection!!.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)

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
            "1"
        } catch (e: Exception) {
            e.message!!
        }
    }

}