package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ContextMenuExample : AppCompatActivity() {

    var listView: ListView? = null
    var adapter: ArrayAdapter<String>? = null
    var contacts = arrayOf("Akash", "Sachin", "Ajay", "Teena", "Yogesh")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu_example)

        listView = findViewById<ListView>(R.id.listView)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts)
        listView?.adapter = adapter
        // Register the ListView  for Context menu
        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View,
                                     menuInfo: ContextMenu.ContextMenuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.context_menu, menu)
        menu.setHeaderTitle("Select The Action")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var pos1 = item.menuInfo as AdapterView.AdapterContextMenuInfo
        var pos = pos1.position

        if (item.itemId == R.id.call)
            Toast.makeText(applicationContext, "calling code ${contacts[pos]}", Toast.LENGTH_LONG).show()
        else if (item.itemId == R.id.sms)
            Toast.makeText(applicationContext, "sending sms code", Toast.LENGTH_LONG).show()
        else
            return false
        return true
    }
}