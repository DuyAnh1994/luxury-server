package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(val code: Int, val msg: String? = null) {
    var data: T? = null
}