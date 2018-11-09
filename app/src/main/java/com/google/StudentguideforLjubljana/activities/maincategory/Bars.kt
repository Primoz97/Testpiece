package com.google.StudentguideforLjubljana.activities.maincategory

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.adapters.BarsAdapter
import com.google.StudentguideforLjubljana.models.SupplierBars
import kotlinx.android.synthetic.main.restaurants.*


class Bars : AppCompatActivity() {

    companion object {
        val TAG: String = Bars::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bars)


        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = BarsAdapter(this, SupplierBars.bars)
        recyclerView.adapter = adapter
    }
}