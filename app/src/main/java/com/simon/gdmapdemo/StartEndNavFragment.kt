package com.simon.gdmapdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.simon.gdmapdemo.databinding.FragmentSenavBinding

class StartEndNavFragment : Fragment(R.layout.fragment_senav) {

    lateinit var binding: FragmentSenavBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSenavBinding.bind(view)
    }
}