package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Number1,Number2;
    private TextView res;
    private Button Calculer;
    private RadioButton Add,Suss,Mult,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1= (EditText) findViewById(R.id.txtN1);
        Number2= (EditText) findViewById(R.id.txtN2);
        res = (TextView) findViewById(R.id.txtRes);
        Add = (RadioButton) findViewById(R.id.rdAdd);
        Suss = (RadioButton) findViewById(R.id.rdSus);
        Mult = (RadioButton) findViewById(R.id.rdMul);
        Div = (RadioButton) findViewById(R.id.rdDiv);
        Calculer=(Button) findViewById(R.id.btnCalcule);
        Calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add.isChecked()){
                    double result =Double.parseDouble(Number1.getText().toString()) +Double.parseDouble(Number2.getText().toString());
                    res.setText(""+result );
                } else if (Suss.isChecked()) {
                    double result =Double.parseDouble(Number1.getText().toString()) -Double.parseDouble(Number2.getText().toString());
                    res.setText(""+result );
                } else if (Mult.isChecked()) {
                    double result =Double.parseDouble(Number1.getText().toString()) *Double.parseDouble(Number2.getText().toString());
                    res.setText(""+result );
                } else if (Div.isChecked()) {
                    if (Number2.getText().toString().equals("0")){
                        res.setText("imposible de diviser sur 0 ");
                    }else{
                        double result =Double.parseDouble(Number1.getText().toString()) -Double.parseDouble(Number2.getText().toString());
                        res.setText(""+result );
                    }
                }
            }
        });
    }
}