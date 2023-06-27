package br.com.eweather.ui.view.home

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import br.com.eweather.ui.viewmodel.HomeViewModel
import br.com.giocolombarolli.eweather.R
import br.com.giocolombarolli.eweather.databinding.FragmentMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber


class HomeFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding
    private val viewModel by viewModels<HomeViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            Timber.i("Chamando o getCurrentTemperature!!!")
            viewModel.getCurrentTemperature()
        }
    }
}