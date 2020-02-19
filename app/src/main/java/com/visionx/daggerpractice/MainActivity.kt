package com.visionx.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var car:Car? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  var component:CarComponent = DaggerCarComponent.create()
car = component.getCar()
   car?.drive()
    }

}
