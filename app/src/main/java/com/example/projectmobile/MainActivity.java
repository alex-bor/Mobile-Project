package com.example.projectmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.oefenbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOefen();
            }
        });
        button = (Button) findViewById(R.id.speelbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpeel();
            }
        });
        button = (Button) findViewById(R.id.scorebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScore();
            }
        });
        button = (Button) findViewById(R.id.overbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOver();
            }
        });
    }
    public void openOefen(){
        Intent intent = new Intent(this, oefenspeelActivity.class);
        intent.putExtra("LayoutSoort", "oefen");
        startActivity(intent);
    }
    public void openSpeel(){
        Intent intent = new Intent(this, oefenspeelActivity.class);
        intent.putExtra("LayoutSoort", "speel");
        startActivity(intent);
    }
    public void openScore(){
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);
    }
    public void openOver(){
        Intent intent = new Intent(this, OverActivity.class);
        startActivity(intent);
    }
}

