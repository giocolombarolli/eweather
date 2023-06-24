package br.com.eweather.data.network.api

import br.com.eweather.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GetTemperature {
    @GET("forecast")
    suspend fun getWeatherForecast(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String
    ): WeatherResponse
}