package com.example.thetwinsc_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thetwinsc_app.databinding.FragmentAnvilBinding
import com.example.thetwinsc_app.databinding.FragmentMineBinding


class MineActivity : Fragment() {

    lateinit var binding: FragmentMineBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMineBinding.inflate(inflater)
        return (binding.root)
    }
}