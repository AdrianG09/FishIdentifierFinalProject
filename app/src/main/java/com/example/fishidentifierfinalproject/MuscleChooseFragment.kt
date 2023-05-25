package com.example.fishidentifierfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fishidentifierfinalproject.databinding.FragmentLegsBinding
import com.example.fishidentifierfinalproject.databinding.FragmentMuscleChooseBinding

class MuscleChooseFragment : Fragment() {

    private var _binding: FragmentMuscleChooseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMuscleChooseBinding.inflate(inflater, container, false)



        return binding.root
    }

}