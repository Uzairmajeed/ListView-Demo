package com.facebook.listveiw_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String fruitLis [] = {"Apple", "Banana", "Apricot", "Orange", "Water Melon"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, fruitLis);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Log.i( "LIST_VIEW",  "Item is clicked @ position " + i);
                String clickedFruit = fruitLis[i];  // Get the clicked fruit name
                Toast.makeText(MainActivity.this, "Clicked: " + clickedFruit, Toast.LENGTH_SHORT).show();
            }
        });

    }
}