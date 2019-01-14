package com.google.StudentguideforLjubljana.activities.maincategory.Bars

import android.graphics.Bitmap

class GlobalsB {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage(): Bitmap {
            return chosenImage!!

        }
    }
}