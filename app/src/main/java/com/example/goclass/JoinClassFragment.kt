package com.example.goclass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.goclass.databinding.FragmentCreateAClassBinding
import com.example.goclass.databinding.FragmentGroupBinding
import com.example.goclass.databinding.FragmentJoinClassBinding

class JoinClassFragment : Fragment() {
    private var _binding: FragmentJoinClassBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentJoinClassBinding.inflate(inflater, container, false)
        return binding.root
    }


}