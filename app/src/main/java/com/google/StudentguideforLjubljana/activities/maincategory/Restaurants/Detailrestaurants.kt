package com.google.StudentguideforLjubljana.activities.maincategory.Restaurants

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.StudentguideforLjubljana.R
import kotlinx.android.synthetic.main.detail_restaurants.*


class Detailrestaurants: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_restaurants)

        val intent = intent

        val name = intent.getStringExtra("name")
        textViewR.text = name

        val properties = intent.getStringExtra("properties")
        textViewR2.text = properties


        val chosen = GlobalsR.Chosen
        val selectedImage = chosen.returnImage()

        imageViewR.setImageBitmap(selectedImage)
    }
}