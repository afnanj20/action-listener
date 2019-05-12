package com.example.actionlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    EditText num1,num2;
    Button add,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.num1Txt);
        num2=(EditText) findViewById(R.id.num2Txt);
        sub=(Button)findViewById(R.id.SUB);
        add=(Button)findViewById(R.id.ADD);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number1=num1.getText().toString();
        String number2=num2.getText().toString();
        switch (v.getId()){
            case R.id.ADD:

                if (number1.equals("")||number2.equals("")){
                    Toast.makeText(this, "please enter the number", Toast.LENGTH_SHORT).show();
                }else{

                    Double i=Double.parseDouble(number1);
                    Double j=Double.parseDouble(number2);
                    Double z=i+j;
                    Toast.makeText(this, "ANSWER=  "+z, Toast.LENGTH_LONG).show();
                }
            case R.id.SUB:
                if (number1.equals("")||number2.equals("")){
                    Toast.makeText(this, "please enter the number", Toast.LENGTH_SHORT).show();
                }else{

                    Double i=Double.parseDouble(number1);
                    Double j=Double.parseDouble(number2);
                    Double z=i-j;
                    Toast.makeText(this, "ANSWER=  "+z, Toast.LENGTH_LONG).show();
                }
        }

    }
}
