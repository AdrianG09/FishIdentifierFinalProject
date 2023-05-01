package com.example.fishidentifierfinalproject

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.Retrofit
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Header
import retrofit2.http.Headers

private const val QUERY_STRING = "exercises?muscle=biceps"
private const val BASE_URL = "https://api.api-ninjas.com/v1/"

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
private val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL).build()

interface ExerciseApiService {
    @Headers("api-key: " + "ElODhmtfQnr5FleTYDmJhEkou1PQcUrPiGstVuPb")
    @GET(QUERY_STRING)
    fun getExercises(): Call<ExerciseResponse>
}

object ExerciseApi {
    val exerciseApi: ExerciseApiService by lazy {
        retrofit.create(ExerciseApiService::class.java)
    }
}