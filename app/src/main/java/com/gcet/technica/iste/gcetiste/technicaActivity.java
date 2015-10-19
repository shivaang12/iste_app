package com.gcet.technica.iste.gcetiste;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class technicaActivity extends ActionBarActivity {
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technica);
        toolbar = (Toolbar) findViewById(R.id.toolbox_technica);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_technica, menu);
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

    public void technicaTechEventClick(View v) {
        Intent i = new Intent(technicaActivity.this, technicaTechEvent.class);
        startActivity(i);
    }

    public void technicaNonTechEventClick(View v){
        Intent i = new Intent(technicaActivity.this, technicaNonTechActivity.class);
        startActivity(i);
    }

    public void pythonEventClick(View v){
        Intent i = new Intent(technicaActivity.this,pythonWorkshop.class);
        startActivity(i);
    }

    public void scheEventClick(View v){
        Intent i = new Intent(technicaActivity.this,scheduleActivity2.class);
        startActivity(i);
    }

}
