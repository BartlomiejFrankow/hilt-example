package com.example.outsidein

class Engine(var temperature: Double = 20.0, var isTurnedOn: Boolean = false) {

    fun turnOn() {
        isTurnedOn = true
        temperature += 60
    }

}