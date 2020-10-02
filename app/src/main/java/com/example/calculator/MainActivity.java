package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText type;
    EditText type2;
    TextView result;
    Button btn;
    String textn;



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.equals);
        result = (TextView) findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i=new Intent(MainActivity.this,Result.class);
                textn=result.getText().toString();
                i.putExtra("Calculator",textn);
                startActivity(i);
                finish();
            }

        });
        type = (EditText) findViewById(R.id.type);
        type2 = (EditText) findViewById(R.id.type2);


    }
    public void pluss(View view) {
        double n1 = Integer.parseInt(type.getText().toString());
        double n2 = Integer.parseInt(type2.getText().toString());
        double n = n1 + n2;
        result.setText(String.valueOf(n));
    }

    public void minuss(View view) {
        double n1 = Integer.parseInt(type.getText().toString());
        double n2 = Integer.parseInt(type2.getText().toString());
        double n = n1 - n2;
        result.setText(String.valueOf(n));

    }

    public void mul(View view) {
        double n1 = Integer.parseInt(type.getText().toString());
        double n2 = Integer.parseInt(type2.getText().toString());
        double n = n1 *n2;
    }
    public void div(View view) {
        double n1 = Integer.parseInt(type.getText().toString());
        double n2 = Integer.parseInt(type2.getText().toString());
        double n = n1 / n2;
        result.setText(String.valueOf(n));
    }
}