package com.example.githubtrends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        val mTitle = toolbar.findViewById(R.id.toolbar_title) as TextView

        setSupportActionBar(toolbar)
        mTitle.setText("TRENDING")
        supportActionBar!!.setDisplayShowTitleEnabled(false)
    }

}
