package com.visionx.daggerpractice.di

import com.visionx.daggerpractice.car.DieselEngine
import com.visionx.daggerpractice.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
  class DieselEngineModule (var hoursePower :Int?) {

    @Provides
     fun provideDieselEngine(): Engine{
        return DieselEngine(hoursePower)
    }
}