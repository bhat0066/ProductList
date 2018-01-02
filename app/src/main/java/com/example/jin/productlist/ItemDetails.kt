package com.example.jin.productlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.product_details.*


/**
 * Class sets the title to new product title and loads a webView of the product id requested
 *
 * @author Jinesh Bhatt
 * @version 1.0
 */
class ItemDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.product_details)

        supportActionBar?.title = intent.getStringExtra(CustomViewHolder.PRODUCT_TITLE_KEY)

        val productID = intent.getLongExtra(CustomViewHolder.PRODUCT_ID_KEY, -1)
        val productURL = "https://shopicruit.myshopify.com/admin/products/$productID.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6"

        webViewProductJSON.loadUrl(productURL)
    }
}