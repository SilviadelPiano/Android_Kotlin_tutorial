package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // data binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // set button listener
        /*findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }*/
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {

        // get refences
        /*var nicknameText = findViewById<TextView>(R.id.nickname_text)
        val nicknameEdit = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)

        nicknameText.text = nicknameEdit.text

        nicknameText.visibility = View.VISIBLE
        nicknameEdit.visibility = View.GONE
        doneButton.visibility = View.GONE*/

        binding.apply {
            nameText.text = binding.nicknameEdit.text
            invalidateAll() // to refresh UI with new data you need to invalidate all previous binding expressions
            nicknameText.visibility = View.VISIBLE
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}