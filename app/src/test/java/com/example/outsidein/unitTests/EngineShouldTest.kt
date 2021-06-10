package com.example.outsidein.unitTests

import com.example.outsidein.Engine
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class EngineShouldTest {

    private val engine = Engine()

    @Test
    fun turn_on() {
        engine.turnOn()

        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun increasing_temperature_after_turn_on() {
        engine.turnOn()

        Assertions.assertEquals(80.0, engine.temperature)
    }

}