package br.com.eweather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import br.com.giocolombarolli.eweather.R
import br.com.giocolombarolli.eweather.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }
}