package br.com.eweather.model.weatherResponse

data class WeatherData(
    val dt: Long,
    val main: MainWeatherInfo,
    val weather: List<WeatherInfo>,
    val clouds: CloudsInfo,
    val wind: WindInfo,
    val visibility: Int,
    val pop: Int,
    val sys: SysInfo,
    val dt_txt: String
)
