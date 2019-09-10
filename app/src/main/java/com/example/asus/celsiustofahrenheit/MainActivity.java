package com.example.asus.celsiustofahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText text1 = (EditText)findViewById(R.id.t1);
        double celcius  = Double.parseDouble(text1.getText().toString());
        double farenheit = (celcius*9/5.0 + 32);
        TextView tv = findViewById(R.id.t2);
        tv.setText(farenheit + " F");


    }
}
