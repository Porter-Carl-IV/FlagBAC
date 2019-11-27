package com.example.flagbac

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flagbac.R.layout.alcohol_search
import kotlinx.android.synthetic.main.alcohol_search.*
import kotlinx.android.synthetic.main.alcohol_card_view.*

class AlcoholSearch : AppCompatActivity()  {

    var alcoholList: ArrayList<Alcohol> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(alcohol_search)

        alcoholSearchRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        addAlcohol()

        val alcoholRVAdapter = AlcoholAdapter( alcoholList, this )
        alcoholSearchRV.adapter = alcoholRVAdapter

    }

    fun addAlcohol() {
        val kolch = Alcohol("Kolch", "Mother Road", 4)
        val towerStation = Alcohol("Tower Station", "Mother Road", 5)
        val dailyDriver = Alcohol( "Daily Driver", "Mother Road", 6)
        val pbr = Alcohol("Pabst Blue Ribbon", "Pabst Brewing Company", 7)
        alcoholList.add(kolch)
        alcoholList.add(towerStation)
        alcoholList.add(dailyDriver)
        alcoholList.add(pbr)
    }
}

