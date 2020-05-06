package com.example.fragmentosseparados;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Info_Animal_Activity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_activiti);

        Intent intent= getIntent();
        if(intent!=null){

            String animal= intent.getStringExtra("animal");
            FragmentManager fragmentManager= getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

            Info_Animal_Fragmet info_animal_fragmet= new Info_Animal_Fragmet();
            Bundle args = new Bundle();
            args.putString("animal",animal);
            info_animal_fragmet.setArguments(args);

            fragmentTransaction.replace(R.id.fragment_info_animal, info_animal_fragmet);
            fragmentTransaction.commit();
        }

    }
}
