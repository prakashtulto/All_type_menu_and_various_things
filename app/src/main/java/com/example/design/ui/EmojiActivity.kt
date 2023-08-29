package com.example.design.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.example.design.R

class EmojiActivity : AppCompatActivity() {

    private val emojiMap = mapOf(
        "tea" to "\uD83C\uDF75",
        "coffee" to "\u2615",
        "cake" to "\uD83C\uDF70",
        "smile" to "\uD83D\uDE04",
        "heart" to "\u2764\uFE0F"
    )

    private val emojiKeywords = emojiMap.keys.toList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoji)

        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)

        val emojiAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, emojiKeywords)
        autoCompleteTextView.setAdapter(emojiAdapter)

        autoCompleteTextView.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // No implementation needed
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Replace keywords with emojis as you type
                val newText = replaceKeywordsWithEmojis(s.toString())
                autoCompleteTextView.removeTextChangedListener(this)
                autoCompleteTextView.setText(newText)
                autoCompleteTextView.setSelection(newText.length)
                autoCompleteTextView.addTextChangedListener(this)
            }

            override fun afterTextChanged(s: Editable?) {
                // No implementation needed
            }
        })
    }

    private fun replaceKeywordsWithEmojis(text: String): String {
        var result = text
        emojiMap.forEach { (keyword, emoji) ->
            result = result.replace(keyword, emoji)
        }
        return result
    }
}
