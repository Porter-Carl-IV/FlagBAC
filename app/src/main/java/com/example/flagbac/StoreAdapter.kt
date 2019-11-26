package com.example.flagbac

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class StoreAdapter(val storeList: ArrayList<Store>) : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
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

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.store_name)

    }
}