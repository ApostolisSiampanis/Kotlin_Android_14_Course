package com.example.mywishlistapp.Data

import kotlinx.coroutines.flow.Flow

class Wishrepository(private val wishDao: WishDAO) {

    suspend fun addAWish(wish:Wish){
        wishDao.addAWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id:Long) : Flow<Wish> {
        return wishDao.getWishById(id)
    }

    suspend fun updateAWish(wish:Wish){
        wishDao.updateAWish(wish)
    }

    suspend fun deleteAWish(wish:Wish){
        wishDao.deleteAWish(wish)
    }
}