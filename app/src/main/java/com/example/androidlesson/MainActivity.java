package com.example.androidlesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView)findViewById(R.id.listView);
        final TextView choice = (TextView) findViewById(R.id.choice);

        final String[] cityNames = getResources().getStringArray(R.array.city_names);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, cityNames);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                // по позиции получаем выбранный элемент
                String selectedItem = cityNames[position];
                // установка текста элемента TextView
                choice.setText(selectedItem);
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

             //   Intent intent = new Intent(this, CityActivity.class);
               TextView txt = (TextView) findViewById(R.id.choice);
                Intent intent = new Intent(this, CityActivity.class);
                intent.putExtra("city",txt.getText().toString());


                startActivity(intent);
                break;
            default:
                break;
        }
    }





}
