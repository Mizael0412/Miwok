package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<String> englishWords = new ArrayList<String>();
        englishWords.add("one");
        englishWords.add("two");
        englishWords.add("three");
        englishWords.add("four");
        englishWords.add("five");
        englishWords.add("six");
        englishWords.add("seven");
        englishWords.add("eight");
        englishWords.add("nine");
        englishWords.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, englishWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);





    }

    }

}