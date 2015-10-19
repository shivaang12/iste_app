package com.gcet.technica.iste.gcetiste;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class technicaNonTechActivity extends ActionBarActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technica_non_tech);
        toolbar = (Toolbar) findViewById(R.id.toolbox_technica_nontechEvent);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_technica_non_tech, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void counterEventClick(View v){
        Intent i = new Intent(technicaNonTechActivity.this,counterEvent.class);
        startActivity(i);
    }

    public void soccerManiacEventClick(View v){
        Intent i = new Intent(technicaNonTechActivity.this,SoccerManiac.class);
        startActivity(i);
    }

    public void snapItEventClick(View v){
        Intent i = new Intent(technicaNonTechActivity.this,snapIt.class);
        startActivity(i);
    }
}
