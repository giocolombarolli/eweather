package br.com.eweather.data.network.module

import br.com.eweather.data.network.api.GetTemperature
import br.com.eweather.data.repository.WeatherRepository
import br.com.eweather.ui.viewmodel.HomeViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideWeatherApiService(): GetTemperature {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/") // Substitua pela URL base real da API
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(GetTemperature::class.java)
    }

    @Provides
    fun provideWeatherRepository(weatherApiService: GetTemperature): WeatherRepository {
        return WeatherRepository(weatherApiService)
    }

    @Provides
    fun provideWeatherViewModel(weatherRepository: WeatherRepository): HomeViewModel {
        return HomeViewModel(weatherRepository)
    }
}

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    fun provideApiService(tinyDb: SharedTurboDb): ApiService {
        //TODO alterar baseurl para dinamica
        val baseUrl = tinyDb.getString("tcopUrl")
        Timber.i("baseUrl no retrofit: $baseUrl")
        val tokenUrl = "$baseUrl/"
        Timber.i("tokenUrl no retrofit: $tokenUrl")

        val retrofit = Retrofit.Builder()
            .baseUrl(tokenUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(ApiService::class.java)
    }
}