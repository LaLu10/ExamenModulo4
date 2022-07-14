package com.example.examen_modulo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examen_modulo4.SharedPreferences.Companion.prefs
import com.example.examen_modulo4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        checkUserValues()
    }
    fun initUI(){
        binding.btnLogin.setOnClickListener {
            accessSharedPreferences()
        }
    }
    fun checkUserValues(){
        if (prefs.getName().isNotEmpty()){
            goAccess()
        }
    }
    fun accessSharedPreferences(){
        if (binding.etUsername.text.toString().isNotEmpty() && binding.etPassword.text.toString().isNotEmpty()){
            prefs.saveName(binding.etUsername.text.toString())
            prefs.savePassword(binding.etPassword.text.toString())
            goAccess()
        }else{
            Toast.makeText(this,"Debe rellenar todos los campos",Toast.LENGTH_SHORT).show()
        }
    }
    private fun goAccess(){
        startActivity(Intent(this,ResultActivity::class.java))
    }
}