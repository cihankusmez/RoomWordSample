package com.dikeysoft.roomwordsample.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "words")
//@Entity(primaryKeys = {"firstName", "lastName"})
//@Entity(indices = {@Index("name"), @Index(value = {"last_name", "address"})})
//@Entity(indices = {@Index(value = {"first_name", "last_name"}, unique = true)})
//@Entity(foreignKeys = @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "user_id"))
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name="word")
    //@PrimaryKey(autoGenerate = true)
    //private int id;
    private String mWord;

//    @Embedded
//    public Address address;

    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}
}
