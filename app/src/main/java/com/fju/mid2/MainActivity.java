package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



private Button bfunction1;
    private Button bfunction2;
    private Button bfunction3;
    private Button bfunction4;
    private Button bfunction5;
    private Button bfunction6;
    private Button bfunction7;

    private Button bfunction8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bfunction1 = (Button) findViewById(R.id.b_funcion1);
        Button bfunction2 = (Button) findViewById(R.id.b_function2);
        Button bfunction3 = (Button) findViewById(R.id.b_function3);

        Button bfunction4 = (Button) findViewById(R.id.b_function4);
        Button bfunction5 = (Button) findViewById(R.id.b_function5);
        Button bfunction6 = (Button) findViewById(R.id.b_function6);
        Button bfunction7 = (Button) findViewById(R.id.b_function7);
        Button bfunction8 = (Button) findViewById(R.id.b_function8);

    }
    public void login(View view){
        EditText bfunction = findViewById(R.id.b_function3);


    }
}

