package com.example.latihanpermission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.add_photo,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragment_manager = supportFragmentManager
        val fragment_transacation = fragment_manager.beginTransaction()
        val fragment = fragment_add_photo()
        fragment_transacation.replace(R.id.fragment_container_view, fragment).commit()
        return super.onOptionsItemSelected(item)
    }
}