package com.example.clases07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clases07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Ladron.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.ladron)
            binding.Aceptar.isEnabled=true
        }
        binding.Mago.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.mago)
            binding.Aceptar.isEnabled=true
        }
        binding.Berserker.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.berserker)
            binding.Aceptar.isEnabled=true
        }
        binding.Guerrero.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.guerrero)
            binding.Aceptar.isEnabled=true
        }
        binding.Aceptar.setOnClickListener(){
            val intent = Intent(this, PaginaBlanco::class.java)
            startActivity(intent)
        }
    }
}