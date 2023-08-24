package com.natansin.tetriskotlingame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.natansin.tetriskotlingame.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonplay.setOnClickListener{
            //iniciando a mainactivity
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}