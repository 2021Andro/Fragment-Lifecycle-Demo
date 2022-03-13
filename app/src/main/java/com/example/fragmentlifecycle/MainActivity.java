package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: MainActivity");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: MainActivity");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: MainActivity");

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainerView, new Fragment_1())
                .commit();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: MainActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: MainActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: MainActivity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: MainActivity");

    }


}