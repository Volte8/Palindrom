package com.example.patrick.palindrom_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Palindrom extends AppCompatActivity {

    Button Ok= null;
    EditText editText= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrom);

        Ok= (Button) findViewById(R.id.Ok);
        editText=(EditText) findViewById(R.id.editText);

        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
