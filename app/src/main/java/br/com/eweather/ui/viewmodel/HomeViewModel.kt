package br.com.eweather.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.eweather.data.repository.WeatherRepository
import br.com.eweather.model.weatherResponse.WeatherData
import kotlinx.coroutines.launch

class HomeViewModel(private val weatherRepository: WeatherRepository) : ViewModel() {

    val TAG = "HomeViewModel"

    private val _weatherData = MutableLiveData<WeatherData>()
    val weatherData: LiveData<WeatherData> get() = _weatherData

    fun getCurrentTemperature(latitude: Double, longitude: Double, key: String) {
        viewModelScope.launch {
            try {
                val result = weatherRepository.getWeatherData(latitude, longitude, key)
                _weatherData.value = result
            } catch (e: Exception) {
                // Lidar com erros de requisição
            }
        }
    }



}