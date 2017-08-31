package josh.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Detail1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
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

        setTitle("Committee Info");


        String newString;
        String newString1= null;
        String newString2= null;
        String newString3= null;
        String newString4= null;
        String newString5= null;
        if (savedInstanceState == null) {
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
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
            newString1= (String) savedInstanceState.getSerializable("STRING_I_NEED1");
            newString2= (String) savedInstanceState.getSerializable("STRING_I_NEED2");
            newString3= (String) savedInstanceState.getSerializable("STRING_I_NEED3");
            newString4= (String) savedInstanceState.getSerializable("STRING_I_NEED4");
            newString5= (String) savedInstanceState.getSerializable("STRING_I_NEED5");
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


    }

}
