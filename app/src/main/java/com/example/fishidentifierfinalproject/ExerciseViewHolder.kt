package com.example.fishidentifierfinalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.fishidentifierfinalproject.databinding.ListItemLayoutBinding
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController

class ExerciseViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentExercise: Exercise

//    private val viewModel: ExerciseViewModel by activityViewModels()

    init {
        binding.root.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_mainFragment_to_exerciseListFragment)
        }
    }

    fun bindExercise(exercise: Exercise) {
        currentExercise = exercise

        binding.nameText.text = currentExercise.name
        binding.muscleText.text = currentExercise.muscle
        binding.equipmentText.text = currentExercise.equipment
    }

}