package com.example.realtimeweatherapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.realtimeweatherapp.api.Constant
import com.example.realtimeweatherapp.api.NetworkResponse
import com.example.realtimeweatherapp.api.RetrofitInstance
import com.example.realtimeweatherapp.api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val weatherAPI = RetrofitInstance.weatherAPI
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult : LiveData<NetworkResponse<WeatherModel>> = _weatherResult

    fun getData(city : String){
        _weatherResult.value = NetworkResponse.loading

        viewModelScope.launch {
            val response = weatherAPI.getWeather(
                Constant.apikey,
                city
            )

            try {
                if(response.isSuccessful){
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.success(it)
                    }
                }
                else {
                    _weatherResult.value = NetworkResponse.error("Failed to load data")
                }
            } catch (e: Exception){
                _weatherResult.value = NetworkResponse.error("Exception - Failed to load data")
            }
        }
    }
}