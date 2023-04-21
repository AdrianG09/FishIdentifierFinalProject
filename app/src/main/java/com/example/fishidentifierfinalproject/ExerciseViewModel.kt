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



}