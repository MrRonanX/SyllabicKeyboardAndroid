package com.syllabic.syllabickeyboard

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail_two.*
import kotlinx.android.synthetic.main.activity_detail_two.imgBack
import kotlinx.android.synthetic.main.activity_detail_two.tvBack


class DetailTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_two)
        wedView.getSettings().setJavaScriptEnabled(true);
        wedView.getSettings().setLoadWithOverviewMode(true);
        wedView.getSettings().setUseWideViewPort(true);
        wedView.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }

            override fun onPageFinished(view: WebView, url: String) {

            }
        })
        wedView.loadUrl("https://en.wikipedia.org/wiki/Inuktitut")

        imgBack.setOnClickListener {
            finish()
        }
        tvBack.setOnClickListener {
            finish()
        }
    }
}