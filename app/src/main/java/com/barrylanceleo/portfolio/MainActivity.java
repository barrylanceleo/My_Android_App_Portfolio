package com.barrylanceleo.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void openApp1 (View view) {
        // Do something in response to button click
        Snackbar.make(view, "This Button will launch my Spotify Streamer App.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void openApp2 (View view) {
        // Do something in response to button click
        Snackbar.make(view, "This Button will launch my Scores App.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void openApp3 (View view) {
        // Do something in response to button click
        Snackbar.make(view, "This Button will launch my Library App.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void openApp4 (View view) {
        // Do something in response to button click
        Snackbar.make(view, "This Button will launch my Build It Bigger App.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void openApp5 (View view) {
        // Do something in response to button click
        Snackbar.make(view, "This Button will launch my XYZ Reader App.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void openApp6 (View view) {
        // Do something in response to button click
        Snackbar.make(view, "This Button will launch my Capstone App.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}
