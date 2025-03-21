package com.muhammadomer.i220921

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FollowerPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_follower_page)
        var myBtn = findViewById<Button>(R.id.myBtn)
        myBtn.setOnClickListener {
            val intent = Intent(this, FollowerPage::class.java)
            startActivity(intent)

        }

        var following = findViewById<Button>(R.id.Following)
        following.setOnClickListener {
            val intent = Intent(this, FollowingPage::class.java)
            startActivity(intent)

        }

        var profile = findViewById<Button>(R.id.Profile)
        profile.setOnClickListener {
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)

        }

    }
}