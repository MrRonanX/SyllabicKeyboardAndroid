package com.syllabic.syllabickeyboard

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Bundle
import android.provider.UserDictionary
import androidx.appcompat.app.AppCompatActivity
import com.syllabic.syllabickeyboard.config.BaseConfig
import com.syllabic.syllabickeyboard.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var checkLanguage = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        window?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
//        window.statusBarColor = Color.TRANSPARENT
        setContentView(R.layout.activity_main)
        setOnClick()
        UserDictionary.Words.addWord(this, "MadeUpWord", 10, UserDictionary.Words.LOCALE_TYPE_CURRENT);
        val am = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        val volume_level =
            am.getStreamVolume(AudioManager.STREAM_RING) // Highest Ring volume level is 7, lowest is 0

        val mToneGenerator = ToneGenerator(
            AudioManager.STREAM_MUSIC,
            volume_level * 14
        ) // Raising volume to 100% (For eg. 7 * 14 ~ 100)

        mToneGenerator.stopTone()
        mToneGenerator.startTone(ToneGenerator.TONE_DTMF_1, 100)
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
            myIntent.putExtra("keycheck",checkLanguage)
            startActivity(myIntent)
        }
        switchUser.isChecked = BaseConfig.readLastButtonPressed( this)

        switchUser.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                BaseConfig.saveLastButtonPressed(true, this)
                var arrayList = ArrayList<String>()
                if (BaseConfig.getListSuggestion(this)!= null){
                    arrayList = BaseConfig.getListSuggestion(this);
                }else{
                    arrayList.addAll(Utils.list)
                }
                BaseConfig.saveListSuggestion(arrayList,this)
            } else {
                val arrayList = ArrayList<String>()
                BaseConfig.saveLastButtonPressed(false, this)
                BaseConfig.saveListSuggestion(arrayList,this)
                BaseConfig.saveListInLocal(arrayList,this)
            }
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
        layoutOne.setBackgroundResource(R.drawable.bg_click_main_orange)
        layoutTwo.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutThree.setBackgroundResource(R.drawable.bg_click_main_black)
        checkLanguage = "one"
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
        layoutOne.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutTwo.setBackgroundResource(R.drawable.bg_click_main_orange)
        layoutThree.setBackgroundResource(R.drawable.bg_click_main_black)
        checkLanguage = "two"
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
        layoutOne.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutTwo.setBackgroundResource(R.drawable.bg_click_main_black)
        layoutThree.setBackgroundResource(R.drawable.bg_click_main_orange)
        checkLanguage = "three"
    }
}