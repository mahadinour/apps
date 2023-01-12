package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        amount=findViewById(R.id.amount);
    }

    public void senddMainActivity3(View view) {
        String s=amount.getText().toString();
        Toast.makeText(this, "Sent "+s+" BDT", Toast.LENGTH_SHORT).show();
    }

    public void homeM3(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}