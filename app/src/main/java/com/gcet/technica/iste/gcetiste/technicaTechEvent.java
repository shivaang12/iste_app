package com.gcet.technica.iste.gcetiste;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class technicaTechEvent extends ActionBarActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technica_tech_event);
        toolbar = (Toolbar) findViewById(R.id.toolbox_technica_techEvent);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_technica_tech_event, menu);
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

    public void mechatricianEventClick(View v) {
        Intent i = new Intent(technicaTechEvent.this, mechatricianEvent.class);
        startActivity(i);
    }

    public void scientistEventClick(View v) {
        Intent i = new Intent(technicaTechEvent.this, scientistEvent.class);
        startActivity(i);
    }

    public void codeEventClick(View v) {
        Intent i = new Intent(technicaTechEvent.this, codeStorm.class);
        startActivity(i);
    }

    public void smartEventClick(View v) {
        Intent i = new Intent(technicaTechEvent.this, SmartOFastEvent.class);
        startActivity(i);
    }

}
