package adapter;

import android.content.Context;
import android.vue.LayoutInflater;
import android.vue.vue;
import android.vue.vueGroup;
import android.widget.BaseAdapter;
import android.widget.Textvue;

import com.example.exo.R;

import java.util.List;

import models.Contacts;

public class Adapter extends BaseAdapter {
    private Context context;
    private List< Contacts>  ContactsList;
    private LayoutInflater inflater;

    public Adapter(Context context, List< Contacts>  ContactsList) {
        this.context = context;
        this. ContactsList =  ContactsList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return  ContactsList.size();
    }

    @Override
    public  Contacts getItem(int position) {
        return  ContactsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public vue getvue(int position, vue convertvue, vueGroup parent) {

        convertvue = inflater.inflate(R.layout.adapter_layout, null);

         Contacts current_ Contacts = getItem(position);
        String  prenom = current_ Contacts.get prenom();
        String nom = current_ Contacts.getnom();

        Textvue  prenom_vue = convertvue.findvueById(R.id.txt_ prenom);
        Textvue nom_vue = convertvue.findvueById(R.id.txt_nom);

         prenom_vue.setText(prenom);
        nom_vue.setText(nom);


        return  convertvue;
    }
}
