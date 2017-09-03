package com.vivekraja07.vivekatgt.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vivekraja07 on 9/3/17.
 */

public class TaskHelper extends SQLiteOpenHelper {

    public TaskHelper(Context context) {
        super(context, Task.DB_NAME, null, Task.DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "Create Table " + Task.TaskEntry.TABLE + " ( " +
                Task.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Task.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Task.TaskEntry.TABLE);
        onCreate(db);
    }
}


