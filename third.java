package com.example.salik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv1_3 = (TextView) findViewById(R.id.tv1_3);

        Intent getIntent = getIntent();
        String val1=  getIntent.getStringExtra(second.Msg2);

        Intent getIntent1 = getIntent();
        String val2 = getIntent1.getStringExtra(second.Msg3);

        Intent getIntent2 = getIntent();
        String val3 = getIntent2.getStringExtra(second.Msg4);

        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);
        int num3 = Integer.parseInt(val3);

        int res = num1+num2+num3;

        String Result = res+"";

        tv1_3.setText(Result);







    }
}