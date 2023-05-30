package com.example.fishidentifierfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fishidentifierfinalproject.databinding.FragmentExerciseListBinding
import com.example.fishidentifierfinalproject.databinding.FragmentMainBinding
import com.example.fishidentifierfinalproject.databinding.FragmentSignUpBinding

class ExerciseListFragment : Fragment() {

    private var _binding: FragmentExerciseListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseListBinding.inflate(inflater, container, false)



        return binding.root
    }

}