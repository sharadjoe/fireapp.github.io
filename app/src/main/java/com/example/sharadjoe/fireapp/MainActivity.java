package com.example.sharadjoe.fireapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private EditText mvaluefield;
    private Button maddbtn;
    private EditText mkeyvalue;

    private DatabaseReference mrootref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrootref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fireapp-2bf2c.firebaseio.com/users");

        mkeyvalue =(EditText) findViewById(R.id.keyvalue);
        mvaluefield =(EditText) findViewById(R.id.valuefield);
        maddbtn =(Button) findViewById(R.id.addbtn);

        maddbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = mvaluefield.getText().toString();
                String key = mkeyvalue.getText().toString();

                DatabaseReference childref = mrootref.child(key);

                //childref.setValue(value);

                childref.setValue(value);

            }
        });


    }
}
