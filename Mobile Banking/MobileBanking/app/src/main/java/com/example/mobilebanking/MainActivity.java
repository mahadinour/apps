package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMoney(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void cashOut(View view) {
        startActivity(new Intent(this,MainActivity6.class));
    }

    public void mobileRecharge(View view) {
        startActivity(new Intent(this,MainActivity4.class));
    }

    public void addMoney(View view) {
        startActivity(new Intent(this,MainActivity7.class));
    }

    public void transferMoney(View view) {
        startActivity(new Intent(this,MainActivity8.class));

    }
}