package com.google.StudentguideforLjubljana.activities.maincategory.Printandcopy

import android.graphics.Bitmap

class GlobalsP {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage(): Bitmap {
            return chosenImage!!

        }
    }
}