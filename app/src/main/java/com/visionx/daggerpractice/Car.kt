package com.visionx.daggerpractice

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {
    fun drive() {
        Log.d("test", "Drive")
    }

}