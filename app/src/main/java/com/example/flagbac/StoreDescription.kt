package com.example.flagbac

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_store_description.*
import kotlinx.android.synthetic.main.store_description.*

class StoreDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.store_description)
        setSupportActionBar(toolbar)

        val store = intent.getParcelableExtra<Store>("store_details")

        store_name.text = store.name
        store_desc.text = store.desc
    }

}
