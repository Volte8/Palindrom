package com.example.patrick.palindrom_test;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrom extends AppCompatActivity {

    Button Ok= null;
    EditText editText= null;
    TextView out= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrom);

        Ok= (Button) findViewById(R.id.Ok);
        editText=(EditText) findViewById(R.id.editText);
        out=(TextView) findViewById(R.id.Out);

        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();


                if (name.length() < 5) {
                    alarm("Zu wenig Zeichen");

                } else if (name.length() == 0) {
                    alarm("Kein Text");

                } else if (name.trim().length() == 0) {
                    alarm("Nur Leerzeichen oder kein Text");

                } else {
                    if (isPalindrome(name)) {
                        alarm("Es ist ein Palindrom");
                    } else {
                        alarm("Kein Palindrom");
                    }
                }
            }

            public void alarm(String message){
                out.setText(message);

            }
            public	boolean	isPalindrome(String	str)	{
                return	str.equals(new	StringBuilder(str).reverse().toString());
            }

        });
    }
}
