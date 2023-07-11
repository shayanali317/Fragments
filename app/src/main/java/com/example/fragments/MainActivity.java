package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button homebtn, audiobtn, gridbtn, listbtn, videobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homebtn = (Button) findViewById(R.id.homebtn);
        audiobtn = (Button) findViewById(R.id.audiobtn);
        gridbtn = (Button) findViewById(R.id.gridbtn);
        listbtn = (Button) findViewById(R.id.listbtn);
        videobtn = (Button) findViewById(R.id.videobtn);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentReplace(new home());
            }

            Intent homeintent = new Intent(MainActivity.this, home.class);
        });
    }

    private void fragmentReplace(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flayout,fragment);
        fragmentTransaction.commit();

    }
}