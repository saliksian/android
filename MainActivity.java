package com.example.salik;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String Msg = "com.example.salik.Key";
    public static final String Msg1 = "com.example.salik.Key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView res = (TextView) findViewById(R.id.res);

        Button btn1 = (Button) findViewById(R.id.btn1);

        String str1 = tv1.getText().toString();
        int num1 = Integer.parseInt(str1);

        String str2 = tv2.getText().toString();
        int num2 = Integer.parseInt(str2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = num1+num2;
                String T = result+"";

                res.setText(T);


                Intent myIntent = new Intent(MainActivity.this,second.class);
                myIntent.putExtra(Msg,str1);
                myIntent.putExtra(Msg1,str2);
                startActivity(myIntent);
            }
        });





    }
}