package com.ng.campusbuddy.Start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ng.campusbuddy.MainActivity;
import com.ng.campusbuddy.R;

public class StartActivity extends AppCompatActivity {

    private Button LoginButton, SignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Initlogin();
        Initsignup();
    }

    private void Initlogin() {

        LoginButton = (Button) findViewById(R.id.login_btn);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login = new Intent(StartActivity.this, MainActivity.class);
                startActivity(login);
                finish();
            }
        });
    }

    private void Initsignup() {

        SignUpButton = (Button) findViewById(R.id.signup_btn);

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signup = new Intent(StartActivity.this, MainActivity.class);
                startActivity(signup);
                finish();
            }
        });
    }
}
