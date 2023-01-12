package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void amountToast20tk(View view) {
        Toast.makeText(this, "20 TK SENT", Toast.LENGTH_SHORT).show();
    }

    public void amountToast50tk(View view) {
        Toast.makeText(this, "50 TK SENT", Toast.LENGTH_SHORT).show();

    }

    public void amountToast100tk(View view) {
        Toast.makeText(this, "100 TK SENT", Toast.LENGTH_SHORT).show();

    }

    public void amountToast200tk(View view) {
        Toast.makeText(this, "200 TK SENT", Toast.LENGTH_SHORT).show();

    }

    public void sendM5(View view) {
        Toast.makeText(this, "TK SENT", Toast.LENGTH_SHORT).show();

    }
}