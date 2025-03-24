package com.truecaller.utils

sealed class ResponseHelper<out T> {
    data class Success<T>(val data: T) : ResponseHelper<T>()
    data class Error(val message: String) : ResponseHelper<Nothing>()
    object Loading : ResponseHelper<Nothing>()
}
