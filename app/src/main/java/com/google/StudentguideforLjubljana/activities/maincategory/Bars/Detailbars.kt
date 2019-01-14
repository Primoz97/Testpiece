package com.google.StudentguideforLjubljana.activities.maincategory.Bars

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.StudentguideforLjubljana.R
import kotlinx.android.synthetic.main.detail_bars.*
import kotlinx.android.synthetic.main.detail_restaurants.*

class Detailbars: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_bars)

        val intent = intent

        val name = intent.getStringExtra("name")
        textViewB.text = name

        val properties = intent.getStringExtra("properties")
        textViewB2.text = properties


        val chosen = GlobalsB.Chosen
        val selectedImage = chosen.returnImage()

        imageViewB.setImageBitmap(selectedImage)
    }
}