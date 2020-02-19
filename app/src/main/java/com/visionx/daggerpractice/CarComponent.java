package com.visionx.daggerpractice;

import dagger.Component;

@Component (modules =  {WheelModeule.class ,PertrolEngineModule.class})
interface CarComponent {
 Car getCar();
 void injects(MainActivity mainActivity);
}
