package br.com.eweather.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.giocolombarolli.eweather.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}