package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    private EditText name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
    }

    public void login(View view) {
        String s1,s2;
        s1=name.getText().toString();
        s2=pass.getText().toString();

        if(s1.equals("admin") && s2.equals("123")){
            startActivity( new Intent(this,MainActivity.class) );
            finish();
        }
    }
}