package com.example.fishidentifierfinalproject

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ExerciseViewModel: ViewModel() {

    private val _response = MutableLiveData<List<Exercise>>()
    val response: LiveData<List<Exercise>>
        get() = _response

    fun getExercises() {
        val request = ExerciseApi.exerciseApi.getGoogleBooks()
        request.enqueue(object: Callback<ExerciseResponse> {
            override fun onFailure(call: Call<ExerciseResponse>, t: Throwable) {
                Log.d("RESPONSE", "Failure: " + t.message)
            }

            override fun onResponse(call: Call<ExerciseResponse>, response: Response<ExerciseResponse>) {
                var listOfExercisesFetched = mutableListOf<Exercise>()

                val exerciseResponse: ExerciseResponse? = response.body()
                val exerciseFeaturesList = exerciseResponse?.exerciseItemList ?: listOf()

                for(exerciseFeatures in exerciseFeaturesList) {
                    val exerciseProperties = exerciseFeatures.exerciseInfo

                    val name = exerciseProperties.name
                    val type = exerciseProperties.type
                    val muscle = exerciseProperties.muscle
                    val equipment = exerciseProperties.equipment
                    val difficulty = exerciseProperties.difficulty

                    val newExercise = Exercise(name, type, muscle, equipment, difficulty)
                    listOfExercisesFetched.add(newExercise)
                }

                _response.value = listOfExercisesFetched
            }
        })
    }

}