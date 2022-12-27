package com.syllabic.syllabickeyboard

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.provider.UserDictionary
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.syllabic.syllabickeyboard.config.BaseConfig
import com.syllabic.syllabickeyboard.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

    var checkLanguage = "";

    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClick()
        UserDictionary.Words.addWord(
            this,
            "MadeUpWord",
            10,
            UserDictionary.Words.LOCALE_TYPE_CURRENT
        )
        val metrics = DisplayMetrics()
        this.windowManager.defaultDisplay.getMetrics(metrics)
        val yInches = metrics.heightPixels / metrics.ydpi
        val xInches = metrics.widthPixels / metrics.xdpi
        val diagonalInches = sqrt((xInches * xInches + yInches * yInches).toDouble())
        if (diagonalInches >= 7) {
            BaseConfig.saveNameDevice("tablet", this);
        } else {
            BaseConfig.saveNameDevice("mobile", this);
        }
    }

    private fun setOnClick() {
        layoutOne.setOnClickListener {
            setTextOne()
        }
        layoutTwo.setOnClickListener {
            setTextTwo()
        }
        layoutThree.setOnClickListener {
            setTextThree()
        }

        layoutClickOrange.setOnClickListener {
            val myIntent = Intent(this, DetailActivity::class.java)
            startActivity(myIntent)
        }

        imgSetting.setOnClickListener {
            val myIntent = Intent(this, DetailTwoActivity::class.java)
            myIntent.putExtra("keycheck", checkLanguage)
            startActivity(myIntent)
        }
        switchUser.isChecked = BaseConfig.readLastButtonPressed(this)

        switchUser.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                BaseConfig.saveLastButtonPressed(true, this)
                var arrayList = ArrayList<String>()
                if (BaseConfig.getListSuggestion(this) != null) {
                    arrayList = BaseConfig.getListSuggestion(this);
                } else {
                    arrayList.addAll(Utils.list)
                }
                BaseConfig.saveListSuggestion(arrayList, this)
            } else {
                val arrayList = ArrayList<String>()
                BaseConfig.saveLastButtonPressed(false, this)
                BaseConfig.saveListSuggestion(arrayList, this)
                BaseConfig.saveListInLocal(arrayList, this)
            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            BaseConfig.saveHorizontalOrVertical("LANDSCAPE", applicationContext)
            Log.e("On Config Change", "LANDSCAPE")
        } else {
            BaseConfig.saveHorizontalOrVertical("PORTRAIT", applicationContext)
            Log.e("On Config Change", "PORTRAIT")
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setTextOne() {
        tvHomeTitle.text = "ᐃᓄᐃᑦ ᓇᕿᑕᕋᖓ"
        tvHomeTitleTwo.text = "ᒪᓕᒐᖅ ᓄᐃᑦᓯᕈᑎᒃ"
        tvHomeThree.text = "• ᐊᒻᒪᓗᒍ                           "
        tvHomeFour.text = "• ᒪᐅᖕᖓᓗᑎᑦ                      "
        tvHomeFive.text = "> General"
        tvHomeSix.text = "   > Keyboard"
        tvHomeSeven.text = "     > Keyboards"
        tvHomeEight.text = "• ᓇᕐᓂᓗᒍ Add new keyboard"
        tvHomeNight.text = "• ᓇᕐᓂᓗᒍ Inuit keyboard     "
        tvHomeTen.text = "ᐃᓕᓐᓂᑐᐊ ᐱᒍᑦᔨᔪᒃ ᐊᐅᓚᑎᓗᒍ"
        tvHomeElevent.text = "ᖃᓂᐅᔮᕐᐯᑎᑑᕐᑐᑦ ᓄᐃᑎᓗᒋᑦ"
        layoutOne.setBackgroundResource(R.drawable.bg_click_main_orange)
        layoutTwo.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutThree.setBackgroundResource(R.drawable.bg_click_main_black)
        checkLanguage = "one"
    }

    @SuppressLint("SetTextI18n")
    private fun setTextTwo() {
        tvHomeTitle.text = "Inuktitut Keyboard"
        tvHomeTitleTwo.text = "Installation instruction"
        tvHomeThree.text = "• Open settings              "
        tvHomeFour.text = "• Go to                        "
        tvHomeFive.text = "> General"
        tvHomeSix.text = "  > Keyboard"
        tvHomeSeven.text = "   > Keyboards"
        tvHomeEight.text = "• Click Add new keyboard"
        tvHomeNight.text = "• Select Inuit keyboard    "
        tvHomeTen.text = "Enable personalized suggestions"
        tvHomeElevent.text = "View syllabic characters"
        layoutOne.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutTwo.setBackgroundResource(R.drawable.bg_click_main_orange)
        layoutThree.setBackgroundResource(R.drawable.bg_click_main_black)
        checkLanguage = "two"
    }

    @SuppressLint("SetTextI18n")
    private fun setTextThree() {
        tvHomeTitle.text = "Clavier en Inuktitut"
        tvHomeTitleTwo.text = "Instructions d'installation"
        tvHomeThree.text = "• Ouvrir les paramètres        "
        tvHomeFour.text = "• Sous                           "
        tvHomeFive.text = " > Général"
        tvHomeSix.text = "> Clavier "
        tvHomeSeven.text = "  > Claviers"
        tvHomeEight.text = "• Ajouter un nouveau clavier"
        tvHomeNight.text = "• Choisissez Inuit keyboard  "
        tvHomeTen.text = "Activer les suggestions personnalisées"
        tvHomeElevent.text = "Afficher les caractères syllabiques"
        layoutOne.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutTwo.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutThree.setBackgroundResource(R.drawable.bg_click_main_orange)
        checkLanguage = "three"
    }
}