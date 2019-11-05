package com.example.eva2_4_activity_stack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secundaria extends AppCompatActivity {

    //Intent int2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        //int2 = new Intent(this, MainActivity.class);
    }

    public void clickS(View v){
        //startActivity(int2);
        finish();
    }
}
