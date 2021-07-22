package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

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
    }

    private fun go(currentLayout : LinearLayout?, nextLayout : LinearLayout?, input : String) : String {
        currentLayout?.visibility = View.GONE
        nextLayout?.visibility = View.VISIBLE

        var answer : String = input
        return answer
    }

    private fun showText() {

    }
}