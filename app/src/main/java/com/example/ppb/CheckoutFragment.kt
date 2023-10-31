package com.example.ppb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.ppb.databinding.FragmentCheckoutBinding



class CheckoutFragment : Fragment() {
    private lateinit var binding: FragmentCheckoutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCheckoutBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {

            val genderArray = resources.getStringArray(R.array.gender)
            val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, genderArray)

            spinnerTkt.adapter = adapter

            btnBuy.setOnClickListener {
                val action = CheckoutFragmentDirections.actionCheckoutFragmentToCartFragment()
                findNavController().navigate(action)
            }
        }
    }

}