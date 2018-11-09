package com.google.StudentguideforLjubljana.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.models.Ba
import com.google.StudentguideforLjubljana.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class BarsAdapter(val context: Context, private val bars: List<Ba>) : RecyclerView.Adapter<BarsAdapter.MyViewHolder>(){

    companion object {
        val TAG: String = BarsAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(parent: ViewGroup, ViewGroup: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bars.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val ba = bars[position]
        holder.setData(ba, position)
    }

    inner  class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentBa: Ba? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                currentBa?.let {
                    context.showToast(currentBa!!.title + " Clicked !")
                }
            }

            itemView.imgShare.setOnClickListener{

                currentBa?.let{

                    val message: String = "Bars: " + currentBa!!.title

                    val  intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Share to : "))

                }
            }
        }

        fun setData(ba: Ba?, pos: Int) {
            ba?.let {
                itemView.txvTitle.text = ba!!.title
            }
            this.currentBa = ba
            this.currentPosition = pos
        }
    }
}