package com.example.cse224_kotlin_2021

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.view.menu.MenuBuilder

class OptionMenuImageExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu_image_example)
    }
    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        if(menu is MenuBuilder)
            menu.setOptionalIconsVisible(true)
        menuInflater.inflate(R.menu.option_menu_image, menu)
        return true
    }
}