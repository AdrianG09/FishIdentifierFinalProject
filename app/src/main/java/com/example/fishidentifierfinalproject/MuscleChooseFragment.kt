package com.example.fishidentifierfinalproject

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.fishidentifierfinalproject.databinding.FragmentMuscleChooseBinding
import com.google.firebase.auth.FirebaseAuth


class MuscleChooseFragment : Fragment() {

    private var _binding: FragmentMuscleChooseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMuscleChooseBinding.inflate(inflater, container, false)

        binding.armsButton.setOnClickListener {
            val action = MuscleChooseFragmentDirections.actionMuscleChooseFragment2ToMainFragment("arms")
            binding.root.findNavController().navigate(action)
        }

        binding.chestButton.setOnClickListener {
            val action = MuscleChooseFragmentDirections.actionMuscleChooseFragment2ToMainFragment("chest")
            binding.root.findNavController().navigate(action)
        }

        binding.legsButton.setOnClickListener{
            val action = MuscleChooseFragmentDirections.actionMuscleChooseFragment2ToMainFragment("legs")
            binding.root.findNavController().navigate(action)
        }

        binding.backButton.setOnClickListener {
            val action = MuscleChooseFragmentDirections.actionMuscleChooseFragment2ToMainFragment("back")
            binding.root.findNavController().navigate(action)
        }

        return binding.root
    }

}