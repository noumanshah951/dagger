package com.visionx.daggerpractice.car

import android.util.Log
import com.visionx.daggerpractice.car.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    override fun start() {
     Log.d("test", "petrol engine started")
    }
}