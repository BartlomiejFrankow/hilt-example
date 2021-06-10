package com.example.outsidein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.turnOnCar()

        Toast.makeText(applicationContext, viewModel.injectedString + " " + "Car engine temp = ${viewModel.getEngineTemp()}", Toast.LENGTH_LONG).show()
    }

}