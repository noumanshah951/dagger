package com.visionx.daggerpractice.car

import android.util.Log
import com.visionx.daggerpractice.car.Car
import javax.inject.Inject

class Remote @Inject constructor(){
    public fun setListner(car: Car){

        Log.d("test" , "remote connected")

    }
}