package com.example.favoritetoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Todo 1: Declare textView Variable mToyListTextView
    TextView mToyListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo 3: use findViewByID to get reference of textView from layout
        mToyListTextView = findViewById(R.id.tv_toy_names);

        //todo 4: use static toyBox.getToyNames method and store names in string array
        String[] toyNames  = ToyBox.getToyNames();

        //todo 5: loop through each toy name and apped the name to text view form string array

    }
}

// todo Tasks for this ex 1 of toys app..Developing android apps
/*
    #1 change constraint layout to frame layout
    #2  Remove old constraint layout attributes
    #3 give the text view 6dp padding & textSize to 20sp
 */

// todo Tasks for this ex 2 of toys app..Developing android apps
/*
    #1 Declare textView Variable mToyListTextView
    #2 Add id for text view tv_toy_names
    #3 Use findViewById to reference to that view  from layout
    #4 use static toyBox.getToyNames method and store names in string array
    #5 loop through each toy name and apped the name to text view form string array
 */