package com.example.a3rd_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class DiceActivity extends AppCompatActivity {
    private Button btnRoll ;
    private TextView txtResult,txtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        int valuer= getIntent().getIntExtra("value",0);
        btnRoll=(Button) findViewById(R.id.btnRoll);
        txtResult=(TextView) findViewById(R.id.txtResult);
        txtTitle=(TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(""+valuer+" sided dice");
        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecureRandom random=  new SecureRandom();
                int r = random.nextInt(valuer)+1;
                txtResult.setText(""+r);
            }
        });
    }
}