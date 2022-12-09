package com.syllabic.syllabickeyboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imgBack.setOnClickListener {
            finish()
        }
        tvBack.setOnClickListener {
            finish()
        }
    }

}