package com.visionx.daggerpractice

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule  {

    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine):Engine{
        return dieselEngine
    }



}