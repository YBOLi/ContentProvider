package com.example.e5.helloworld;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.widget.ThemedSpinnerAdapter;

/**
 * Created by E5 on 2016/7/13.
 */
public class PersonDBProvider extends ContentProvider {
    private static UriMatcher matcher =new UriMatcher(UriMatcher.NO_MATCH);
     private PersonSQLiteOpenHelper helper;

    private static final int INSERT = 1;
    private static final int DELETE = 2;
    private static final int UPDATE = 3;
    private static final int QUERY = 4;
    private static final int QUERYONE = 5;

    public boolean onCreate() {
        return false;
    }


    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }
}
