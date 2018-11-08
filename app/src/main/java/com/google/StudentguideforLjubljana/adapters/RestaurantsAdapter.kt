package com.google.StudentguideforLjubljana.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.StudentguideforLjubljana.R
import com.google.StudentguideforLjubljana.models.Resto
import com.google.StudentguideforLjubljana.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class RestaurantsAdapter(val context: Context, private val restaurants: List<Resto>) : RecyclerView.Adapter<RestaurantsAdapter.MyViewHolder>(){

    companion object {
        val TAG: String = RestaurantsAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(parent: ViewGroup, ViewGroup: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val resto = restaurants[position]
        holder.setData(resto, position)
    }

    inner  class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentResto: Resto? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                currentResto?.let {
                    context.showToast(currentResto!!.title + "Clicked !")
                }
            }

            itemView.imgShare.setOnClickListener{

                currentResto?.let{

                    val message: String = "My hobby is: " + currentResto!!.title

                    val  intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Share to : "))

                }
            }
        }

        fun setData(resto: Resto?, pos: Int) {
            resto?.let {
                itemView.txvTitle.text = resto!!.title
            }
            this.currentResto = resto
            this.currentPosition = pos
        }
    }
}