package com.example.fishidentifierfinalproject

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.fishidentifierfinalproject.databinding.ListItemLayoutBinding
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ExerciseViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentExercise: Exercise

    fun bindExercise(exercise: Exercise) {
        currentExercise = exercise

        binding.nameText.text = currentExercise.name
        binding.muscleText.text = currentExercise.reps.toString()
        binding.equipmentText.text = currentExercise.sets.toString()
    }

}