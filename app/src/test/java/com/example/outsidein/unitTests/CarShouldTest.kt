package com.example.outsidein.unitTests

import com.example.outsidein.Car
import com.example.outsidein.Engine
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CarShouldTest {

    private val engine = Engine()

    private val car = Car(5.0, engine)

    @Test
    fun loosing_fuel_when_it_turns_on() {
        car.turnOn()

        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turn_on_its_engine() {
        car.turnOn()

        assertTrue(engine.isTurnedOn)
    }

}
