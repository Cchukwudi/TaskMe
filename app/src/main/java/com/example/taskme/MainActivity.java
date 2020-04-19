package com.example.taskme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> itemList;
    String data;
    private Button check;
    private EditText items;
    private EditText prices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        items = (EditText) findViewById(R.id.food);
        prices = (EditText) findViewById(R.id.price);

        check = (Button) findViewById(R.id.test);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemList.add("@+id/food" + "@+id/price");
                data = itemList.get(0).toString();


                showToast(data);


            }
        });
    }
    private void showToast(String text){
        Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT).show();

    }
}
