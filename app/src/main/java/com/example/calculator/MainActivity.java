package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText FirstValue , SecondValue;
    TextView tvAns;
    Button add ,subtract, multiply ,divide ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstValue = findViewById(R.id.etFirstValue);
        SecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAnswer);
        add = findViewById(R.id.Add);
        subtract = findViewById(R.id.Subtract);
        multiply = findViewById(R.id.Multiply);
        divide = findViewById(R.id.Division);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , answer;
                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());
                answer = firstValue + secondValue;
                Toast.makeText(MainActivity.this, "ADDITION", Toast.LENGTH_SHORT).show();
                tvAns.setText(firstValue + "+" + secondValue + "=" + answer);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , answer;
                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());
                answer = firstValue - secondValue;
                Toast.makeText(MainActivity.this, "SUBTRACTION", Toast.LENGTH_SHORT).show();
                tvAns.setText(firstValue + "-" + secondValue + "=" + answer);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , answer;
                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());
                answer = firstValue * secondValue;
                Toast.makeText(MainActivity.this, "MULTIPLICATION", Toast.LENGTH_SHORT).show();
                tvAns.setText(firstValue + "*" + secondValue + "=" + answer);

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , answer;
                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());
                answer = firstValue / secondValue;
                Toast.makeText(MainActivity.this, "DIVISION", Toast.LENGTH_SHORT).show();
                tvAns.setText(firstValue + "/" + secondValue + "=" + answer);
            }
        });

    }
}