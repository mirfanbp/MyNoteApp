package com.fando.picodiploma.mynotesapp.helper;

import android.database.Cursor;

import com.fando.picodiploma.mynotesapp.db.DatabaseContract;
import com.fando.picodiploma.mynotesapp.entity.Note;

import java.util.ArrayList;

/**
    mengambil data dari method queryAll() pada NoteHelper namun hasil objek berupa Cursor
    karna mengembalikan berupa Cursor, jadi di konversi dulu ke Araylist(soalnya pake adapter)
 */
public class MappingHelper {

    public static ArrayList<Note> mapCursorToArrayList(Cursor notesCursor) {
        ArrayList<Note> noteList = new ArrayList<>();

        /**
         * MoveToNext digunakan untuk memindahkan cursor ke baris selanjutnya
         */
        //
        while (notesCursor.moveToNext()) {
            int id = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID));
            String title = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.TITLE));
            String description = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DESCRIPTION));
            String date = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DATE));
            noteList.add(new Note(id, title, description, date));
        }
        return noteList;
    }
}
