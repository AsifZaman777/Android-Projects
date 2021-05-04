package com.example.myapplication;

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

 private EditText name;
 private EditText password;
 private Button Login;
 private  int counter=3;
 private double result=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.userName);
        password=(EditText) findViewById(R.id.userPassword);
        Login=(Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ///database//
                if(name.getText().toString().equals("asif")&&
                        password.getText().toString().equals("asif"))
                {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else if(name.getText().toString().equals("mim")&&
                        password.getText().toString().equals("mim"))
                {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else if(name.getText().toString().equals("jubair")&&
                        password.getText().toString().equals("jubair"))
                {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else if(name.getText().toString().equals("tamim")&&
                        password.getText().toString().equals("tamim"))
                {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else if(name.getText().toString().equals("prottoy")&&
                        password.getText().toString().equals("prottoy"))
                {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else if(name.getText().toString().equals("ovy")&&
                        password.getText().toString().equals("ovy"))
                {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else
                {
                    counter--;
                    Toast.makeText(MainActivity.this, "Attempt remaining "+ counter, Toast.LENGTH_SHORT).show();
                    if (counter==0)
                    {
                        Login.setEnabled(false);
                    }
                }
                
            };

        });
    }

}