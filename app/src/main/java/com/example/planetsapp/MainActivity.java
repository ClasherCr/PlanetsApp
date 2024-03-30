package com.example.planetsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetsarraylist;
    private static MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.Listview);
        planetsarraylist = new ArrayList<>();
        Planet planet3 = new Planet("Earth","1 Moons",R.drawable.earth);
        Planet planet1 = new Planet("Mercury","0 Moons",R.drawable.mercury);
        Planet planet2 = new Planet("Venus","0 Moons",R.drawable.venus);
        Planet planet4 = new Planet("Mars","2 Moons",R.drawable.mars);
        Planet planet5 = new Planet("Jupiter","79 Moons",R.drawable.jupiter);
        Planet planet6 = new Planet("Saturn","83 Moons",R.drawable.saturn);
        Planet planet7 = new Planet("Uranus","27 Moons",R.drawable.uranus);
        Planet planet8 = new Planet("Neptuen","14 Moons",R.drawable.neptune);

        planetsarraylist.add(planet1);
        planetsarraylist.add(planet2);
        planetsarraylist.add(planet3);
        planetsarraylist.add(planet4);
        planetsarraylist.add(planet5);
        planetsarraylist.add(planet6);
        planetsarraylist.add(planet7);
        planetsarraylist.add(planet8);

        adapter = new MyCustomAdapter(planetsarraylist, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Planet Name: "+adapter.getItem(position).getPlanetname(), Toast.LENGTH_SHORT).show();
            }
        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}