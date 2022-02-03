package com.example.salik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class second extends AppCompatActivity {
    public static  final String Msg2 = "com.example.salik.key2";
    public static  final String Msg3 = "com.example.salik.key3";
    public static  final String Msg4 = "com.example.salik.key4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent getIntent = getIntent();
       String val1=  getIntent.getStringExtra(MainActivity.Msg);

        Intent getIntent1 = getIntent();
        String val2 = getIntent1.getStringExtra(MainActivity.Msg1);


        TextView tv1_2 = (TextView) findViewById(R.id.tv1_2);
        TextView tv2_2 = (TextView) findViewById(R.id.tv2_2);
        TextView tv3_2 = (TextView) findViewById(R.id.tv3_2);

        Button btn2 = (Button) findViewById(R.id.btn2);




        tv1_2.setText(val1);
        tv2_2.setText(val2);

        Random r = new Random();
        int rannum = r.nextInt(99-10)+10;

        String Ran = rannum+"";

        tv3_2.setText(Ran);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secIntent = new Intent(second.this,third.class);
                secIntent.putExtra(Msg2,val1);
                secIntent.putExtra(Msg3,val2);
                secIntent.putExtra(Msg4,Ran);

                startActivity(secIntent);



            }
        });
    }
}