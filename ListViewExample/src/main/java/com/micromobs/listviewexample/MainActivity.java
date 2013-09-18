package com.micromobs.listviewexample;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    final String TAG = "MainActivity";
    ListView listView;
    ItemsAdapter itemsAdapter;
    ArrayList<Item> items;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items = new ArrayList<Item>();

        items.add(new Item("item 1"));
        items.add(new Item("item 2"));
        items.add(new Item("item 3"));
        items.add(new Item("item 4"));
        items.add(new Item("item 5"));
        items.add(new Item("item 6"));
        items.add(new Item("item 7"));
        items.add(new Item("item 8"));
        items.add(new Item("item 9"));
        items.add(new Item("item 10"));
        items.add(new Item("item 11"));
        items.add(new Item("item 12"));
        items.add(new Item("item 13"));
        items.add(new Item("item 14"));
        items.add(new Item("item 15"));
        items.add(new Item("item 16"));
        items.add(new Item("item 17"));
        items.add(new Item("item 18"));
        items.add(new Item("item 19"));
        items.add(new Item("item 20"));
        items.add(new Item("item 21"));
        items.add(new Item("item 22"));
        items.add(new Item("item 23"));
        items.add(new Item("item 24"));
        items.add(new Item("item 25"));
        items.add(new Item("item 26"));
        items.add(new Item("item 27"));
        items.add(new Item("item 28"));
        items.add(new Item("item 29"));
        items.add(new Item("item 30"));
        items.add(new Item("item 31"));
        items.add(new Item("item 32"));
        items.add(new Item("item 33"));
        items.add(new Item("item 34"));
        items.add(new Item("item 35"));
        items.add(new Item("item 36"));
        items.add(new Item("item 37"));
        items.add(new Item("item 38"));
        items.add(new Item("item 39"));
        items.add(new Item("item 40"));
        items.add(new Item("item 41"));
        items.add(new Item("item 42"));
        items.add(new Item("item 43"));
        items.add(new Item("item 44"));
        items.add(new Item("item 45"));
        items.add(new Item("item 46"));
        items.add(new Item("item 47"));
        items.add(new Item("item 48"));
        items.add(new Item("item 49"));
        items.add(new Item("item 50"));

        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView1);

        itemsAdapter = new ItemsAdapter(this, items) {};
        listView.setAdapter(itemsAdapter);

    }


}
