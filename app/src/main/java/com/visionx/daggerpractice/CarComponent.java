package com.visionx.daggerpractice;

import dagger.Component;

@Component
interface CarComponent {
 Car getCar();
 void injects(MainActivity mainActivity);
}
