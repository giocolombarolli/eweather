package br.com.eweather.data.network
import br.com.eweather.data.network.api.GetTemperature
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OpenWeatherCall {
    private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    val weatherApi: GetTemperature by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(GetTemperature::class.java)
    }
}