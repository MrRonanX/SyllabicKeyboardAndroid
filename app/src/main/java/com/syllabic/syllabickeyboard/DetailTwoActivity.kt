package com.syllabic.syllabickeyboard

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.Window
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail_two.*
import kotlinx.android.synthetic.main.activity_detail_two.imgBack
import kotlinx.android.synthetic.main.activity_detail_two.tvBack
import kotlinx.android.synthetic.main.activity_main.*


class DetailTwoActivity : AppCompatActivity() {
    var checkLanguage = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        window?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
//        window.statusBarColor = Color.TRANSPARENT
        setContentView(R.layout.activity_detail_two)
        checkLanguage = intent.getStringExtra("keycheck").toString()
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

        when (checkLanguage) {
            "", "two" -> {
                val face = ResourcesCompat.getFont(this, R.font.roboto_regular)
                val face2 = ResourcesCompat.getFont(this, R.font.roboto_bold)
                tvBack.typeface = face
                textView5.typeface = face2
                textView6.typeface = face
                textView7.typeface = face
                textView8.typeface = face
                textView9.typeface = face
                tvBack.text = "Back"
                textView5.text = "Credit"
                textView6.text = "Funded by Avataq Cultural Institute"
                textView7.text = "Designed by Thomassie Mangiok"
                textView8.text = "Programmed by Roman Kavinskyi"
                textView9.text = "Ilisarniq typeface created by Coppers and Brasses"
                wedView.loadUrl("https://en.wikipedia.org/wiki/Inuktitut")
            }
            "one" -> {
                tvBack.text = "?????????"
                textView5.text = "?????????????????????"
                textView6.text = "?????? ??????????????????????????????: ???????????? ???????????????????????????"
                textView7.text = "?????? ??????????????????????????????: ????????? ????????????"
                textView8.text = "?????? ??????????????????: ????????? ???????????????"
                textView9.text = "?????????????????? ?????????????????? Coppers and Brasses?????????"
                wedView.loadUrl("https://iu.wikipedia.org/wiki/??????????????????")
            }
            else -> {
                val face = ResourcesCompat.getFont(this, R.font.roboto_regular);
                val face2 = ResourcesCompat.getFont(this, R.font.roboto_bold)
                tvBack.typeface = face
                textView5.typeface = face2
                textView6.typeface = face
                textView7.typeface = face
                textView8.typeface = face
                textView9.typeface = face
                tvBack.text = "Retour"
                textView5.text = "Cr??dit"
                textView6.text = "Financ?? par L???Institut Culturel Avataq"
                textView7.text = "Con??u par Thomassie Mangiok"
                textView8.text = "Programm?? par Roman Kavinskyi"
                textView9.text = "Police de caract??res Ilisarniq par Coppers and Brasses"
                wedView.loadUrl("https://fr.wikipedia.org/wiki/Inuktitut")
            }
        }


        imgBack.setOnClickListener {
            finish()
        }
        tvBack.setOnClickListener {
            finish()
        }
    }
}