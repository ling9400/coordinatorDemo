package com.qk.coordinatordemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnCo).setOnClickListener(this);
        findViewById(R.id.btnView).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent();
        switch(view.getId()){
            case R.id.btnView:
                in.setClass(MainActivity.this, ActivityView.class);
                break;
            case R.id.btnCo:
                in.setClass(MainActivity.this, ActivityCoordinator.class);
                break;
        }
        startActivity(in);
    }
}
