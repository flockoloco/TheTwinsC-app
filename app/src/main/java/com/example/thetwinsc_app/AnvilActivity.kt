package com.example.thetwinsc_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thetwinsc_app.databinding.FragmentAnvilBinding


class AnvilActivity : Fragment() {

    lateinit var binding: FragmentAnvilBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnvilBinding.inflate(inflater)
        return (binding.root)
    }
}