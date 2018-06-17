package com.example.prateek.coderswag.Services

import com.example.prateek.coderswag.Model.Category
import com.example.prateek.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HATS", "hatimage"),
            Category("HOODIES", "hoodieimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Beanie", "$18", "hat1"),
            Product("Black Hat", "$30", "hat2"),
            Product("White Hat", "$30", "hat3"),
            Product("Hat Snapback", "$45", "hat4")
    )

    val hoodies = listOf(
            Product("Gray Hoodie", "$35", "hoodie1"),
            Product("Red Hoodie", "$32", "hoodie2"),
            Product("Gray Hoodie", "$35", "hoodie3"),
            Product("Black Hoodie", "$30", "hoodie4")
    )

    val shirts = listOf(
            Product("Black", "$45", "shirt1"),
            Product("Light Gray", "$40", "shirt2"),
            Product("Red", "$42", "shirt3"),
            Product("Hustle", "$48", "shirt4"),
            Product("KickFlip Studios", "$60", "shirt5")
    )

    val digitalgoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalgoods
        }
    }
}