package com.example.fishidentifierfinalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExerciseViewModel : ViewModel() {

    //    finished this list (4 bi, 4 tri, 2 forearm) = 10 exercise
    private val _armsList = listOf(
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
    val armsList : List<Exercise>
        get() = _armsList

    //    lower back, middle back, traps, lats (2 done)
    private val _backList = listOf(
        Exercise("Weighted Pull-Up", "Lats", "Dip Belt", "Intermediate", R.string.weightedpu_instruction.toString()),
        Exercise("Close-Grip Front Lat Pulldown", "Lats", "Cable", "Intermediate", R.string.cglatpd_instruction.toString())
    )
    val backList : List<Exercise>
        get() = _backList

    //    calves (2 done), glutes, hamstrings, quadriceps
    private val _legsList = listOf(
        Exercise("Smith Machine Calf Raise", "Calves", "Machine", "Intermediate", R.string.smithcr_instruction.toString()),
        Exercise("Seated Calf Raise", "Calves", "Machine", "Intermediate", R.string.sittingcr_instruction.toString())
    )
    val legsList : List<Exercise>
        get() = _legsList

    //    first 2 from api done, go in order of api
    private val _chestList = listOf(
        Exercise("Dumbbell Bench Press", "Chest", "Dumbbell", "Intermediate", R.string.dbbenchpress_instruction.toString()),
        Exercise("Pushups", "Chest", "Body", "Intermediate", R.string.pushup_instruction.toString())
    )
    val chestList : List<Exercise>
        get() = _chestList

}