package com.example.mywishlistapp

import android.content.Context
import androidx.room.Room
import com.example.mywishlistapp.Data.WishDatabase
import com.example.mywishlistapp.Data.Wishrepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy{
        Wishrepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }

}