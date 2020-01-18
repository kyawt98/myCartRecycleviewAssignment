package com.kyawt.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.mycart.R
import com.kyawt.mycart.model.cartModel

class CartViewHolder(viewList: View) : RecyclerView.ViewHolder(viewList) {
    var name = viewList.findViewById<TextView>(R.id.txt_name)
    var price = viewList.findViewById<TextView>(R.id.txt_price)
    var count = viewList.findViewById<TextView>(R.id.txt_count_no)
    var image = viewList.findViewById<ImageView>(R.id.img_cart_list)
}

class CartAdapter(var cartList: ArrayList<cartModel>) : RecyclerView.Adapter<CartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.my_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cartList.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.name.text = cartList[position].name
        holder.price.text = cartList[position].price.toString()
        holder.count.text = cartList[position].count.toString()
        holder.image.setImageResource(cartList[position].image)
    }
}