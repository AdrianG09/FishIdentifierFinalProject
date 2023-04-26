package com.example.fishidentifierfinalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.fishidentifierfinalproject.databinding.ListItemLayoutBinding

class ExerciseViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentExercise: Exercise

    fun bindExercise(exercise: Exercise) {
        currentExercise = exercise
        val name = currentExercise.name
    }

}