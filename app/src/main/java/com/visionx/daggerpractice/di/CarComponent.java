package com.visionx.daggerpractice.di;

import com.visionx.daggerpractice.car.Car;
import com.visionx.daggerpractice.MainActivity;

import dagger.Component;

@Component (modules =  {WheelModeule.class , PertrolEngineModule.class})
interface CarComponent {
 Car getCar();
 void injects(MainActivity mainActivity);
}
