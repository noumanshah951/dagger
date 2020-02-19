package com.visionx.daggerpractice.di

import com.visionx.daggerpractice.car.Engine
import com.visionx.daggerpractice.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PertrolEngineModule{

    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine): Engine



}