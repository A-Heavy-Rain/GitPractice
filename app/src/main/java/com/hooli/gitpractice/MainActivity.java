package com.hooli.gitpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1commit master
        test("cesi2");
        // 1commit merge
        getApplication();

    }
    private void test(String s){

    }
}
