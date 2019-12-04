package com.example.flagbac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_store_description.*

class StoreDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_description)

        val store = intent.getParcelableExtra<Store>("store_details")

        store_name.text = store.name;
        store_desc.text = store.desc;
    }
}