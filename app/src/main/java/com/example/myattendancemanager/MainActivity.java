package com.example.myattendancemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static int login_iterate=0;
    Button login;
    Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // if(login_iterate==0) {
            setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.activity_get_min_attendance);
                }
            });
        next1 = (Button) findViewById(R.id.next1);
            next1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.activity_set_attendance);
                }
            });
        //}
        //else {
            //setContentView(R.layout.activity_main);
        //}

    }

    @Override
    protected void onStop() {
        super.onStop();
        login_iterate++;
    }
}