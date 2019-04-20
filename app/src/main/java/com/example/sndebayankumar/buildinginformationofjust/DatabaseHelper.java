package com.example.sndebayankumar.buildinginformationofjust;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String database_name = "BIOJUST.db";
    private static final String table_name = "BSMABTable";
    private static final int version = 2;

    public static final String id = "Id";
    public static final String bname = "BuildingName";
    public static final String dname = "DeptName";
    public static final String sroom = "StudentsRoom";
    public static final String troom = "TeachersRoom";
    private Context context;

    private static final String CREATE_TABLE = "CREATE TABLE " + table_name + "(" + id + " INTEGER," + bname + " VARCHAR(155), " + dname + " VARCHAR(255)," + sroom + " NUMBER(50)," + troom + " NUMBER(55));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + table_name;
    private static final String SELECT_ALL = "SELECT * FROM " + table_name;


    public DatabaseHelper(Context context) {
        super(context, database_name, null, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
            Toast.makeText(context, "Table created Successfully", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(context, "Error to create table !!", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Toast.makeText(context, "Table Upgraded successfully", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(context, "Error to update table!!", Toast.LENGTH_SHORT).show();
        }

    }

    public long insertData(String button11, String  button21, String  button31,String button41,String button51,String button61) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(bname, button11);
        contentValues.put(bname, button21);
        contentValues.put(bname, button31);
        contentValues.put(bname, button41);
        contentValues.put(bname, button51);
        contentValues.put(bname, button61);


        long rowCheck = sqLiteDatabase.insert(table_name, null, contentValues);
        return rowCheck;
    }

    public Cursor displayAlldata()

    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(SELECT_ALL, null);
        return cursor;
    }
}



