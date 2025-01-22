package com.example.tread.activity

import android.content.Intent
import android.os.Bundle
import com.example.tread.MainActivity
import com.example.tread.databinding.ActivityIntroBinding

class introActivity : BaseActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener{
            startActivity(Intent(this@introActivity, MainActivity::class.java))
        }
    }
}