package com.example.e5.helloworld;

import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
/**
 * Created by E5 on 2016/7/13.
 */
public class PersonDao2 {
    private PersonSQLiteOpenHelper helper;

    public PersonDao2(Context context){
        helper=new PersonSQLiteOpenHelper(context);
    }
    public long add(String name,String number,int money){
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("number", number);
        long id = db.insert("person", null, values);
        db.close();
        return id;
    }
}
