package com.example.flagbac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.alcohol_name)
        val brewery = itemView.findViewById<TextView>(R.id.alcohol_brewery)
        //val imgID = itemView.findViewById<ImageView>(R.id.alcohol_photo)

    }


}