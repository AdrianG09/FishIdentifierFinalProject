package com.example.fishidentifierfinalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fishidentifierfinalproject.databinding.ListItemLayoutBinding

class ExerciseAdapter(val exercises: List<Exercise>) : RecyclerView.Adapter<ExerciseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemLayoutBinding.inflate(layoutInflater, parent, false)
        return ExerciseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exercises[position]
        holder.bindExercise(exercise)
    }

    override fun getItemCount(): Int {
        return exercises.size
    }

}