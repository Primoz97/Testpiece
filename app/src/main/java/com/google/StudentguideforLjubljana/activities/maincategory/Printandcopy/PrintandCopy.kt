package com.google.StudentguideforLjubljana.activities.maincategory.Printandcopy

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.google.StudentguideforLjubljana.R
import kotlinx.android.synthetic.main.printandcopy.*

class PrintandCopy : AppCompatActivity() {

    companion object {
        val TAG: String = PrintandCopy::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.printandcopy)


        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Print Kaktus")
        landmarkNames.add("Fotokopirnica Zebra")
        landmarkNames.add("Kopirnica Copy")

        var landmarkProp = ArrayList<String>()
        landmarkProp.add("Location: Borštnikov trg 1, 1000 Ljubljana")
        landmarkProp.add("Location: Gosposka ulica 4, 1000 Ljubljana")
        landmarkProp.add("Location: Verovškova 64, 1000 Ljubljana")



        val kaktus = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kaktus)
        val zebra = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.zebra)
        val copy = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.copy)

        val landmarkImages = ArrayList<Bitmap>()

        landmarkImages.add(kaktus)
        landmarkImages.add(zebra)
        landmarkImages.add(copy)

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        listViewP.adapter = arrayAdapter



        listViewP.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(applicationContext, Detailprintandcopy::class.java)
            intent.putExtra("name",landmarkNames[i])

            val properties = Intent(applicationContext, Detailprintandcopy::class.java)
            intent.putExtra("properties",landmarkProp[i])

            val bitmap = landmarkImages[i]
            val chosen = GlobalsP.Chosen
            chosen.chosenImage = bitmap


            startActivity(intent)

        }
    }
}