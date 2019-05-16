package com.hdev.kotlin_edittext

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnTextChanged

class MainActivity : AppCompatActivity() {
    @BindView(R.id.tv_output)
    lateinit var textOutput: TextView
    @BindView(R.id.et_input_text)
    lateinit var editInputText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //bind view
        ButterKnife.bind(this)
    }

    @OnTextChanged(R.id.et_input_text)
    fun onTextChanged(text: CharSequence) {
        textOutput.text = editInputText.text.toString()
    }

    //show Toast
    private fun showToast(message : String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
