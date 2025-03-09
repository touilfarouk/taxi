package com.enons.vehicleapp.utils

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi

class OnBoardingUtils (private val context: Context){

    fun isOnBoardingComplete():Boolean{
        return context.getSharedPreferences("onboarding",Context.MODE_PRIVATE)
            .getBoolean("completed",false)
    }

    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun setOnBoardingComplete(){
        context.getSharedPreferences("onboarding",Context.MODE_PRIVATE)
            .edit()
            .putBoolean("completed",true)
            .apply()
    }
}