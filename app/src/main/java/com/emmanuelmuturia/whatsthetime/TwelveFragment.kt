package com.emmanuelmuturia.whatsthetime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emmanuelmuturia.whatsthetime.databinding.FragmentTwelveBinding

class TwelveFragment : Fragment() {

    private var _binding: FragmentTwelveBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //val myInflater = inflater.inflate(R.layout.fragment_twelve, container, false)
        //val myTwelveHour = myInflater.findViewById<TextClock>(R.id.timeTwelve)

        _binding = FragmentTwelveBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }
}