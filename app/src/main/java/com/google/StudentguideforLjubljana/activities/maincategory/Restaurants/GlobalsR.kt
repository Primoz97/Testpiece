package com.google.StudentguideforLjubljana.activities.maincategory.Restaurants

import android.graphics.Bitmap

class GlobalsR {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage():Bitmap {
            return chosenImage!!

        }
    }
}