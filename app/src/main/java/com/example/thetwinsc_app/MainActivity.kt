package com.example.thetwinsc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        findViewById<MaterialToolbar>(R.id.topAppBar).setNavigationOnClickListener{
            //handle the navigation icon press
        }

        findViewById<MaterialToolbar>(R.id.topAppBar).setOnMenuItemClickListener{menuItem -> when (menuItem.itemId){
            R.id.search -> {
                // Handle search icon press
                true
            }
            else -> false
        }}
    }
}