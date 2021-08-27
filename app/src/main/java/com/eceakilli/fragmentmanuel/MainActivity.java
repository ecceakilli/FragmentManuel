package com.eceakilli.fragmentmanuel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void goToFirst(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();  //fragmanlarla calısmak için gerekli.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); //fragmentlarla yapılacak olan işlemlere baslayacagımı söyluyorum

        FirstFragment firstFragment = new FirstFragment(); //fragment objesi
        fragmentTransaction.replace(R.id.frame_layout,firstFragment).commit(); //hangi fragmenti nerde kullanacagını tanımlarsın

    }
    public  void goToSecond(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();
        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();

    }
}