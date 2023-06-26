package com.example.librarytest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_test_lib_1.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld.printlog("tagggg", "methooooodddd");
    }
}