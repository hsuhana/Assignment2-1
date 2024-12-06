package com.example.assignment2_1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment2_1.databinding.ActivityGameMainPageBinding



class GameMainPage : AppCompatActivity() {

    private lateinit var binding: ActivityGameMainPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        // Inflate the layout using view binding
        binding = ActivityGameMainPageBinding.inflate(layoutInflater)

        // Set the root view to the inflated binding layout
        setContentView(binding.root)

        binding.btnEasy.setOnClickListener {
            val intent = Intent(this, EasyLevel::class.java)

            startActivity(intent)
        }

        binding.btnMedium.setOnClickListener {
            val intent = Intent(this, MediumLevel::class.java)

            startActivity(intent)
        }

        binding.btnIntermediate.setOnClickListener {
            val intent = Intent(this, IntermediateLevel::class.java)

            startActivity(intent)
        }

        binding.btnAdvanced.setOnClickListener {
            val intent = Intent(this, AdvancedLevel::class.java)

            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}