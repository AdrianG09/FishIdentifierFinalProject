package com.example.fishidentifierfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fishidentifierfinalproject.databinding.FragmentChestBinding
import com.example.fishidentifierfinalproject.databinding.FragmentLegsBinding

class LegsFragment : Fragment() {

    private var _binding: FragmentLegsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLegsBinding.inflate(inflater, container, false)



        return binding.root
    }

}