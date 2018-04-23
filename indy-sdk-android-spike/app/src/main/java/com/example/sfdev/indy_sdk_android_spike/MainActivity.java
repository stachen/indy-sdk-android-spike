package com.example.sfdev.indy_sdk_android_spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText("Blah blah");
            }
        });
    }
}
