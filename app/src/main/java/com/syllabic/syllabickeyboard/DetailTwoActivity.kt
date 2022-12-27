package com.syllabic.syllabickeyboard

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.Window
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail_two.*
import kotlinx.android.synthetic.main.activity_detail_two.imgBack
import kotlinx.android.synthetic.main.activity_detail_two.tvBack


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

        if (checkLanguage == "" || checkLanguage == "two" ){
            tvBack.text = "Back"
            textView5.text = "Credit"
            textView6.text = "Funded by Avataq Cultural Institute"
            textView7.text = "Designed by Thomassie Mangiok"
            textView8.text = "Programmed by Roman Kavinskyi"
            textView9.text = "Ilisarniq typeface created by Coppers and Brasses"
            wedView.loadUrl("https://en.wikipedia.org/wiki/Inuktitut")
        }else if (checkLanguage == "one"){
            tvBack.text = "ᐅᑎᒧ"
            textView5.text = "ᓄᐃᑎᓯᒪᔪᑦ"
            textView6.text = "ᐆᒪ ᑮᓇᐅᔭᖃᑦᑎᓂᑯᖓ: ᐊᕙᑕᖅ ᐱᐅᓯᑐᖃᓕᕆᕕᒃ"
            textView7.text = "ᐆᒪ ᐱᒍᓐᓇᓯᑎᑕᕕᓂᖓ: ᑑᒪᓯ ᒪᖏᐅᖅ"
            textView8.text = "ᐆᒪ ᓴᓇᔭᕕᓂᖓ: ᕉᒪᓐ ᑲᕕᓐᔅᑭ"
            textView9.text = "ᐃᓕᓴᕐᓂᖅ ᖃᓂᐅᔮᕐᐯ Coppers and Brassesᑯᓐᓄ"
            wedView.loadUrl("https://iu.wikipedia.org/wiki/ᐃᓄᒃᑎᑐᑦ")
        }else{
            tvBack.text = "Retour"
            textView5.text = "Crédit"
            textView6.text = "Financé par L’Institut Culturel Avataq"
            textView7.text = "Conçu par Thomassie Mangiok"
            textView8.text = "Programmé par Roman Kavinskyi"
            textView9.text = "Police de caractères Ilisarniq par Coppers and Brasses"
            wedView.loadUrl("https://fr.wikipedia.org/wiki/Inuktitut")
        }


        imgBack.setOnClickListener {
            finish()
        }
        tvBack.setOnClickListener {
            finish()
        }
    }
}