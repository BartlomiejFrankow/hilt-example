package com.example.outsidein.acceptanceTests

import com.example.outsidein.Car
import com.example.outsidein.Engine
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class CarFeatureTest {

    private val engine = Engine()

    private val car = Car(6.0, engine)

    @Test
    fun car_is_loosing_fuel_when_is_turned_on() {
        car.turnOn()

        assertEquals(5.5, car.fuel)
    }

    @Test
    fun car_is_turning_engine_and_increasing_temperature() {
        car.turnOn()

        assertEquals(80.0, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }

}
