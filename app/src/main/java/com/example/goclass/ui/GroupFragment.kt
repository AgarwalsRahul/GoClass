package com.example.goclass.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.goclass.R
import com.example.goclass.data.SavedPreference
import com.example.goclass.databinding.FragmentGroupBinding


class GroupFragment : Fragment() {
    private var _binding: FragmentGroupBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGroupBinding.inflate(inflater, container, false)

        //If already in a class
        if(SavedPreference.getUID(requireContext())!="")
        {
            findNavController().navigate(R.id.action_groupFragment_to_userClass)
        }

        //Create a class
        binding.createClass.setOnClickListener {
            findNavController().navigate(R.id.action_groupFragment_to_createAClassFragment)
        }

        //Join a class
        binding.joinClass.setOnClickListener {
            findNavController().navigate(R.id.action_groupFragment_to_joinClassFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}