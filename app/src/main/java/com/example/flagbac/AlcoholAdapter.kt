package com.example.flagbac

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.alcohol_card_view.*

class AlcoholAdapter(val alcoholList: ArrayList<Alcohol>,
                     val context: Context) : RecyclerView.Adapter<AlcoholAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val views = LayoutInflater.from(parent.context).inflate(R.layout.alcohol_card_view,
            parent, false)

        return ViewHolder(views)
    }
    override fun getItemCount(): Int {
        return alcoholList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name?.text = alcoholList[position].name
        holder.brewery?.text = alcoholList[position].brewery
        //holder.imgID?.text = alcoholList[location].imgID.toString()
        holder.cardView.setOnClickListener {
            val intent = Intent(context, StoreSearch::class.java)
            startActivity(context, intent, null)
        }


    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.alcoholCV)
        val name = itemView.findViewById<TextView>(R.id.alcohol_name)
        val brewery = itemView.findViewById<TextView>(R.id.alcohol_brewery)
        //val imgID = itemView.findViewById<ImageView>(R.id.alcohol_photo)


    }


}