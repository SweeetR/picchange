package com.example.backgroundtest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    LinearLayout ll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ll2 = (LinearLayout) findViewById(R.id.ll2);
    }

    /**
     *
     * @param menu
     * @return The method creates an option menu
     */
    @Override public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Space");

        return true;
    }

    /**
     *
     * @param item
     * @return The method changes the background picture to a diffrent picture depends on the option that was chosen
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.clouds)
            ll2.setBackgroundResource(R.drawable.cloud);
        if(id == R.id.sun)
            ll2.setBackgroundResource(R.drawable.sun);
        if(id == R.id.moon)
            ll2.setBackgroundResource(R.drawable.moon);
        if(id == 0)
            ll2.setBackgroundResource(R.drawable.space);
        if(id == R.id.white)
            ll2.setBackgroundColor(Color.WHITE);


        return true;
    }

    /**
     *
     * @param view
     * the method goes back to the first activity
     */
    public void back(View view) {
        finish();
    }
}
