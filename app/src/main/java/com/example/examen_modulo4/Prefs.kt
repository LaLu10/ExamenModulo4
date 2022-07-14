package com.example.examen_modulo4

import android.content.Context

class Prefs(val context:Context) {
    val DATABASE= "MyDB"
    val USER_NAME= "UserName"
    val PASSWORD= "Password"
    val storage= context.getSharedPreferences(DATABASE,Context.MODE_PRIVATE)

    fun saveName(name:String){
        storage.edit().putString(USER_NAME,name).apply()
    }
    fun savePassword(password:String){
        storage.edit().putString(PASSWORD,password).apply()
    }
    fun getName():String{
        return storage.getString(USER_NAME, "")!!
    }
    fun getPassword():String{
        return storage.getString(PASSWORD,"")!!
    }
    fun wipeData(){
        storage.edit().clear().apply()
    }
}