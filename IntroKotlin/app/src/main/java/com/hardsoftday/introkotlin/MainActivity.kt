package com.hardsoftday.introkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hardsoftday.introkotlin.others.Variables

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Variables().showCases()

    }


}