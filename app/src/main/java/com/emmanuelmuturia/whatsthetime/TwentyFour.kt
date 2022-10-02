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
import java.time.Instant
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class TwentyFour : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myInflater = inflater.inflate(R.layout.fragment_twenty_four, container, false)
        val myTwentyFourHour = myInflater.findViewById<TextClock>(R.id.timeTwentyFour)

        // Inflate the layout for this fragment
        return myInflater
    }
}