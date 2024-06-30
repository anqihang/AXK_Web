package com.ax.axk.utils

sealed class Response() {
    data class Success(val data: Any) : Response()
    data class Error(val error: Any) : Response()
    data class Exception(val error: Throwable) : Response()
    data class Custom<T>(val data: T) : ResponseType<T>();
}