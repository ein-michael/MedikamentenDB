package com.einmichael.medikamenten_db;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String databaseName = "Medikamentenliste";
    String databaseTableName = "Medikamente";
    TextView tvmedi;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmedi = findViewById(R.id.tvmedi);

        createDatabase();#

    }

    public void createDatabase() {
        SQLiteDatabase db = openOrCreateDatabase(databaseName, MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE " + databaseTableName + " (id INTEGER, Handelsname TEXT, Dosis TEXT, Darreichungsform TEXT )")
        db.execSQL("INSERT INTO " + databaseTableName + " VALUES('1', 'Zovirax', '2g', 'Cremé')");
        db.close();

    }
}