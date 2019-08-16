package com.example.bboorjaa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();


    }

    public void signInPhone(View view) {
        EditText phone1 = (EditText) findViewById(R.id.editText);
        EditText pass1 = (EditText) findViewById(R.id.editText2);
        final String phone = phone1.getText().toString();
        String pass = pass1.getText().toString();

        if (phone.matches("") || pass.matches("")) {
            Toast.makeText(this, "You did not enter full Information", Toast.LENGTH_SHORT).show();
            return;
        }
        else{

            auth.signInWithEmailAndPassword(phone, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "welcome " + phone, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, dashboard.class);
                        intent.putExtra("email", phone);
                        startActivity(intent);

                    } else {
                        Toast.makeText(MainActivity.this, "User Not Recognised Ask Manager to approve", Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }
}

