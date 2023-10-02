package com.samir.features.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samir.features.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {
    var binding: ActivityIntentBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding?.getRoot())
    }
}