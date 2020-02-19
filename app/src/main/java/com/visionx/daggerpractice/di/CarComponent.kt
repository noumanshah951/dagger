package com.visionx.daggerpractice.di

import com.visionx.daggerpractice.MainActivity
import com.visionx.daggerpractice.car.Car
import dagger.Component

@Component(modules = [WheelModeule::class , DieselEngineModule::class])
 interface CarComponent {
    var car: Car?
    fun injects(mainActivity: MainActivity?)
}