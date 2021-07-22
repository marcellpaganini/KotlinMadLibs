package com.example.madlibs

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var noun : String = ""
    var pluralNoun1 : String = ""
    var pluralNoun2 : String = ""
    var verbPresent1 : String = ""
    var verbPresent2 : String = ""
    var bodyPart : String = ""
    var adjective1 : String = ""
    var adjective2 : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_1).setOnClickListener {
            noun = go(findViewById(R.id.input_1), findViewById(R.id.input_2), findViewById<EditText>(R.id.txtNoun).text.toString())
        }

        findViewById<Button>(R.id.btn_2).setOnClickListener {
            pluralNoun1 = go(findViewById(R.id.input_2), findViewById(R.id.input_3), findViewById<EditText>(R.id.txtPluralNoun1).text.toString())
        }

        findViewById<Button>(R.id.btn_3).setOnClickListener {
            verbPresent1 = go(findViewById(R.id.input_3), findViewById(R.id.input_4), findViewById<EditText>(R.id.txtVerbPresent).text.toString())
        }

        findViewById<Button>(R.id.btn_4).setOnClickListener {
            verbPresent2 = go(findViewById(R.id.input_4), findViewById(R.id.input_5), findViewById<EditText>(R.id.txtVerbPresent2).text.toString())
        }

        findViewById<Button>(R.id.btn_5).setOnClickListener {
            bodyPart = go(findViewById(R.id.input_5), findViewById(R.id.input_6), findViewById<EditText>(R.id.txtPartOfBody).text.toString())
        }

        findViewById<Button>(R.id.btn_6).setOnClickListener {
            adjective1 = go(findViewById(R.id.input_6), findViewById(R.id.input_7), findViewById<EditText>(R.id.txtAdjective1).text.toString())
        }

        findViewById<Button>(R.id.btn_7).setOnClickListener {
            pluralNoun2 = go(findViewById(R.id.input_7), findViewById(R.id.input_8), findViewById<EditText>(R.id.txtPluralNoun2).text.toString())
        }

        findViewById<Button>(R.id.btn_8).setOnClickListener {
            adjective2 = showText(findViewById(R.id.input_8), findViewById(R.id.scroll), findViewById<EditText>(R.id.txtAdjective2).text.toString())
        }

    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }


    private fun go(currentLayout : LinearLayout?, nextLayout : LinearLayout?, input : String) : String {
        currentLayout?.visibility = View.GONE
        nextLayout?.visibility = View.VISIBLE

        val answer : String = input
        return answer
    }

    private fun showText(currentLayout : LinearLayout?, scrollView : ScrollView, input : String) : String {
        currentLayout?.visibility = View.GONE
        scrollView.visibility = View.VISIBLE
        findViewById<ImageView>(R.id.computer).visibility = View.VISIBLE

        val answer : String = input

        val text = getString(R.string.string_1) + " " + noun + getString(R.string.string_2) + " " + pluralNoun1 +
                getString(R.string.string_3) + " " + verbPresent1 + getString(R.string.string_4) +  " " + verbPresent2 + " " +
                getString(R.string.string_5) +  " " + bodyPart + getString(R.string.string_6) +  " " + adjective1 + " " +
                getString(R.string.string_7) +  " " + pluralNoun2 + " " + getString(R.string.string_8) +  " " + answer +
                " " + getString(R.string.string_9)
        findViewById<TextView>(R.id.txtContent).text = text

        return answer
    }


}