package com.example.arthur_pc.receitas.Activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arthur_pc.receitas.Class.Pratos;
import com.example.arthur_pc.receitas.R;

public class ResultPratosActivity extends AppCompatActivity {

    TextView Nome;
    TextView Ingrediente;
    TextView Descricao;
    ImageView Imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas_result);

        Nome = findViewById(R.id.txtNome);
        Ingrediente = findViewById(R.id.txtIngredientes);
        Descricao = findViewById(R.id.txtDescricao);
        Imagem = findViewById(R.id.imagemPrato);


        Pratos r = (Pratos) getIntent().getSerializableExtra("receita");

        Nome.setText(r.getNome());
        Descricao.setText(r.getDescricao());
        Ingrediente.setText(r.getIngrediente());
        Imagem.setImageResource(r.getImagem());

    }
}
