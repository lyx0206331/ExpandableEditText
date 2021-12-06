package com.adrian.expandabledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrian.expandableedittext.ExpandableEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ExpandableEditText>(R.id.etExpandable).onCenterTextChangedListener = { text, start, before, count ->
        }
    }
}