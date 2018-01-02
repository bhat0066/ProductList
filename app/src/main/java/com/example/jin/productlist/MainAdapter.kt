package com.example.jin.productlist

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product.view.*

/**
 * Created by jinesh on 2017-12-25.
 */
class MainAdapter(private val item: Items): RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return item.products.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.product, parent, false))
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {

        holder?.view?.tvProductTitle?.text = item.products[position].title
        holder?.view?.tVProductDescription?.text = item.products[position].body_html

        Picasso.with(holder?.view?.context).load(item.products[position].image.src).into(holder?.view?.ivProductImage)

        holder?.product = item.products[position]
    }
}

class CustomViewHolder(val view: View, var product: Product? = null): RecyclerView.ViewHolder(view){
    companion object {
        val PRODUCT_TITLE_KEY = "PRODUCT_TITLE"
        val PRODUCT_ID_KEY = "PRODUCT_ID"
    }

    init {
        view.setOnClickListener {
            view.context.startActivity(Intent(view.context, ItemDetails::class.java).putExtra(PRODUCT_TITLE_KEY, product?.title).putExtra(PRODUCT_ID_KEY, product?.id))
        }
    }
}
