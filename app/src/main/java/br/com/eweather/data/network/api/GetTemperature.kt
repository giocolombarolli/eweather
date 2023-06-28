package br.com.eweather.data.network.api

import br.com.eweather.model.weatherResponse.WeatherData
import br.com.eweather.model.weatherResponse.WeatherInfo
import br.com.eweather.model.weatherResponse.WeatherResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GetTemperature {
    @GET("forecast")
    suspend fun getCurrentWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String
    ): WeatherData
}