package com.example.projectmobile;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class oefenspeelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String bericht=extras.getString("LayoutSoort");

        if (bericht != null) {
            if (extras.containsKey("LayoutSoort")) {
                boolean isNew = extras.getBoolean("isNewItem", false);

                // TODO: Do something with the value of isNew.
            }
        }
    }
}