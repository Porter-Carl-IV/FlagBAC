package com.example.flagbac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flagbac.R.layout.alcohol_search
import kotlinx.android.synthetic.main.alcohol_search.*

class AlcoholSearch : AppCompatActivity()  {

    var alcoholList: ArrayList<Alcohol> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(alcohol_search)

        // May be unnecessary if we are not hard-coding our data in here. Using for testing.
        addAlcohol()

        // To use RecyclerView we need to create an adapter for it, the following do so.
        alcoholSearchRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        val alcoholRVAdapter = AlcoholAdapter( alcoholList, this )
        alcoholSearchRV.adapter = alcoholRVAdapter

    }

    fun addAlcohol() {
        val safeway = Store("Safeway", "A store that sells food products but more importantly, alcohol.")
        val frys = Store( "Frys", "A store that sells food products but more importantly, alcohol.")
        val majesticMP = Store( "Majestic Marketplace", "An overpriced store that sells super fancy craft beers that still taste bad.")
        val beaverSL = Store("Beaver Street Liquor", "I have never been here.")
        val grandCS = Store("Grand Canyon Spirits", "Im assumming they sell spirits.")
        val uptown = Store("Uptown Pubhouse", "The worst bar in all of flagstaff. Well I guess its better than Collins.")

        val stores1 = ArrayList<Store>()
        val stores2 = ArrayList<Store>()

        stores1.add(safeway)
        stores1.add(frys)
        stores1.add(majesticMP)
        stores2.add(beaverSL)
        stores2.add(grandCS)
        stores2.add(uptown)
        val kolch = Alcohol("Kolch", "Mother Road", 4, stores1)
        val towerStation = Alcohol("Tower Station", "Mother Road", 5, stores2)
//        val dailyDriver = Alcohol( "Daily Driver", "Mother Road", 6, majesticMP)
//        val pbr = Alcohol("Pabst Blue Ribbon", "Pabst Brewing Company", 7, uptown)
        alcoholList.add(kolch)
        alcoholList.add(towerStation)
//        alcoholList.add(dailyDriver)
//        alcoholList.add(pbr)
    }
}