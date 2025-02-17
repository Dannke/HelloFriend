package com.example.hellofriend

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hellofriend.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton4.setOnClickListener {
            if (binding.editText.text.isEmpty()) {
                binding.textView.text = "Привет, Друг!"
            } else {
                binding.textView.text = "Здравствуй, " + binding.editText.text
            }
        }
    }
}