package com.example.jin.productlist

/**
 * Created by jinesh on 2017-12-25.
 */

class Items(val products: List<Product>)

class Product(val id: Long, val title: String, val body_html: String, val vendor: String, val product_type: String,
              val created_at: String, val handle: String, val updated_at: String, val published_at: String,
              val template_suffix: String, val published_scope: String, val tags: String,
              val variants: List<Variants>, val options: List<Options>, val images: List<Images>,
              val image: Image)

class Variants(val id: Long, val product_id: Long, val title: String, val price: String, val sku: String,
               val position: Int, val inventory_policy: String, val option1: String, val option2: String,
               val option3: String, val created_at: String, val updated_at: String, val taxable: Boolean,
               val barcode: String, val grams: Long, val image_id: String, val inventory_quality: Long,
               val weight: Double, val weight_unit: String, val inventory_item_id: Long,
               val old_inventory_quantity: Long, val requires_shipping: Boolean)

class Options(val id: Long, val product_id: Long, val name: String, val position: Int)

class Images(val id: Long, val src: String)

class Image(val id: Long, val product_id: Long, val position: Int, val created_at: String, val updated_at: String,
            val  width: Long, val height: Long, val src: String)
