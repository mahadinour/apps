package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void addMoneyM8(View view) {
        Toast.makeText(this, "Added Money To The App", Toast.LENGTH_SHORT).show();
    }

    public void addMoneyM8Bank(View view) {
        Toast.makeText(this, "Added Money To The Bank", Toast.LENGTH_SHORT).show();

    }
}