package com.example.fishidentifierfinalproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.fishidentifierfinalproject.databinding.FragmentWelcomeBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.FirebaseAuth

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)

        binding.logInButton.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeToLoginFragment()
            binding.root.findNavController().navigate(action)
        }

        binding.signUpButton.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeToSignUpFragment()
            binding.root.findNavController().navigate(action)
        }

        binding.continueGuestButton.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeToMainFragment()
            binding.root.findNavController().navigate(action)
        }

        return binding.root
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = FirebaseAuth.getInstance()
        if (currentUser != null) {
            val action = WelcomeFragmentDirections.actionWelcomeToMainFragment()
            binding.root.findNavController().navigate(action)
        }
        reload()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}