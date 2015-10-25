package com.patels95.sanam.gaiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent mainIntent = getIntent();
        String name = mainIntent.getStringExtra(MainActivity.USER_NAME);
        Toast.makeText(SecondActivity.this, name, Toast.LENGTH_LONG).show();
    }

}
