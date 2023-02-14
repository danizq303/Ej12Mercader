package com.example.ej12mercader

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ej12mercader.databinding.ActivityCiudadBinding

class Ciudad : AppCompatActivity() {
    private lateinit var binding: ActivityCiudadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.setBackgroundResource(R.drawable.ciudad)

        binding.button.setOnClickListener {
            Intent (this, Blank::class.java).also {
                startActivity(it)
            }
        }

        binding.button2.setOnClickListener {
            Intent (this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}