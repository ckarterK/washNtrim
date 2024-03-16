package com.example.carwash.createBooking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.carwash.R
import com.example.carwash.adapters.Item
import com.example.carwash.adapters.optionSelectorAdapter

class carType : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_type)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            Item("coupe",R.drawable.coupe),
            Item("SUV",R.drawable.suv),
            Item("sedan",R.drawable.sedan),
            Item("hatchback",R.drawable.hatchback),
            Item("pickuptruck",R.drawable.pickup_truck),
            // Add more items as needed
        )

        val adapter = optionSelectorAdapter(itemList)
        recyclerView.adapter = adapter
    }
}