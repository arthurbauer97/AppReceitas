package com.example.arthur_pc.receitas.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arthur_pc.receitas.Class.Pratos;
import com.example.arthur_pc.receitas.R;

import java.util.List;

public class PratosAdapter extends ArrayAdapter<Pratos> {

    public PratosAdapter(@NonNull Context context, @NonNull List<Pratos> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_lista_de_receitas, parent, false);
        }

        Pratos current = getItem(position);
        TextView nome = (TextView) listItemView.findViewById(R.id.txtNomePrato);
        ImageView imagem = listItemView.findViewById(R.id.imgPrato);

        nome.setText(current.getNome().toString());
        imagem.setImageResource(current.getImagem());

        return listItemView;
    }
}
