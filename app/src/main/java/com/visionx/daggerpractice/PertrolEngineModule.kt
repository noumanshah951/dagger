package com.visionx.daggerpractice

import dagger.Module
import dagger.Provides
@Module
class PertrolEngineModule{

    @Provides
    fun providePetrolEngine(petrolEngine: PetrolEngine):Engine{
        return petrolEngine
    }

}