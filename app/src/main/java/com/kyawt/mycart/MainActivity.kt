package com.kyawt.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.mycart.adapter.CartAdapter
import com.kyawt.mycart.model.cartModel
import kotlinx.android.synthetic.main.my_cart.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cartView()
    }

    fun cartView() {
        var cartRecyclerView: RecyclerView = findViewById(R.id.recycler_cart)
        var btnDecrease = findViewById<Button>(R.id.btn_decrease)
        var btnIncrease = findViewById<Button>(R.id.btn_increase)


        var cartList = ArrayList<cartModel>()
        cartList.add(cartModel(R.drawable.sugar, "Fine Grain Sugar", 20.00, 2))
        cartList.add(cartModel(R.drawable.rice, "Rice", 25.00, 2))
        cartList.add(cartModel(R.drawable.peanut, "Peanuts", 10.00, 2))

        var cartadapter = CartAdapter(cartList)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)
        cartRecyclerView.adapter = cartadapter

    }
}
