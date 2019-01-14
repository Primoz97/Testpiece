package com.google.StudentguideforLjubljana.activities.maincategory.Bars

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.google.StudentguideforLjubljana.R
import kotlinx.android.synthetic.main.bars.*


class Bars : AppCompatActivity() {

    companion object {
        val TAG: String = Bars::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bars)


        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Božidar")
        landmarkNames.add("As Aperativo")
        landmarkNames.add("Gig")

        var landmarkProp = ArrayList<String>()
        landmarkProp.add("Location: Vilharjeva 11, 1000 Ljubljana, " +
                "Božidar is part bar, part club, part live music venue, and generally attracts Ljubljana's cool crowd.")
        landmarkProp.add("Location: Čopova 5a (Knafljev Prehod), 1000 Ljubljana, " +
                "Now housed in slick ultra-modern premises that have been the recipient of numerous design awards, this long-running lounge bar " +
                "is almost as much of a Ljubljana institution as its namesake restaurant next door.")
        landmarkProp.add("Mala ulica 5, 1000 Ljubljana, " +
                " Featuring an exposed brick interior, a quality drinks list including a solid selection of craft brews and boutique spirits " +
                "plus the ever-popular classic pub snacks and meals including local favourites such as the Kranjska klobasa local Slovenian " +
                "sausage delicacy, Gig also serves good value lunches during the week.")

        val bozidar = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bozidar)
        val as_aperativo = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.as_aperativo)
        val gig = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.gig)

        val landmarkImages = ArrayList<Bitmap>()

        landmarkImages.add(bozidar)
        landmarkImages.add(as_aperativo)
        landmarkImages.add(gig)

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        listViewB.adapter = arrayAdapter



        listViewB.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(applicationContext, Detailbars::class.java)
            intent.putExtra("name",landmarkNames[i])

            val properties = Intent(applicationContext, Detailbars::class.java)
            intent.putExtra("properties",landmarkProp[i])

            val bitmap = landmarkImages[i]
            val chosen = GlobalsB.Chosen
            chosen.chosenImage = bitmap


            startActivity(intent)

        }
    }
}