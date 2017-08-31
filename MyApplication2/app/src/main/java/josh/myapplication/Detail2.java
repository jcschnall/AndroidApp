package josh.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Detail2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setTitle("Bill Info");


        String newString;
        String newString1= null;
        String newString2= null;
        String newString3= null;
        String newString4= null;
        String newString5= null;
        String newString6= null;
        String newString7= null;
        String newString8= null;
        String newString9= null;


        if(savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("STRING_I_NEED");
                newString1 = extras.getString("STRING_I_NEED1");
                newString2 = extras.getString("STRING_I_NEED2");
                newString3 = extras.getString("STRING_I_NEED3");
                newString4 = extras.getString("STRING_I_NEED4");
                newString5 = extras.getString("STRING_I_NEED5");
                newString6 = extras.getString("STRING_I_NEED6");
                newString7 = extras.getString("STRING_I_NEED7");
                newString8 = extras.getString("STRING_I_NEED8");
                newString9 = extras.getString("STRING_I_NEED9");

            }
        } else {
            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
            newString1= (String) savedInstanceState.getSerializable("STRING_I_NEED1");
            newString2= (String) savedInstanceState.getSerializable("STRING_I_NEED2");
            newString3= (String) savedInstanceState.getSerializable("STRING_I_NEED3");
            newString4= (String) savedInstanceState.getSerializable("STRING_I_NEED4");
            newString5= (String) savedInstanceState.getSerializable("STRING_I_NEED5");
            newString6= (String) savedInstanceState.getSerializable("STRING_I_NEED6");
            newString7= (String) savedInstanceState.getSerializable("STRING_I_NEED7");
            newString8= (String) savedInstanceState.getSerializable("STRING_I_NEED8");
            newString9= (String) savedInstanceState.getSerializable("STRING_I_NEED9");
        }



        if(newString8 =="") {
            newString8 = "None";
        }
        if(newString9==""){
            newString9="None";
        }


        // Set the Text to try this out
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(newString);  //tokenData

        TextView t1 = (TextView) findViewById(R.id.textView6);
        t1.setText(newString1);  //tokenData

        TextView t2 = (TextView) findViewById(R.id.textView12);
        t2.setText(newString2);  //tokenData

        TextView t3 = (TextView) findViewById(R.id.textView16);
        t3.setText(newString3);  //tokenData

        TextView t4 = (TextView) findViewById(R.id.textView20);
        t4.setText(newString4);  //tokenData

        TextView t5 = (TextView) findViewById(R.id.textView24);
        t5.setText(newString5);  //tokenData

        TextView t6 = (TextView) findViewById(R.id.textView31);
        t6.setText(newString6);  //tokenData

        TextView t7 = (TextView) findViewById(R.id.textView34);
        t7.setText(newString7);  //tokenData

        TextView t8 = (TextView) findViewById(R.id.textView41);
        t8.setText(newString8);  //tokenData

        TextView t9 = (TextView) findViewById(R.id.textView36);
        t9.setText(newString9);  //tokenData




    }





}



