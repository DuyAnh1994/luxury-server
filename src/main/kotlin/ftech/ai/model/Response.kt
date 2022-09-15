package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(val code: Int, val msg: String? = null) {
    var data: T? = null
}

object ResponseFail {
    const val code: Int = 0
    const val msg: String = "Login Fail"
}

object ResponseSuccess {
    const val code: Int = 1
    const val msg: String = "Login Success"
}

object ResponseErrorEmail {
    const val code: Int = -1
    const val msg: String = "Email Error"
}


