package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View.inflate
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast

class ActionBarExample : AppCompatActivity() {
    lateinit var count: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_example)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_action_bar, menu)
        val item = menu.findItem(R.id.app_bar_search)
        val searchView = item.actionView as SearchView
        searchView.queryHint = "Search People"
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                Toast.makeText(applicationContext, query, Toast.LENGTH_LONG).show()
                return true
            }
            override fun onQueryTextChange(query: String): Boolean {
                Toast.makeText(applicationContext, query, Toast.LENGTH_LONG).show()
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add -> {
                count = findViewById<TextView>(R.id.info)
                count.setText("Add is clicked")
                return true
            }
            R.id.reset -> {
                count = findViewById<TextView>(R.id.info)
                count.setText("Nothing is selected")
                return true
            }
            R.id.none -> return true
            R.id.about -> {
                Toast.makeText(this, "about", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.exit -> {
                finish()
                return true
            }
        }
        return true
    }
}