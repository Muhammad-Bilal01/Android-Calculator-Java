package com.example.android_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editfirstText, editSecondText;
    TextView answerTxt;

    Button addBtn,subBtn,mulBtn,divBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editfirstText = findViewById(R.id.edt_first);
        editSecondText = findViewById(R.id.edt_second);
        answerTxt = findViewById(R.id.txt_answer);
        addBtn = findViewById(R.id.btn_add);
        subBtn = findViewById(R.id.btn_subtract);
        mulBtn = findViewById(R.id.btn_multiply);
        divBtn = findViewById(R.id.btn_divide);

    addBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int fistVal = Integer.parseInt(editfirstText.getText().toString());
            int secondVal = Integer.parseInt(editSecondText.getText().toString());

            answerTxt.setText("Result = " + (fistVal + secondVal));
        }
    });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fistVal = Integer.parseInt(editfirstText.getText().toString());
                int secondVal = Integer.parseInt(editSecondText.getText().toString());

                answerTxt.setText("Result = " + (fistVal - secondVal));
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fistVal = Integer.parseInt(editfirstText.getText().toString());
                int secondVal = Integer.parseInt(editSecondText.getText().toString());

                answerTxt.setText("Result = " + (fistVal * secondVal));
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fistVal = Integer.parseInt(editfirstText.getText().toString());
                int secondVal = Integer.parseInt(editSecondText.getText().toString());

                answerTxt.setText("Result = " + (fistVal / secondVal));
            }
        });

    }

}