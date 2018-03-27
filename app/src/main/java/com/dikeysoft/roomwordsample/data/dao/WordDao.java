package com.dikeysoft.roomwordsample.data.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.dikeysoft.roomwordsample.model.Word;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Word word);

    @Query("DELETE FROM words")
    void deleteAll();

    @Query("SELECT * from words ORDER BY word ASC")
    //List<Word> getAllWords();
    LiveData<List<Word>> getAllWords();
}
