package com.example.jotno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.jotno.R.id.mottos;
import static com.example.jotno.R.id.names;

public class available_tutors extends AppCompatActivity {


    String[] tutors;
    String[] mottoss;

    int[] imgss={
            R.drawable.akashbatash,
            R.drawable.aisha,
            R.drawable.kaifa,
            R.drawable.ishrat,
            R.drawable.tui



    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_tutors);
        ListView names=(ListView) findViewById(R.id.names);
        tutors=getResources().getStringArray(R.array.tutor_names);
        mottoss=getResources().getStringArray(R.array.mottos);
        CustomAdapter adapter= new CustomAdapter(this,tutors,mottoss,imgss);
        names.setAdapter(adapter);
        names.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



               


            }
        });

    }
}