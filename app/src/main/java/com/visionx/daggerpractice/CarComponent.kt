package com.visionx.daggerpractice

import dagger.Component

@Component
interface CarComponent {

    fun getCar():Car
}