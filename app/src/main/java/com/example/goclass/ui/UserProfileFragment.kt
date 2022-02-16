package com.example.goclass.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.goclass.MainActivity
import com.example.goclass.R
import com.example.goclass.databinding.FragmentUserProfileBinding


class UserProfileFragment : Fragment() {
    private var _binding: FragmentUserProfileBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserProfileBinding.inflate(inflater, container, false)
        (requireActivity() as MainActivity).toggle(false)

        //Save button
        binding.saveButton.setOnClickListener {
            //Save/Update  user details in Firebase and local array

        }

        //Adding a badge
        binding.addBadgeButton.setOnClickListener {
            findNavController().navigate(R.id.action_userProfileFragment_to_addBadgeFragment)
        }

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        (requireActivity() as MainActivity).toggle(false)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}