package com.haidev.viewbindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haidev.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.tvHello.text = "Oi"
    }
}
