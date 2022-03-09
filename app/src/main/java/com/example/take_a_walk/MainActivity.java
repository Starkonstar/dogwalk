package com.example.take_a_walk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Enter_login, Enter_password;
    private Button Button_continue, Button_sign_in;
    private TextView text_Access;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enter_login = findViewById(R.id.Enter_login);
        Enter_password = findViewById(R.id.Enter_password);
        Button_continue = findViewById(R.id.Button_continue);
        Button_sign_in = findViewById(R.id.Button_sign_in);
        text_Access = findViewById(R.id.text_Access);

        Button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((Enter_login.getText().toString().trim().equals(""))||(Enter_password.getText().toString().trim().equals("")))
                    Toast.makeText(MainActivity.this,R.string.no_user_input,Toast.LENGTH_LONG).show();
                else {
                    Intent intent = new Intent("com.example.take_a_walk.Dogs_list");
                    startActivity(intent);
                }

            }
        });
    }

}