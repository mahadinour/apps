package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void addMoneyM7(View view) {
        Toast.makeText(this, "Money Added To The Bank", Toast.LENGTH_SHORT).show();

    }

    public void addMoneyM7Cart(View view) {
        Toast.makeText(this, "Money Added To The Cart", Toast.LENGTH_SHORT).show();

    }
}