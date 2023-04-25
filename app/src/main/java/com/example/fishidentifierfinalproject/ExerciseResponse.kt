package com.example.fishidentifierfinalproject

import com.squareup.moshi.Json

class ExerciseResponse {
    @Json(name = "items")
    lateinit var exerciseItemList: List<ExerciseItems>
}

class ExerciseItems {
    @Json(name = "exerciseInfo")
    lateinit var exerciseInfo: ExerciseInfo
}

class ExerciseInfo {
    @Json(name = "name")
    var name: String = ""

    @Json(name = "type")
    var type: String = ""

    @Json(name = "muscle")
    var muscle: String = ""

    @Json(name = "equipment")
    var equipment: String = ""

    @Json(name = "difficulty")
    var difficulty: String = ""
}


