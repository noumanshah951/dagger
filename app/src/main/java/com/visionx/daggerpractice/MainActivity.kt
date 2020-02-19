package com.visionx.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject  lateinit  var car:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  var component:CarComponent = DaggerCarComponent.create()
        component.injects(this)
   car?.drive()
    }

}
