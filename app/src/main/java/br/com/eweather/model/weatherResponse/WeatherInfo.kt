package br.com.eweather.model.weatherResponse

data class WeatherInfo(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)
