package com.abdosharaf.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.abdosharaf.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val myData = MyData("Abdo Sharaf")
        binding.myData = myData
        binding.btnDone.setOnClickListener {
            buttonClicked()
        }
    }

    private fun buttonClicked(){
        binding.apply {
            btnDone.visibility = View.GONE
            etNickName.visibility = View.GONE
            tvNickName.visibility = View.VISIBLE
            tvNickName.text = etNickName.text
        }
    }
}