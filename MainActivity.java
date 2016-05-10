package com.shabk.myappportfolio;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button popularMovies = (Button)findViewById(R.id.b1);
        popularMovies.setBackgroundColor(Color.rgb(46,61,73));
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will lunch Popular Movies app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button StockHawk = (Button)findViewById(R.id.b2);
        StockHawk.setBackgroundColor(Color.rgb(46,61,73));
        StockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will lunch Stock Hawk", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button BuilditBigger = (Button)findViewById(R.id.b3);
        BuilditBigger.setBackgroundColor(Color.rgb(46,61,73));
        BuilditBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will lunch Build it Bigger!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button MakeYourAppMaterial = (Button)findViewById(R.id.b4);
        MakeYourAppMaterial.setBackgroundColor(Color.rgb(46, 61, 73));
        MakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will lunch Make Your App Material", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button GoUbiquitous = (Button)findViewById(R.id.b5);
        GoUbiquitous.setBackgroundColor(Color.rgb(46, 61, 73));
        GoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will lunch Go Ubiquitous", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button Capstone = (Button)findViewById(R.id.b6);
        Capstone.setBackgroundColor(Color.rgb(46,61,73));
        Capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Snackbar.make(view, "This button will lunch Capstone",Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();}});
       //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
            //}
        //});
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
}
