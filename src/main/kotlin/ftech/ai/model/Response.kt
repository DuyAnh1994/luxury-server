package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(val code: Int, val msg: String) {
    var data: T? = null
}

object ResponseFail {
    const val CODE: Int = -1
    const val MSG: String = "Register Fail"
}

object ResponseSuccess {
    const val CODE: Int = 0
    const val MSG: String = "Register Success"
}

object ResponseErrorEmail {
    const val CODE: Int = -2
    const val MSG: String = "Email Error"
}

object ResponseLoginFail {
    const val CODE: Int = -1
    const val MSG: String = "Login Fail"
}


object ResponseLoginSuccess {
    const val CODE: Int = 0
    const val MSG: String = "Login Success"
}

object Success {
    const val CODE: Int = 0
    const val MSG: String = "Success"
}

object Fail {
    const val CODE: Int = -1
    const val MSG: String = "Fail"
}




