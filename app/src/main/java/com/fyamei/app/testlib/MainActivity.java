package com.fyamei.app.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fyamei.app.tlibrary.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.show(MainActivity.this,"ceshi");
            }
        });
    }
}
