package br.com.eweather.ui.viewmodel

import androidx.lifecycle.ViewModel
import br.com.eweather.data.network.OpenWeatherCall

import br.com.eweather.model.weatherResponse.WeatherResponse
import timber.log.Timber

class HomeViewModel : ViewModel() {
    private val latitude = -23.5502949
    private val longitude = -46.7770339
    private val appId = "c2a208e436f48819b7ba5c661b6611cb"
    val TAG = "HomeViewModel"


    fun getCurrentTemperature(): WeatherResponse? {
        try {
            val response = OpenWeatherCall.weatherApi.getCurrentWeather(latitude, longitude, appId)
            if (response.isSuccessful) {
                val weatherResponse = response.body()
                Timber.i("Logando o weatherResponse: $weatherResponse")
                // Processar a resposta e retornar as informações necessárias
            } else {
                Timber.tag(TAG).e("Error: %s", response.code())
            }
        } catch (e: Exception) {
            Timber.tag(TAG).e(e, "Error getting current temperature")
        }
        return null
    }

}