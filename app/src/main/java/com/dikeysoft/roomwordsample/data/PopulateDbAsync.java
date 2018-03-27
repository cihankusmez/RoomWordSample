package com.dikeysoft.roomwordsample.data;

import android.os.AsyncTask;

import com.dikeysoft.roomwordsample.data.dao.WordDao;
import com.dikeysoft.roomwordsample.model.Word;

public class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final WordDao mDao;

    PopulateDbAsync(WordRoomDb db) {
        mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(final Void... params) {
        mDao.deleteAll();
        Word word = new Word("Hello");
        mDao.insert(word);
        word = new Word("World");
        mDao.insert(word);
        return null;
    }
}
