package br.com.eweather.data.repository

import br.com.eweather.data.network.api.GetTemperature
import br.com.eweather.model.weatherResponse.WeatherData

class WeatherRepository(private val weatherApiService: GetTemperature) {
    suspend fun getWeatherData(latitude: Double, longitude: Double, key: String): WeatherData {
        return weatherApiService.getCurrentWeather(latitude, longitude, key)
    }
}