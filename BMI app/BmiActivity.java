package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BmiActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
      EditText height,weight;
      Button calculate;
      TextView calculation;

      height=(EditText) findViewById(R.id.userH);
      weight=(EditText) findViewById(R.id.userW);

      calculate=(Button) findViewById(R.id.calc);
      calculation=(TextView) findViewById(R.id.bmiResult);


       calculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String heightString=height.getText().toString();
               String weightString=weight.getText().toString();

               ///float///
               float user_height=Float.parseFloat(heightString);
               float user_weight=Float.parseFloat(weightString);

               float res=calculation(user_weight,user_height);
               calculation.setText("Your BMI is : "+res);


           }
       });

    }
    public float calculation(float userW,float userH)
    {
        return userW/(userH*userH);
    }

    public void comment()
    {

    }

}