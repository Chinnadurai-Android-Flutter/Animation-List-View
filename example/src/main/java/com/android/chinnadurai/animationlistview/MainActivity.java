package com.android.chinnadurai.animationlistview;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ListActivity {
    private static final int NUM_LIST_ITEM = 500;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        List<String> items = getListItems();
        mAdapter = new ListAdapter( this, items );
        setListAdapter( mAdapter );
        getListView().setSelection( items.size() / 2 );
    }

    private ArrayList<String> getListItems() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < NUM_LIST_ITEM; i++) {
            list.add( "Item" + i );
        }
        return list;
    }


}
