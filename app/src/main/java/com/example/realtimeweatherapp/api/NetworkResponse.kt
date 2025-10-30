package com.example.realtimeweatherapp.api

sealed class NetworkResponse<out T> {

    // T reffers to WeatherModel
    object loading : NetworkResponse<Nothing>()
    data class success<out T>(val data : T) : NetworkResponse<T>()
    data class error(val message: String) : NetworkResponse<Nothing>()
}