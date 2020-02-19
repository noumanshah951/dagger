package com.visionx.daggerpractice.di

import com.visionx.daggerpractice.car.DieselEngine
import com.visionx.daggerpractice.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract  class DieselEngineModule  {
    @Binds
    abstract fun provideDieselEngine(dieselEngine: DieselEngine): Engine
}