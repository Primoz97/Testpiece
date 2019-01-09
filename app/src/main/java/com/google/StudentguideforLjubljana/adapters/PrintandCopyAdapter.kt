package com.google.StudentguideforLjubljana.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.activities.maincategory.PrintandCopy
import com.google.StudentguideforLjubljana.models.Pandc
import com.google.StudentguideforLjubljana.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class PrintandCopyAdapter(val context: Context, private val printandcopy: List<Pandc>) : RecyclerView.Adapter<PrintandCopyAdapter.MyViewHolder>(){

    companion object {
        val TAG: String = PrintandCopyAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(parent: ViewGroup, ViewGroup: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return printandcopy.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val Pandc = printandcopy[position]
        holder.setData(Pandc, position)
    }

    inner  class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentPandc: Pandc? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                currentPandc?.let {
                    context.showToast(currentPandc!!.title + " Clicked !")
                }
            }

            itemView.imgShare.setOnClickListener{

                currentPandc?.let{

                    val message: String = "Print & Copy: " + currentPandc!!.title

                    val  intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Share to : "))

                }
            }
        }

        fun setData(pandc: Pandc?, pos: Int) {
            pandc?.let {
                itemView.txvTitle.text = pandc!!.title
            }
            this.currentPandc = pandc
            this.currentPosition = pos
        }
    }
}