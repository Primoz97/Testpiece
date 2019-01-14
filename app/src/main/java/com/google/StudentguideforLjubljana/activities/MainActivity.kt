package com.google.StudentguideforLjubljana.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLogTags
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.activities.maincategory.Bars.Bars
import com.google.StudentguideforLjubljana.activities.maincategory.Printandcopy.PrintandCopy
import com.google.StudentguideforLjubljana.activities.maincategory.Restaurants.Restaurants
import com.google.android.gms.maps.MapsInitializer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btnShowToast.setOnClickListener {
        //    Log.i(TAG, "Button was clicked !")
        //    showToast(resources.getString(R.string.btn_was_clickd), Toast.LENGTH_LONG)
        //}


        btnDescription.setOnClickListener {

            val intent = Intent(this, EventLogTags.Description::class.java)
            startActivity(intent)
        }

        btnMaps.setOnClickListener {

            val intent = Intent(this, MapsInitializer::class.java)
            startActivity(intent)
        }


        btnRestaurants.setOnClickListener {

            val intent = Intent(this, Restaurants::class.java)
            startActivity(intent)
        }

        btnBars.setOnClickListener {

            val intent =  Intent(this, Bars::class.java)
            startActivity(intent)
        }

        btnPrintandCopy.setOnClickListener {

            val intent = Intent(this, PrintandCopy::class.java)
            startActivity(intent)
        }
    }
}


