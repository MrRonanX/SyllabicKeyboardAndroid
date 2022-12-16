package com.syllabic.syllabickeyboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.UserDictionary
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClick()
        UserDictionary.Words.addWord(this, "MadeUpWord", 10, UserDictionary.Words.LOCALE_TYPE_CURRENT);

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
            startActivity(myIntent)
        }

    }

    private fun setTextOne() {
        tvHomeTitle.text = "ᐃᓄᐃᑦ ᓇᕿᑕᕋᖓ"
        tvHomeTitleTwo.text = "ᒪᓕᒐᖅ ᓄᐃᑦᓯᕈᑎᒃ"
        tvHomeThree.text = "• ᐊᒻᒪᓗᒍ"
        tvHomeFour.text = "• ᒪᐅᖕᖓᓗᑎᑦ"
        tvHomeFive.text = "> General"
        tvHomeSix.text = "> Keyboard"
        tvHomeSeven.text = "> Keyboards"
        tvHomeEight.text = "• ᓇᕐᓂᓗᒍ Add new keyboard"
        tvHomeNight.text = "• ᓇᕐᓂᓗᒍ Inuit keyboard"
        tvHomeTen.text = "ᐃᓕᓐᓂᑐᐊ ᐱᒍᑦᔨᔪᒃ ᐊᐅᓚᑎᓗᒍ"
        tvHomeElevent.text = "ᖃᓂᐅᔮᕐᐯᑎᑑᕐᑐᑦ ᓄᐃᑎᓗᒋᑦ"
        layoutTwo.setBackgroundResource(R.drawable.custom_back_ground_black)
        layoutThree.setBackgroundResource(R.drawable.custom_back_ground_black)
        layoutOne.setBackgroundResource(R.drawable.custom_back_ground_orange)
    }

    private fun setTextTwo() {
        tvHomeTitle.text = "Inuktitut Keyboard"
        tvHomeTitleTwo.text = "Installation instruction"
        tvHomeThree.text = "• Open settings"
        tvHomeFour.text = "• Go to"
        tvHomeFive.text = "> General"
        tvHomeSix.text = "> Keyboard"
        tvHomeSeven.text = "> Keyboards"
        tvHomeEight.text = "• Click Add new keyboard"
        tvHomeNight.text = "• Select Inuit keyboard"
        tvHomeTen.text = "Enable personalized suggestions"
        tvHomeElevent.text = "View syllabic characters"
        layoutTwo.setBackgroundResource(R.drawable.custom_back_ground_black)
        layoutThree.setBackgroundResource(R.drawable.custom_back_ground_orange)
        layoutOne.setBackgroundResource(R.drawable.custom_back_ground_black)
    }

    private fun setTextThree() {
        tvHomeTitle.text = "Clavier en Inuktitut"
        tvHomeTitleTwo.text = "Instructions d'installation"
        tvHomeThree.text = "• Ouvrir les paramètres"
        tvHomeFour.text = "• Sous"
        tvHomeFive.text = "> Général"
        tvHomeSix.text = "> Clavier"
        tvHomeSeven.text = "> Claviers"
        tvHomeEight.text = "• Ajouter un nouveau clavier"
        tvHomeNight.text = "• Choisissez Inuit keyboard"
        tvHomeTen.text = "Activer les suggestions personnalisées"
        tvHomeElevent.text = "Afficher les caractères syllabiques"
        layoutTwo.setBackgroundResource(R.drawable.custom_back_ground_orange)
        layoutThree.setBackgroundResource(R.drawable.custom_back_ground_black)
        layoutOne.setBackgroundResource(R.drawable.custom_back_ground_black)
    }
}