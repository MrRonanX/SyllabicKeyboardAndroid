package com.syllabic.syllabickeyboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClick()

    }

    private fun setOnClick() {
        layoutOne.setOnClickListener {

        }
        layoutTwo.setOnClickListener {

        }
        layoutThree.setOnClickListener {

        }

        layoutClickOrange.setOnClickListener {
            val myIntent = Intent(this, DetailActivity::class.java)
            startActivity(myIntent)
        }

        imgSetting.setOnClickListener {
            val myIntent = Intent(this, DetailTwoActivity::class.java)
            startActivity(myIntent)
        }

    }
}