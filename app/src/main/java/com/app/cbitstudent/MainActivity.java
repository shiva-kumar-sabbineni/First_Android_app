package com.app.cbitstudent;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText UName;
    private EditText Password;
    private TextView Attempts;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UName = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Attempts = (TextView)findViewById(R.id.attempts);
        Login = (Button)findViewById(R.id.login);
        Attempts.setText("Number of LOGIN attempts left : 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(UName.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if(((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862039")) && (userPassword.equals("Shiv"))) ||
                ((userName.equals("160117862044")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862004")) && (userPassword.equals("Akash"))) // ||
                /*((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan"))) ||
                ((userName.equals("160117862035")) && (userPassword.equals("Charan")))*/
        )
        {
            Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
            startActivity(intent);
        }else {
            counter--;
            Attempts.setText("Number of LOGIN attempts left : "+ String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
        }

    }


}

