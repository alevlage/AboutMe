package com.example.aboutme

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var radar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photoUrl =
            "https://www.gstatic.com/devrel-devsite/prod/v1241c04ebcb2127897d6c18221acbd64e7ed5c46e5217fd83dd808e592c47bf6/android/images/lockup.svg"
        //Picasso.get().load("http://meteoinfo.by/radar/UKBB/UKBB_latest.png").into(imageView)
       done_button.setOnClickListener{addNickname(it)}

        /* Glide.with(imageView.getContext())
            .load(media)
            .into(imageView)*/
    }
    @SuppressLint("SetTextI18n")
    private fun addNickname(view: View){
        val nicknameText = findViewById<TextView>(R.id.nickname_text)
        val nicknameEdit = findViewById<EditText>(R.id.nickname_edit)
        nicknameText.visibility = View.VISIBLE
        view.visibility = View.GONE
        nicknameEdit.visibility = View.GONE
        nicknameText.text = "@"+nicknameEdit.text.toString()
    }
}