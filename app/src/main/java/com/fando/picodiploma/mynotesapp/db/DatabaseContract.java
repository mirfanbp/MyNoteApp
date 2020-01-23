package com.fando.picodiploma.mynotesapp.db;

import android.provider.BaseColumns;

// untuk mempermudah akses nama tabel dan nama kolom di dalam database
public class DatabaseContract {

    public static final class NoteColumns implements BaseColumns {
    	public static final String TABLE_NAME = "note";

        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String DATE = "date";
    }
}
