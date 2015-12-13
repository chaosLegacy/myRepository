package com.example.sousou.my_pro_1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public void ButtonNext(View view){
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
    }

    TextView val1;
    TextView val2;
    TextView val3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define cerated vatiables with ids in the view
        val1 = (TextView) findViewById(R.id.val1);
        val2 = (TextView) findViewById(R.id.val2);
        val3 = (TextView) findViewById(R.id.val3);
        val3.setFreezesText(true);

        btn1 = (Button) findViewById(R.id.btnSum);
        // Set event listner on click for button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(val1.getText().toString());
                int n2 = Integer.parseInt(val2.getText().toString());

                int somme = n1 + n2;
                val3.setText(String.valueOf(somme));
            }
        });
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
    }
}
