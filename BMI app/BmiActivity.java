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

               if (heightString.equals(""))
               {
                   height.setError("Please insert your height");
                   height.requestFocus();
                   return;
               }
               if (weightString.equals(""))
               {
                   weight.setError("Please insert your weight");
                   weight.requestFocus();
                   return;
               }
               ///float///
               float user_height=Float.parseFloat(heightString);
               float user_weight=Float.parseFloat(weightString);

               float bmi=calculation(user_weight,user_height);
               calculation.setText("Your BMI is :  "+String.format("%0.2f",bmi)); // String format added
               comment(bmi);
           }
       });
    }


    public float calculation(float userW,float userH)
    {
        return userW/(userH*userH);
    }

    public void comment(float res)
    {
      if (res<=18.0 && res>1)
      {
          Toast.makeText(this, "Very weak", Toast.LENGTH_LONG).show();
      }
      else if(res>18 && res<20)
      {
          Toast.makeText(this, "Average", Toast.LENGTH_LONG).show();
      }
      else if(res>20 && res<22)
      {
          Toast.makeText(this, "ARMY MAN", Toast.LENGTH_LONG).show();
      }
      else if(res>22 && res<24)
      {
          Toast.makeText(this, "Perfect", Toast.LENGTH_LONG).show();
      }
      else if(res>24 && res<30)
      {
          Toast.makeText(this, "Heavy weight", Toast.LENGTH_LONG).show();
      }
      else if(res>30 && res<40)
      {
          Toast.makeText(this, "Very heavy", Toast.LENGTH_LONG).show();
      }
      else if(res>40 && res<50)
      {
          Toast.makeText(this, "Excessive weight", Toast.LENGTH_LONG).show();
      }
      else if(res>50)
      {
          Toast.makeText(this, "Way to death", Toast.LENGTH_LONG).show();
      }
     else
      {
          Toast.makeText(this, "Recheck the values", Toast.LENGTH_LONG).show();
      }

    }

}
