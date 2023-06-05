package com.example.fishidentifierfinalproject

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.fishidentifierfinalproject.databinding.FragmentMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ExerciseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        val args = MainFragmentArgs.fromBundle(requireArguments())

        if(args.muscleType == "arms") {
            val adapter = ExerciseAdapter(viewModel.armsList)
            binding.recyclerView.adapter = adapter
        }

        else if(args.muscleType == "chest") {
            val adapter = ExerciseAdapter(viewModel.chestList)
            binding.recyclerView.adapter = adapter
        }

        else if(args.muscleType == "legs") {
            val adapter = ExerciseAdapter(viewModel.legsList)
            binding.recyclerView.adapter = adapter
        }

        else if(args.muscleType == "back") {
            val adapter = ExerciseAdapter(viewModel.backList)
            binding.recyclerView.adapter = adapter
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}