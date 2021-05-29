package com.example.quizapplicationprac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // To remove the status bar like time and other in screen UI view //

        button.setOnClickListener {
            if(input.text.toString().isEmpty())
            {
                Toast.makeText(this,"Enter Your Name", Toast.LENGTH_LONG).show()
            }
            else {
                var intent = Intent(this,QuestionActivity::class.java)
                startActivity(intent)
                finish() // finish doesnt  allow to  come back to the Starting page
            }
        }
    }
}