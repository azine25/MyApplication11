package com.geek.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // почтальон который переходит между фрагментами
        // getSupportFragmentManager является главным менеджером фрагментов, мы к нему обращаемся, то есть спрашиваем разрешение
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, new First());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
}