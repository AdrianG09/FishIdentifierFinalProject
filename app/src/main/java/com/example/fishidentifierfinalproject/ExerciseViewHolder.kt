package com.example.fishidentifierfinalproject

import androidx.recyclerview.widget.RecyclerView

class ExerciseViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentExercise: Exercise

    fun bindGoogleBook(exercise: Exercise) {
        currentExercise = exercise
        val name = currentExercise.name
    }

}