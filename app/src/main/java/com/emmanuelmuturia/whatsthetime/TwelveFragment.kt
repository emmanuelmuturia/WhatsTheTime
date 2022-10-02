package com.emmanuelmuturia.whatsthetime

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextClock
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.google.android.material.timepicker.TimeFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofLocalizedTime
import java.time.format.FormatStyle

class TwelveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val myInflater = inflater.inflate(R.layout.fragment_twelve, container, false)
        val myTwelveHour = myInflater.findViewById<TextClock>(R.id.timeTwelve)

        // Inflate the layout for this fragment
        return myInflater
    }
}