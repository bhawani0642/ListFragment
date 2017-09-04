package com.acadgild.listfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Pri on 8/16/2017.
 */

public class FragmentClicked extends AppCompatActivity {


        TextView text;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.frag_clicked);
             //Making java object of textview
            text = (TextView) findViewById(R.id.textView);
            //getting the data from the intent
            String data = getIntent().getExtras().getString("DATAPASSED");
              //using setText method to set the data
            text.setText(data);

        }
    }

