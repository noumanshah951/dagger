package com.visionx.daggerpractice.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() :
    Engine {
    override fun start() {
        Log.d("test", "diesel engine started")
    }
}