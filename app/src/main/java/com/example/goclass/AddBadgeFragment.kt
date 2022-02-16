package com.example.goclass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.goclass.databinding.FragmentAddBadgeBinding
import com.example.goclass.databinding.FragmentUserProfileBinding

class AddBadgeFragment : Fragment() {
    private var _binding: FragmentAddBadgeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAddBadgeBinding.inflate(inflater, container, false)

        binding.submitButton.setOnClickListener{
            //Add the details to user database and Local array



            findNavController().navigate(R.id.action_addBadgeFragment_to_userProfileFragment)
        }
        return binding.root
    }


}