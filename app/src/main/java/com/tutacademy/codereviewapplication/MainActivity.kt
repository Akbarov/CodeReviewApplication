package com.tutacademy.codereviewapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast()
    }

    private fun showToast() {
        Toast.makeText(this, "Just toast", Toast.LENGTH_SHORT).show()
    }
}