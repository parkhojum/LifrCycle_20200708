package com.example.lifrcycle_20200708

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_other.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면","onCreate실행")

        goToOtherBtn.setOnClickListener {

            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)

        }


    }

    override fun onResume() {
        super.onResume()
        Log.d("메인화면","onResume실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면","onPause실행")
    }
}