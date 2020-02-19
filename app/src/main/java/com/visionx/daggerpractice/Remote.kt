package com.visionx.daggerpractice

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    public fun setListner(car:Car){

        Log.d("test" , "remote connected")

    }
}