package com.example.fcmnotification

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
/**
 * 1. This Project is based on Firebase.
 * 2. A Notification is pushed from Firebase to Application through FCM.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}