package com.example.animationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.rectangle
        }
    }
}