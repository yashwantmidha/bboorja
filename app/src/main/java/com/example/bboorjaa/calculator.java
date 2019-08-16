package com.example.bboorjaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        // we will fetch the current prices that will be available on final version
    }

    public void calc(View view) {

        Toast.makeText(calculator.this, "This Option is not available now", Toast.LENGTH_LONG).show();
   /*    // TextView price1 = (TextView) findViewById(R.id.currentPrice);
       EditText packages = (EditText) findViewById(R.id.editText2);


      //   String price  = price1.getText().toString();
         String pack  = packages.getText().toString();

       /*  int pr = Integer.parseInt(price);
         int pa = Integer.parseInt(pack);


         Integer calc1 = pr * pa ;


         String cal = calc1.toString();

         TextView test = (TextView) findViewById(R.id.textView3);
         test.setText(pack);*/

    }
}
