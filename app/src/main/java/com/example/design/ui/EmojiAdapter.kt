package com.example.design.ui
import android.content.Context
import android.widget.ArrayAdapter

class EmojiAdapter(context: Context, emojis: Array<String>) :
    ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, emojis) {

    override fun getCount(): Int {
        return Math.min(super.getCount(), 3) // Limit suggestions to a maximum of 3
    }
}