package com.ashwin.android.fontsandbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class CompatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compat)

        val v1: View = findViewById(R.id.one_textview)
        Log.d("FONT", "one_textview: ${v1.javaClass.name}")
    }
}