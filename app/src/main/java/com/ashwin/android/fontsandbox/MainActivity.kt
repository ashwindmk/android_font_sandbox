package com.ashwin.android.fontsandbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openNormal(view: View) {
        startActivity(Intent(MainActivity@this, NormalActivity::class.java))
    }

    fun openCompat(view: View) {
        startActivity(Intent(MainActivity@this, CompatActivity::class.java))
    }
}