package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.adapter_layout, null);

         Contacts current_ Contacts = getItem(position);
        String  prenom = current_ Contacts.get prenom();
        String nom = current_ Contacts.getnom();

        TextView  prenom_view = convertView.findViewById(R.id.txt_ prenom);
        TextView nom_view = convertView.findViewById(R.id.txt_nom);

         prenom_view.setText(prenom);
        nom_view.setText(nom);


        return  convertView;
    }
}
