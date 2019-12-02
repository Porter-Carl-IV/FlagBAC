package com.example.flagbac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.store_search.*

class StoreSearch : AppCompatActivity()  {

    var storeList: ArrayList<Store> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.store_search)


        val alcohol = intent.getParcelableExtra<Alcohol>("alcohol_details")

        // Adds the soldVia stores passed from selected alcohol to display.
        for(item in alcohol.soldVia)
        {
            storeList.add(item)
        }

        // RecyclerView for StoreSearch.
        storeSearchRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        val storeRVAdapter = StoreAdapter( storeList, this )
        storeSearchRV.adapter = storeRVAdapter
    }
}

