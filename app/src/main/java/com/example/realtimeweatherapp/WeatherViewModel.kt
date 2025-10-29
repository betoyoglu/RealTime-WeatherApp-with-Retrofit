package com.example.realtimeweatherapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.realtimeweatherapp.api.Constant
import com.example.realtimeweatherapp.api.RetrofitInstance
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val weatherAPI = RetrofitInstance.weatherAPI

    fun getData(city : String){
        viewModelScope.launch {
            val response = weatherAPI.getWeather(
                Constant.apikey,
                city
            )

            if(response.isSuccessful){
                Log.i("response:" , response.body().toString())
            }
            else {
                Log.i("error:" , response.message())
            }
        }
    }
}