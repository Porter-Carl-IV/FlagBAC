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
        val safeway = Store("O'learys Market", "A small family owned liqueur and smoke shop, that sells food products but more importantly, alcohol.", R.drawable.oleary)
        val motherroad = Store( "Mother Road Brewing Company", "A brewery that has food and the most popular Flagstaff beers.", R.drawable.motherroad_store)
        val majesticMP = Store( "Majestic Marketplace", "An overpriced store that sells super fancy craft beers that still taste bad.", R.drawable.majestic)
        val beaverSL = Store("Beaver Street Brewery", "A classic flagstaff brewery with pool.", R.drawable.beaverstreet)
        val grandCS = Store("Grand Canyon Brewery + Distillery", "Arizona brewery that sells beer and spirits.", R.drawable.grandcanyon)
        val uptown = Store("Uptown Pubhouse", "The worst bar in all of flagstaff. Well I guess its better than Collins.", R.drawable.uptown)

        val stores1 = ArrayList<Store>()
        val stores2 = ArrayList<Store>()

        stores1.add(safeway)
        stores1.add(motherroad)
        stores1.add(majesticMP)

        stores2.add(beaverSL)
        stores2.add(grandCS)
        stores2.add(uptown)

        val kolch = Alcohol("Kolsch", "Mother Road", R.drawable.kolsch, stores1)
        val hazyangel = Alcohol("Hazy Angel IPA", "Lumberyard", R.drawable.hazy_angel, stores2)
        val blackiron = Alcohol("Black Iron IPA","Grand Canyon Brewing", R.drawable.black_iron, stores2)
        val towerStation = Alcohol("Tower Station", "Mother Road", R.drawable.tower_station, stores1)
        val flagstaffapi = Alcohol("Flagstaff IPA","Lumberyard",R.drawable.flagstaff_api, stores1)

        alcoholList.add(kolch)
        alcoholList.add(hazyangel)
        alcoholList.add(blackiron)
        alcoholList.add(towerStation)
        alcoholList.add(flagstaffapi)
    }
}