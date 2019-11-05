package com.example.eva2_4_activity_stack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent int1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int1 = new Intent(this, secundaria.class);
    }

    public void click(View v){
        startActivity(int1);
    }

}
