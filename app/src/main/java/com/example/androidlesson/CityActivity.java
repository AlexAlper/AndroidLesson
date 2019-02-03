package com.example.androidlesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);


        Intent intent = getIntent();
        String message = intent.getStringExtra("city");

        TextView textView = (TextView) findViewById(R.id.cirt_id);
        textView.setText(message);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonBack:
                finish();
                break;
            default:
                break;
        }
    }


}
