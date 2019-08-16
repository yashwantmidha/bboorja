package com.example.bboorjaa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class dashboard extends AppCompatActivity {
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        auth = FirebaseAuth.getInstance();
    }


    public void historyNavigation(View view) {


    Handler handler = new Handler();


            Intent intent = new Intent(dashboard.this, history.class);
            startActivity(intent);

}

    public void calc(View view) {
        Handler handler = new Handler();


        Intent intent = new Intent(dashboard.this, calculator.class);
        startActivity(intent);
    }

    public void about(View view){
    Handler handler = new Handler();


    Intent intent = new Intent(dashboard.this, about.class);
    startActivity(intent);
}

    public void orderNow(View view) {
        Toast.makeText(dashboard.this, "This Option is not available now", Toast.LENGTH_LONG).show();
    }

    public void signOut(View view) {


        auth.signOut();
        Intent intent = new Intent(dashboard.this, MainActivity.class);
        Toast.makeText(dashboard.this, "sign Out Successful", Toast.LENGTH_LONG).show();

        startActivity(intent);
    }
}