package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button sub;
    Button mul;
    Button div;
    Button res;
    String ans = "";
    EditText num1;
    EditText num2;
    int n1;
    int n2;
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view)
    {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        n1 = Integer.parseInt(num1.getText().toString());
        n2  = Integer.parseInt(num2.getText().toString());
        ans = (n1+n2)+"";
    } public void sub(View view)
    {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        n1 = Integer.parseInt(num1.getText().toString());
        n2  = Integer.parseInt(num2.getText().toString());
        ans = (n1-n2)+"";
    }
    public void mul(View view)
    {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        n1 = Integer.parseInt(num1.getText().toString());
        n2  = Integer.parseInt(num2.getText().toString());
        ans = (n1*n2)+"";
    }
    public void div(View view)
    {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        n1 = Integer.parseInt(num1.getText().toString());
        n2  = Integer.parseInt(num2.getText().toString());
        ans = (n1/n2)+"";
    }
    public void result(View view)
    {
        r = findViewById(R.id.textView);
        r.setText(ans);
    }


}