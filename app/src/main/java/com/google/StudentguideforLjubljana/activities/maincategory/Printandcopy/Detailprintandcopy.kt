package com.google.StudentguideforLjubljana.activities.maincategory.Printandcopy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.StudentguideforLjubljana.R
import kotlinx.android.synthetic.main.detail_printandcopy.*


class Detailprintandcopy: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_printandcopy)

        val intent = intent

        val name = intent.getStringExtra("name")
        textViewP.text = name

        val properties = intent.getStringExtra("properties")
        textViewP2.text = properties


        val chosen = GlobalsP.Chosen
        val selectedImage = chosen.returnImage()

        imageViewP.setImageBitmap(selectedImage)
    }
}