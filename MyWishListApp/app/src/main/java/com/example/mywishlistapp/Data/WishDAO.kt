package com.example.mywishlistapp.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addAWish(wishEntity:Wish)

    // Loads all wishes from the wish table
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity:Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity:Wish)

    @Query("Select * from `wish-table` where id =:id")
    abstract fun getWishById(id:Long): Flow<Wish>
}