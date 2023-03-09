package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.calculatorapp.databinding.ActivitySplachBinding

class splachActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplachBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplachBinding.inflate(layoutInflater)
        setContentView(binding.root)


       Handler().postDelayed(Runnable {
                      startActivity(Intent(this,MainActivity::class.java))
       },3000)
    }
}


