package com.example.latihankotlin3

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        facebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.facebook.com/boafkristi")
            startActivity(intent)
        }
        twitter.setOnClickListener {
            val openTw = Intent(Intent.ACTION_VIEW)
            openTw.data = Uri.parse("https://www.twitter.com/kristirhy")
            startActivity(openTw)
        }
        instagram.setOnClickListener {
            val openIg = Intent(Intent.ACTION_VIEW)
            openIg.data = Uri.parse("https://www.instagram.com/kristirhy_")
            startActivity(openIg)
        }
        github.setOnClickListener {
            val openGit = Intent(Intent.ACTION_VIEW)
            openGit.data = Uri.parse("https://www.github.com/Kristirhy")
            startActivity(openGit)
        }
    }
}
