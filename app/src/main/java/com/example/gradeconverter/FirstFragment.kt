package com.example.gradeconverter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gradeconverter.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAUS.setOnClickListener { findNavController().navigate(R.id.action_FirstFragment_to_AUSFragment) }
        binding.buttonUS.setOnClickListener { findNavController().navigate(R.id.action_FirstFragment_to_USFragment) }
        binding.buttonFrench.setOnClickListener { findNavController().navigate(R.id.action_FirstFragment_to_frenchFragment) }
        binding.buttonUIAA.setOnClickListener { findNavController().navigate(R.id.action_FirstFragment_to_UIIAFragment) }

//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}