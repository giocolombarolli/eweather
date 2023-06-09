package br.com.eweather.ui.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import br.com.giocolombarolli.eweather.R
import br.com.giocolombarolli.eweather.databinding.FragmentMainBinding


class HomeFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }
}