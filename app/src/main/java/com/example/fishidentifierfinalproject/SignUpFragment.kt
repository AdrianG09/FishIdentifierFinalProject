package com.example.fishidentifierfinalproject

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.fishidentifierfinalproject.databinding.FragmentLoginBinding
import com.example.fishidentifierfinalproject.databinding.FragmentSignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    lateinit var dbRef: DatabaseReference
    private lateinit var auth: FirebaseAuth

    private val viewModel: ExerciseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)

        dbRef = Firebase.database.reference
        auth = Firebase.auth

        binding.signupButton.setOnClickListener {
            auth.createUserWithEmailAndPassword(binding.editTextEmail.text.toString(), binding.editTextPassword.text.toString())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(TAG, "createUserWithEmail:success")
                        viewModel.clearList()
                        val user = auth.currentUser
                        val action = SignUpFragmentDirections.actionSignUpFragmentToExerciseListFragment()
                        binding.root.findNavController().navigate(action)
//                        Firebase.database.getReference("/user" + "/exerciseList").setValue()
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "createUserWithEmail:failure", task.exception)
                        Toast.makeText(
                            context,
                            "Authentication failed.",
                            Toast.LENGTH_SHORT,
                        ).show()
                    }
                }
        }

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser != null) {
            val action = SignUpFragmentDirections.actionSignUpFragmentToExerciseListFragment()
            binding.root.findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}