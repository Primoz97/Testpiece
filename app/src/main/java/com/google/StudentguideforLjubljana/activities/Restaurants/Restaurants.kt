package com.google.StudentguideforLjubljana.activities.Restaurants

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.google.StudentguideforLjubljana.adapters.RestaurantsAdapter
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.models.Supplier
import kotlinx.android.synthetic.main.restaurants.*

class Restaurants : AppCompatActivity() {

    companion object {
        val TAG: String = Restaurants::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurants)


        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = RestaurantsAdapter(this, Supplier.restaurants)
        recyclerView.adapter = adapter
    }
}