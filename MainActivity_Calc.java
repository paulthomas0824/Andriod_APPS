package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number_01, number_02;
    Button add,subtract,multiply,divide;

    float result_num;
    float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        number_01 = (EditText)findViewById(R.id.number_01);
        number_02 = (EditText)findViewById(R.id.number_02);

        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number_01.getText().toString());
                num2 = Integer.parseInt(number_02.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number_01.getText().toString());
                num2 = Integer.parseInt(number_02.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number_01.getText().toString());
                num2 = Integer.parseInt(number_02.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number_01.getText().toString());
                num2 = Integer.parseInt(number_02.getText().toString());
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));

            }
        });

    }
}
