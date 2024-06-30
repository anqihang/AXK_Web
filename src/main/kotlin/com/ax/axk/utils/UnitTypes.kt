package com.ax.axk.utils

sealed class ListOrObj<T>() {
    data class Lis<T>(val value: List<T>) : ListOrObj<T>();
    data class Obj<T>(val value: T) : ListOrObj<T>();
}

sealed class ResponseType<T>() {
    data class Success<T>(val data: T) : ResponseType<T>();
    data class Error<T>(val error: String) : ResponseType<T>();
    data class Exception<T>(val error: String) : ResponseType<T>();
    data class Custom<T>(val data: T) : ResponseType<T>();
}