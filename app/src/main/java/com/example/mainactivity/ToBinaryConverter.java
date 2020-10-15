package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ToBinaryConverter extends AppCompatActivity {

    private EditText num;
    private Button conv;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.etNum);
        conv = (Button) findViewById(R.id.btnConv);
        answer = (TextView) findViewById(R.id.tvAns);

        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input = Integer.parseInt(num.getText().toString());
                String bin= Integer.toBinaryString(input);
                answer.setText(bin);
            }
        });
    }
}