package com.example.backgroundtest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    /**@author Roy Tendler
     * @version 1
     * @since 06/11/2019
     */

    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);
    }

    /**
     *
     * @param menu
     * @return The method creates an option menu
     */
     @Override public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

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
            ll.setBackgroundResource(R.drawable.cloud);
        if(id == R.id.sun)
            ll.setBackgroundResource(R.drawable.sun);
        if(id == R.id.moon)
            ll.setBackgroundResource(R.drawable.moon);
        if(id == R.id.white)
            ll.setBackgroundColor(Color.WHITE);


        return true;
    }

    /**
     *
     * @param view
     * the method moves to the next activity
     */
    public void next(View view) {
        Intent si = new Intent(this,Main2Activity.class);
        startActivity(si);
    }
}
 