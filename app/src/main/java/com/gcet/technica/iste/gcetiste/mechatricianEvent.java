package com.gcet.technica.iste.gcetiste;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class mechatricianEvent extends ActionBarActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechatrician_event);
        toolbar = (Toolbar) findViewById(R.id.toolbox_mechatrician);
        setSupportActionBar(toolbar);

    }

    public class MyTextView extends TextView {

        public MyTextView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            init();
        }

        public MyTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
            init();
        }

        public MyTextView(Context context) {
            super(context);
            init();
        }

        public void init() {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/roboto_thin.ttf");
            setTypeface(tf ,1);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mechatrician_event, menu);
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


}
