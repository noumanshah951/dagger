package com.visionx.daggerpractice.di

import com.visionx.daggerpractice.car.Rim
import com.visionx.daggerpractice.car.Tires
import com.visionx.daggerpractice.car.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelModeule {

    @Provides
    fun provideRim(): Rim {
        return Rim()
    }

    @Provides
    fun provideTires(): Tires {
        var tire = Tires()
        tire.inflate()
        return tire
    }

    @Provides
    fun provideWheel(rim: Rim, tires: Tires): Wheel {
        return Wheel(rim, tires)
    }
}

