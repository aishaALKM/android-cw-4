package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText i =findViewById(R.id.editTextTextPersonName);
        final EditText s =findViewById(R.id.editTextTextPersonName5);
        final EditText b =findViewById(R.id.editTextTextPersonName6);
        final EditText r =findViewById(R.id.editTextTextPersonName7);
        Button add =findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int o = Integer.parseInt(i.getText().toString());
                int p = Integer.parseInt(s.getText().toString());
                int h = Integer.parseInt(b.getText().toString());
                int a = Integer.parseInt(r.getText().toString());
                int Aisha = o + p + h + a ;
                Toast.makeText(MainActivity.this,Aisha+"",Toast.LENGTH_LONG).show();


            }
        });

    }
}