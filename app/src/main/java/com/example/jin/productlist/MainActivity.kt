package com.example.jin.productlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProductList.layoutManager = LinearLayoutManager(this)

        fetchJSONData()
    }

    private fun fetchJSONData() {
        println("Attempting to fetch JSON data")

        val client = OkHttpClient()
        val url = "https://shopicruit.myshopify.com/admin/products.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6"

        client.newCall(Request.Builder().url(url).build()).enqueue(object: Callback{
            override fun onFailure(call: Call?, e: IOException?) {
                println("Failed to get the data")
            }

            override fun onResponse(call: Call?, response: Response?) {
                val product = GsonBuilder().create().fromJson(response?.body()?.string(), Items::class.java)

                runOnUiThread {
                    rvProductList.adapter = MainAdapter(product)
                }
            }
        })
    }
}





