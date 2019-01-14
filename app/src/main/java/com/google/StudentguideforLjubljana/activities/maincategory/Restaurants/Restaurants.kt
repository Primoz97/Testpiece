package com.google.StudentguideforLjubljana.activities.maincategory.Restaurants

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.google.StudentguideforLjubljana.R
import kotlinx.android.synthetic.main.restaurants.*

class Restaurants : AppCompatActivity() {

    companion object {
        val TAG: String = Restaurants::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurants)


        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Cantina mexicana Knafelj")
        landmarkNames.add("Italijanska restavracija Mirje")
        landmarkNames.add("Kitajska restavracija Novi Šanghai")

        var landmarkProp = ArrayList<String>()
        landmarkProp.add("Location: Knafijev prehod 2, 1000 Ljubljana, " +
                "Price of a meal: 7,00€, Supplement for coupon: 4,37€")
        landmarkProp.add("Location: Tržaška coesta 5, 1000 Ljubljana, " +
                "Price of a meal: 7,00€, Supplement for coupon: 4,37€")
        landmarkProp.add("Location: Kapitelska, 1000 Ljubljana, " +
                "Price of a meal: 7,00€, Supplement for coupon: 4,37€")



        val mexicana = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.mexicana)
        val italijanska = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.italijanska)
        val kitajska = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.kitajska)

        val landmarkImages = ArrayList<Bitmap>()

        landmarkImages.add(mexicana)
        landmarkImages.add(italijanska)
        landmarkImages.add(kitajska)

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        listViewR.adapter = arrayAdapter



        listViewR.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(applicationContext,Detailrestaurants::class.java)
            intent.putExtra("name",landmarkNames[i])

            val properties = Intent(applicationContext,Detailrestaurants::class.java)
            intent.putExtra("properties",landmarkProp[i])

            val bitmap = landmarkImages[i]
            val chosen = GlobalsR.Chosen
            chosen.chosenImage = bitmap


        startActivity(intent)

        }
    }
}
