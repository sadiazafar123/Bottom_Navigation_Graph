package com.example.bottomnavigationgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

//import com.example.bottomnavigationgraph.R.id.fragment_container

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigation)

        navController= Navigation.findNavController(this@MainActivity, R.id.fragment_container)
       // NavigationUI.setupWithNavController(bottomNavigationView, navController)
       // NavigationUI.setupWithNavController(bottomNavigationView,navController)
        NavigationUI.setupWithNavController(bottomNavigationView,navController)
    }
}