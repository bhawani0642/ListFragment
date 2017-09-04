package com.acadgild.listfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Pri on 8/16/2017.
 */
//Created a class Listfragment by extending the listfragment class and implementing the onitemclicklistner
public class ListFrag extends android.app.ListFragment implements AdapterView.OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflating the layout
        View view = inflater.inflate(R.layout.listfragment, container, false);
        //returning the view
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //taking the instance of arrayadapter and getting the string array  and displaying it in the simple list
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Planets, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {

        String data = (String) parent.getItemAtPosition(position);

        Toast.makeText(getActivity(), "data: " + data, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(),FragmentClicked.class);
        intent.putExtra("DATAPASSED",data);
        startActivity(intent);
    }
}


