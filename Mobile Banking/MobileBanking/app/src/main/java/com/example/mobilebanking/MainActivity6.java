package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void cashoutM6(View view) {
        Toast.makeText(this, "Cash Out Done", Toast.LENGTH_SHORT).show();
    }
}