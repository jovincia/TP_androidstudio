package com.example.exo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.vue.vue;
import android.widget.Adaptervue;
import android.widget.Listvue;

import java.util.ArrayList;
import java.util.List;

import adapter.Adapter;
import models. Contacts;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentvue(R.layout.activity_main3);
        this.setTitle("Liste des contacts");

        List< Contacts>  ContactsList = new ArrayList<>();
        Listvue listvue = (Listvue) findvueById(R.id.list Contacts) ;
         ContactsList.add(new  Contacts("MAGENGO", "Toto", 19,"Masculin","66666667"));
         ContactsList.add(new  Contacts("TATA", "Lili", 20,"Féminin","90222221"));
         ContactsList.add(new  Contacts("ALI", "Baba", 50,"Masculin","97989900"));
         ContactsList.add(new  Contacts("BA", "Mariam", 19,"Féminin","67000001"));
         ContactsList.add(new  Contacts("TATI", "Fatima", 35,"Féminin","96979899"));

        listvue.setAdapter(new Adapter(this, ContactsList));

        listvue.setOnItemClickListener(new Adaptervue.OnItemClickListener() {
            @Override
            public void onItemClick(Adaptervue<?> parent, vue vue, int position, long id) {
                 Contacts item = ( Contacts) parent.getItemAtPosition(position);
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra(" Contacts_ first", item.get first());
                intent.putExtra(" Contacts_ last", item.get last());
                intent.putExtra(" Contacts_ cel", item.get cel());
                intent.putExtra(" Contacts_sexe", item.getSexe());

                startActivity(intent);
            }
        });
    }
}
