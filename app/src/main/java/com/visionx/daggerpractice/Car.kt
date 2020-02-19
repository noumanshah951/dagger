package com.visionx.daggerpractice

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor( private val wheel: Wheel) {
    //if we have constructor injection first will call constructor injection then field injection and then method injection we don't use method injection in activities
    @Inject lateinit  var engine: Engine;
    fun drive() {
        engine?.start()
        Log.d("test", "Drive")
    }


    @Inject
    fun remoteLisnter(remote: Remote){
        remote.setListner(this)
    }



}