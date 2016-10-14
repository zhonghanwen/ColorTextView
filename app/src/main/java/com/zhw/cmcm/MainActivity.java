package com.zhw.cmcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ColorTextView)findViewById(R.id.ctv_text))
                .findAndSetStrColor("You", "#ff8000")
                .findAndSetStrColor("can", "#008888");
    }
}
