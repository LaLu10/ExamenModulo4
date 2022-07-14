package com.example.examen_modulo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen_modulo4.SharedPreferences.Companion.prefs
import com.example.examen_modulo4.databinding.ActivityMainBinding
import com.example.examen_modulo4.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }
    fun initUI() {
        binding.tvCerrarSesion.setOnClickListener {
            prefs.wipeData()
            onBackPressed()

        }
        binding.tvVolverAtras.setOnClickListener{
            onBackPressed()
        }
    }
}