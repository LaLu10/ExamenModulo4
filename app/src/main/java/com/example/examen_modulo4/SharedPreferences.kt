package com.example.examen_modulo4

import android.annotation.SuppressLint
import android.app.Application

class SharedPreferences:Application(){
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var prefs: Prefs
    }
    override fun onCreate() {
        super.onCreate()
        prefs=Prefs(applicationContext)
    }
}