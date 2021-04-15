package com.cst2335.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TriviaDB extends SQLiteOpenHelper {

    protected final static String DATABASE_NAME = "TRIVIADB";
    protected final static int VERSION_NUM = 1;
    public final static String TABLE_NAME = "TRIVIA";
    public final static String PLYR_NAME = "NAME";
    public final static String HIGHSCR = "HIGHSCR";
    public final static String SCORE = "SCORE";
    public final static String DIFFICULTY = "DIFFICULTY";
    public final static String COL_ID = "_id";

    public final String[] columns = {COL_ID, PLYR_NAME, SCORE, DIFFICULTY};

    public TriviaDB(Context ctx) {
        super(ctx, DATABASE_NAME, null, VERSION_NUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " ("
                + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PLYR_NAME + " TEXT,"
                + SCORE + " INTEGER,"
                + DIFFICULTY + " TEXT);");
    }
    public void addData(String PLYR_NAME, String SCORE,String DIFFICULTY) {
        SQLiteDatabase sqLiteDatabase = this .getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME", PLYR_NAME);
        values.put("SCORE", SCORE);
        values.put("DIFFICULTY", DIFFICULTY);
        //inserting new row
        sqLiteDatabase.insert(TABLE_NAME, null , values);
        //close database connection
        sqLiteDatabase.close();
    }
    public void delete(String ID) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        //deleting row
        sqLiteDatabase.delete(TABLE_NAME, "ID=" + COL_ID, null);
        sqLiteDatabase.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);    }

    public void getAll() {
    }
}
