package com.example.flagbac

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter(val storeList: ArrayList<Store>, val context: Context) : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, location: Int): ViewHolder {
        val views = LayoutInflater.from(parent.context).inflate(R.layout.store_card_view,
            parent, false)
        return ViewHolder(views)
    }
    override fun getItemCount(): Int {
        return storeList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, location: Int) {

        holder.name?.text = storeList[location].name
        holder.desc?.text = storeList[location].desc
        holder.imgID.setImageDrawable(ContextCompat.getDrawable(context, storeList[location].imgID))

        holder.cardView.setOnClickListener {
            val intent = Intent(context, StoreDescription::class.java)
            val store = storeList.get(location)
            intent.putExtra("store_details", store )
            ContextCompat.startActivity(context, intent, null)
        }
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.storeCV)
        val name = itemView.findViewById<TextView>(R.id.store_name)
        val desc = itemView.findViewById<TextView>(R.id.store_desc)
        val imgID = itemView.findViewById<ImageView>(R.id.store_photo)
    }
}