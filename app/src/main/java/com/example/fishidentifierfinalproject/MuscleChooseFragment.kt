package com.example.fishidentifierfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fishidentifierfinalproject.databinding.FragmentMuscleChooseBinding


class MuscleChooseFragment : Fragment() {

    private var _binding: FragmentMuscleChooseBinding? = null
    private val binding get() = _binding!!

    var armsList = listOf(
        Exercise("Incline Hammer Curls", "Biceps", "Dumbbell", "Beginner", R.string.incline_hammer_curl_instruction.toString()),
        Exercise("Wide-Grip Barbell Curl", "Biceps", "Barbell", "Beginner", R.string.wide_grip_bbcurl_instructions.toString()),
        Exercise("Flexor Incline Dumbbell Curls", "Biceps", "Dumbbell", "Beginner", R.string.flexor_db_curl_instruction.toString()),
        Exercise("Concentration Curl", "Biceps", "Dumbbell", "Intermediate", R.string.concentrationcurl_instrcutions.toString()),
        Exercise("Triceps Dip", "Triceps", "Body", "Intermediate", R.string.dip_instruction.toString()),
        Exercise("Cable V-Bar Push-Down", "Triceps", "Cable", "Intermediate", R.string.cablevbar_instruction.toString()),
        Exercise("EZ-Bar Skullcrusher", "Triceps", "EZ Curl Bar", "Intermediate", R.string.skullcrusher_instruction.toString()),
        Exercise("Single-Arm Cable Triceps Extension", "Triceps", "Cable", "Intermediate", R.string.cabletricep_instruction.toString()),
        Exercise("Seated One-Arm Dumbbell Palms-Up Wrist Curl", "Forearms", "Dumbbell", "Beginner", R.string.wristcurl_instruction.toString()),
        Exercise("Standing Behind The Back Wrist Curl", "Forearms", "Barbell", "Beginner", R.string.btbwrist_instruction.toString())
    )

//    lower back, middle back, traps, lats
    var backList = listOf(
        Exercise()
    )

//    calves, glutes, hamstrings, quadriceps
    var legsList = listOf(
        Exercise()
    )

    var chestList = listOf(
        Exercise()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMuscleChooseBinding.inflate(inflater, container, false)

        binding.armsButton.setOnClickListener {
//            send arms list via safe args to main fragment and use adapter there to pass arms list to set recycler view

//            val adapter = ExerciseAdapter(armsList)
//            binding.recylerView.adapter = adapter
        }

        return binding.root
    }

}