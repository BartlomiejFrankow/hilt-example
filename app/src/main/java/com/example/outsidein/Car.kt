package com.example.outsidein

class Car(var fuel: Double, var engine: Engine) {

    fun turnOn() {
        engine.turnOn()

        fuel -= 0.5
    }

}