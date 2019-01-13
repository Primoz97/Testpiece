package com.google.StudentguideforLjubljana.activities.maincategory

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.adapters.PrintandCopyAdapter
import com.google.StudentguideforLjubljana.models.SupplierPandc
import kotlinx.android.synthetic.main.printandcopy.*

class PrintandCopy : AppCompatActivity() {

    companion object {
        val TAG: String = PrintandCopy::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.printandcopy)


        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = PrintandCopyAdapter(this, SupplierPandc.printandcopy)
        recyclerView.adapter = adapter
    }
}