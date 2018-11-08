package com.google.StudentguideforLjubljana.models

data class Resto(var title: String)

object Supplier {

    val restaurants = listOf(
            Resto("Swimming"),
            Resto("Reading")
    )
}