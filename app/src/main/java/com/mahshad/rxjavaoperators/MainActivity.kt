package com.mahshad.rxjavaoperators

import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    lateinit var usernameEditText: EditText
    lateinit var rewardsEditText: EditText
    lateinit var termsAndConditionsButton: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        usernameEditText = findViewById(R.id.usernameEditText)
//        rewardsEditText = findViewById(R.id.rewardsEditText)
//        termsAndConditionsButton = findViewById(R.id.termsAndConditionsButton)`
    }
    override fun onResume() {
        super.onResume()

    }
}

//you have different views and based on the change which happens in at least one of them
///an event has to be triggered. So on them listener of each of the views I have to track this change