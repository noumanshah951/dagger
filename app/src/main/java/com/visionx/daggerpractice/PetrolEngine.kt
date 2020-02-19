package com.visionx.daggerpractice

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor():Engine{
    override fun start() {
     Log.d("test", "petrol engine started")
    }
}