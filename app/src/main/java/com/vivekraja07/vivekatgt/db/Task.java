package com.vivekraja07.vivekatgt.db;

import android.provider.BaseColumns;

/**
 * Created by vivekraja07 on 9/3/17.
 */

public class Task {

    public static final String DB_NAME = "com.example.vivekraja07.gtcrew.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }

}

