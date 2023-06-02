package com.example.fishidentifierfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.fishidentifierfinalproject.databinding.FragmentMuscleChooseBinding


class MuscleChooseFragment : Fragment() {

    private var _binding: FragmentMuscleChooseBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ExerciseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMuscleChooseBinding.inflate(inflater, container, false)

        binding.armsButton.setOnClickListener {
//            send arms list via safe args to main fragment and use adapter there to pass arms list to set recycler view
//            val action = MuscleChooseFragmentDirections.actionMuscleChooseFragment2ToMainFragment(PASS ARGS INTO HERE)
//            binding.root.findNavController().navigate(action)
//            val adapter = ExerciseAdapter(viewModel.armsList)
//            binding.recyclerView.adapter = adapter
        }

        return binding.root
    }

}