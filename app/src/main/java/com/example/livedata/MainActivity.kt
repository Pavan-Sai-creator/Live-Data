package com.example.livedata

// https://www.youtube.com/watch?v=UGBHHkUyL5c&list=PLRKyZvuMYSIO0jLgj8g6sADnD0IBaWaw2&index=6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    lateinit var updateBtn: Button
    lateinit var nameTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateBtn = findViewById(R.id.update_btn)
        nameTv = findViewById(R.id.name_tv)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.nameLiveData.observe(this,{
            nameTv.text = it
        })

        updateBtn.setOnClickListener {
            mainViewModel.updateName()
        }

    }
}