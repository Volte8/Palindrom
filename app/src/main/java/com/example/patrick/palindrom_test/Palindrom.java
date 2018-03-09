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
                String name= editText.getText().toString();


                if(name.length()<5){
                    alarm("Zu wenig Zeichen");
                    }

                if(name.length()==0){
                    alarm("Error");
                }

                if(name==" "){
                    alarm("Nur ein Leerzeichen");
                }

                if(isPalindrome(name)) {
                    alarm("Es ist ein Palindrom");
                }
                    else
                        {
                        alarm("Kein Palindrom");
                    }
                }

            public void alarm(String message){
                editText.setText(message);
            }
            public	boolean	isPalindrome(String	str)	{
                return	str.equals(new	StringBuilder(str).reverse().toString());
            }

        });
    }
}
