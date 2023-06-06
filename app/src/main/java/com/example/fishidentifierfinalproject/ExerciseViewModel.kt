package com.example.fishidentifierfinalproject

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ExerciseViewModel : ViewModel() {

//    private val _name = ""
//    var name: String = ""
//        get() = _name
//
//    private val _reps = 0
//    var reps: Int = 0
//        get() = _reps
//
//    private val _sets = 0
//    var sets: Int = 0
//        get() = _sets

    private var _exerciseList = mutableListOf<Exercise>()
    val exerciseList : MutableList<Exercise>
        get() = _exerciseList

//    private var _exerciseInfo = mutableListOf<Exercise>()
//    val exerciseInfo : List<Exercise>
//        get() = _exerciseInfo

    var temp = mutableListOf<Exercise>()

    fun setExerciseInfo() {
        Firebase.database.reference.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val userExerciseInfo = dataSnapshot.child("users")
                    .child(FirebaseAuth.getInstance().uid.toString())
                    .child("exerciseList").children

                for (fireBaseInfo in userExerciseInfo) {
                    val name = fireBaseInfo.child("name").getValue().toString()
                    val reps = fireBaseInfo.child("reps").getValue().toString().toInt()
                    val sets = fireBaseInfo.child("sets").getValue().toString().toInt()
                    val currentUserExerciseInfo = Exercise(name, reps, sets)
                    temp.add(currentUserExerciseInfo)
                }
                _exerciseList = temp
                temp = mutableListOf()
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("Exercise", "Failed to read value.", error.toException())
            }
        })
    }

    fun addNew(exercise : Exercise) {
        _exerciseList.add(exercise)
        Firebase.database.getReference("users/" + FirebaseAuth.getInstance().currentUser!!.uid + "/exerciseList").setValue(_exerciseList)
    }

}