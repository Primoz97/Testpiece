package com.google.StudentguideforLjubljana.activities.Mainpanel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.StudentguideforLjubljana.R

class Description : AppCompatActivity() {

    companion object {
        val TAG: String = Description::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description)
    }

}