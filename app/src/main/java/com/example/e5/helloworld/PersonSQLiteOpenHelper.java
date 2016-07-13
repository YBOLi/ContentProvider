package com.example.e5.helloworld;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class PersonSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = "PersonSQLiteOpenHelper";

    public PersonSQLiteOpenHelper(Context context) {
        super(context, "person.db", null, 3);
    }

    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table person (id integer primary key autoincrement, name varchar(20), number varchar(20)) ");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG,"数据库的版本变化了...");
    }
}
