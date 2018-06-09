package com.example.my.deshbordextend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView bank,idea,add,link,wifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initalizing cardview
        bank = findViewById(R.id.bank);
        idea = findViewById(R.id.idea);
        add  = findViewById(R.id.add);
        link = findViewById(R.id.link);
        wifi = findViewById(R.id.wifi);
        //click

        bank.setOnClickListener(this);
        idea.setOnClickListener(this);
        add.setOnClickListener(this);
        link.setOnClickListener(this);
        wifi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.bank:
                i = new Intent(this,bank.class);startActivity(i); break;
            case R.id.idea:
                i = new Intent(this,IdeaActivity.class);startActivity(i);break;
            case R.id.add:
                i = new Intent(this,add.class);startActivity(i); break;
            case R.id.link:
                i = new Intent(this,lInk.class);startActivity(i);break;
            case R.id.wifi:
                i = new Intent(this,wifi.class);startActivity(i);break;

        }
    }
}
