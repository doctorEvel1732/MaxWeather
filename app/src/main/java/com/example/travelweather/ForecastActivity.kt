package com.example.travelweather

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.travelweather.databinding.ActivityForcastBinding

class ForecastActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForcastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForcastBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var listView = binding.forecastListView
        var movies = listOf("Horror,  Lord of the rings , Alf, Star Wars ")
        var adapter = ArrayAdapter(this, R.layout.simple_list_item_1, movies)
        listView.adapter = adapter


    }
}