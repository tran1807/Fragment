package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Button buttonFragA;
//    Button buttonFragB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
         public void AddFragment(View view){
             FragmentManager fragmentManager = getFragmentManager();
             FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

             Fragment fragment = null;

             switch (view.getId()){
                 case R.id.buttonFragA: fragment = new FragmenA();
                 break;
                 case R.id.buttonFragB: fragment = new FragmentB();
                     break;
             }
             //tất cả
//             fragmentTransaction.add(R.id.frameContent,fragment);
             //chọn 1 trong nhiều
             fragmentTransaction.replace(R.id.frameContent,fragment);
             fragmentTransaction.commit();
        }

//        buttonFragA = (Button) findViewById(R.id.buttonFragA);
//        buttonFragB = (Button) findViewById(R.id.buttonFragB);
//
//        buttonFragA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmenA fragmenA = new FragmenA();
//                fragmentTransaction.add(R.id.frameContent,fragmenA);
//                fragmentTransaction.commit();
//            }
//        });
//        buttonFragB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentB fragmenb = new FragmentB();
//                fragmentTransaction.add(R.id.frameContent,fragmenb);
//                fragmentTransaction.commit();
//            }
//        });
//

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        FragmenA fragmenA = new FragmenA();
//        FragmentB fragmentB = new FragmentB();
//
//        fragmentTransaction.add(R.id.frameContent, fragmenA);
//        fragmentTransaction.add(R.id.frameContent, fragmentB);
//        fragmentTransaction.commit();
}