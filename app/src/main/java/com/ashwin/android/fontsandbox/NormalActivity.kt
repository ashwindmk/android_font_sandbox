package com.ashwin.android.fontsandbox

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.FragmentActivity

class NormalActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)

        val v1: View = findViewById(R.id.one_textview)
        Log.d("FONT", "one_textview: ${v1.javaClass.name}")
    }
}