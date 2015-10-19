package com.gcet.technica.iste.gcetiste;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class AboutRec extends ActionBarActivity {

    Toolbar toolbar;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_rec);
        toolbar = (Toolbar) findViewById(R.id.toolbox_about_rec);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<AboutData> data = new ArrayList<AboutData>();
        data.add(new AboutData(R.drawable.makvana,"Dr. Vijay Makwana","Faculty Coordinator"));
        data.add(new AboutData(R.drawable.sangani,"Deep Sangani","Chairperson"));
        data.add(new AboutData(R.drawable.axar,"Axar Lathia","Vice chairperson"));
        data.add(new AboutData(R.drawable.jayraj,"Jayraj Desai","Secretary"));
        data.add(new AboutData(R.drawable.shivansh,"Shivansh Srivastava","Technical Head"));
        data.add(new AboutData(R.drawable.jignesh,"Jignesh Talavania","Technical Head"));
        data.add(new AboutData(R.drawable.savan,"Savan Patel","Non Technical Head"));
        data.add(new AboutData(R.drawable.shivang,"Shivang Patel","Designer Head"));
        data.add(new AboutData(R.drawable.rishiraj,"Rushiraj Brahmbhatt","Campaigning Head"));
        data.add(new AboutData(R.drawable.saili,"Saili Gupta","Documentation Head"));
        data.add(new AboutData(R.drawable.mansi,"Mansi Sutaria","Decoration Head"));
        data.add(new AboutData(R.drawable.lakhan,"Lakhan Modhwadia","Volunteer Head"));



        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(data);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_rec, menu);
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
