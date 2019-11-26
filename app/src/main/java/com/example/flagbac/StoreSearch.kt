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

        storeSearchRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        addStore()

        val storeRVAdapter = StoreAdapter( storeList )
        storeSearchRV.adapter = storeRVAdapter

    }

    fun addStore() {

        storeList.add(Store("Safeway"))
        storeList.add(Store("Majestic Marketplace"))
        storeList.add(Store("Frys"))
    }
}

