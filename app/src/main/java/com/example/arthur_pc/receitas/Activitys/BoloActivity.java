package com.example.arthur_pc.receitas.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.arthur_pc.receitas.Adapter.PratosAdapter;
import com.example.arthur_pc.receitas.Class.Pratos;
import com.example.arthur_pc.receitas.R;

import java.util.ArrayList;

public class BoloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolos);

        ArrayList<Pratos> pratos = new ArrayList<>();
        pratos.add(new Pratos("Bolo de Banana Integral",
                "4 ovos inteiros\n" +
                        "6 bananas caturra cortadas em rodelas\n" +
                        "1/2 xícara de chá de óleo de canola\n" +
                        "1/2 xícara de leite desnatado\n" +
                        "1 xícara de chá de farinha de trigo integral\n" +
                        "1 xícara de chá de aveia\n" +
                        "2 xícaras de chá, não muito cheias, de açúcar mascavo\n" +
                        "canela para salpicar\n" +
                        "1 colher de sopa de fermento em pó\n"
                ,

                "1- Bata todos os ingredientes no liqüidificador com apenas 1 banana, coloque em forma untada com óleo e farinha\n" +
                        "\n" +
                        "2- Ponha as rodelas de banana sobre essa massa e salpique com canela\n" +
                        "\n" +
                        "3- Assar em forno pré-aquecido, a 180° por aproximadamente 50 minutos\n",
                R.drawable.bolodebanana
        ));
        pratos.add(new Pratos("Bolo Formigueiro",
                "4 colheres de sopa de margarina\n" +
                        "1 e 1/2 copo de açúcar\n" +
                        "4 ovos (claras em neve)\n" +
                        "2 copos de farinha de trigo\n" +
                        "1 copo de leite\n" +
                        "100 g de chocolate granulado Dr. Oetker\n" +
                        "100 g de coco ralado Dr. Oetker\n" +
                        "1 colher (sopa) de fermento em pó Dr. Oetker\n"
                ,

                "1- Bata a margarina com o açúcar até ficar cremoso, junte as gemas e continue batendo\n" +
                        "\n" +
                        "2- Acrescente o leite e os demais ingredientes\n" +
                        "\n" +
                        "3- Por último, acrescente as claras em neve, mexendo delicadamente\n" +
                        "\n" +
                        "4- Leve para assar em forno quente\n" +
                        "\n" +
                        "5- Faça uma cobertura de chocolate se preferir\n",
                R.drawable.boloformigueiro
        ));
        pratos.add(new Pratos("Bolo Gelado",
                "Para a massa\n" +
                        "5 ovos\n" +
                        "3 xícaras (chá) de açúcar\n" +
                        "1 xícara (chá) de leite\n" +
                        "2 xícaras (chá) de farinha de trigo\n" +
                        "1 colher (sopa) de fermento em pó\n" +
                        "\n" +
                        "Para a calda\n" +
                        "400g de leite condensado\n" +
                        "400ml de leite\n" +
                        "200ml de leite de coco\n" +
                        "Coco ralado para cobrir\n"
                ,

                "Para a massa\n" +
                        "1- Bata as claras em neve \n" +
                        "\n" +
                        "2- Junte as gemas, bata mais um pouco e adicione o açúcar, ainda batendo \n" +
                        "\n" +
                        "3- Coloque o leite e depois a farinha com o fermento \n" +
                        "\n" +
                        "4- Leve para assar em fôrma untada em forno pré-aquecido a 180º C por 40 minutos ou até a massa ficar firme e dourada \n" +
                        "\n" +
                        "Calda:\n" +
                        "5- Para fazer a calda, misture os ingredientes líquidos, depois banhe o bolo ainda quente com a calda e deixe esfriar \n" +
                        "\n" +
                        "6- Passe pelo côco ralado, embrulhe no papel alumínio e leve à geladeira\n",
                R.drawable.bologelado
        ));
        pratos.add(new Pratos("Bolo de Chocolate ",
                "Massa\n" +
                        "1 xícara(s) (chá) de leite\n" +
                        "1 xícara(s) (chá) de óleo de soja\n" +
                        "2 unidade(s) de ovo\n" +
                        "2 xícara(s) (chá) de farinha de trigo\n" +
                        "1 xícara(s) (chá) de achocolatado em pó\n" +
                        "1 xícara(s) (chá) de açúcar\n" +
                        "1 colher(es) (sopa) de fermento químico em pó\n" +
                        "Cobertura\n" +
                        "2 colher(es) (sopa) de manteiga\n" +
                        "3 colher(es) (sopa) de achocolatado em pó\n" +
                        "3 colher(es) (sopa) de açúcar\n" +
                        "5 colher(es) (sopa) de leite",
                "Massa\n" +
                        "1- Coloque os líquidos no liqüidificador e bata até misturar bem\n" +
                        "\n" +
                        "2- Coloque os outros ingredientes, sendo o fermento o último\n" +
                        "\n" +
                        "3- Leve para assar em forno médio, numa forma untada e enfarinhada\n" +
                        "\n" +
                        "Cobertura\n" +
                        "1- Para a cobertura, misture numa panela a manteiga, o achocolatado, o açúcar e o leite\n" +
                        "\n" +
                        "2- Leve ao fogo até derreter e a calda ficar homogênea\n" +
                        "\n" +
                        "3- Cubra o bolo ainda quente, furadinho com garfo",
                R.drawable.bolodechocolate
        ));

        pratos.add(new Pratos("Bolo de Cenoura",
                "Massa\n" +
                        "1/2 xícara (chá) de óleo\n" +
                        "3 cenouras médias raladas\n" +
                        "4 ovos\n" +
                        "2 xícaras (chá) de açúcar\n" +
                        "2 e 1/2 xícaras (chá) de farinha de trigo\n" +
                        "1 colher (sopa) de fermento em pó\n" +
                        "Cobertura\n" +
                        "1 colher (sopa) de manteiga\n" +
                        "3 colheres (sopa) de chocolate em pó\n" +
                        "1 xícara (chá) de açúcar\n" +
                        "1 xícara (chá) de leite",
                "Massa\n" +
                        "1- Em um liquidificador, adicione a cenoura, os ovos e o óleo, depois misture\n" +
                        "\n" +
                        "2- Acrescente o açúcar e bata novamente por 5 minutos\n" +
                        "\n" +
                        "3- Em uma tigela ou na batedeira, adicione a farinha de trigo e depois misture novamente\n" +
                        "\n" +
                        "4- Acrescente o fermento e misture lentamente com uma colher\n" +
                        "\n" +
                        "5- Asse em um forno preaquecido a 180° C por aproximadamente 40 minutos\n" +
                        "\n" +
                        "Cobertura\n" +
                        "1- Despeje em uma tigela a manteiga, o chocolate em pó, o açúcar e o leite, depois misture\n" +
                        "\n" +
                        "2- Leve a mistura ao fogo e continue misturando até obter uma consistência cremosa, depois despeje a calda por cima do bolo",
                R.drawable.bolodecenoura
        ));
        final PratosAdapter adapter = new PratosAdapter(this,pratos);
        ListView list = (ListView) findViewById(R.id.listaBolo);
        list.setAdapter(adapter);

        final Intent intent = new Intent(BoloActivity.this,ResultPratosActivity.class);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pratos p = (Pratos) adapterView.getItemAtPosition(i);
                intent.putExtra("receita",p);
                startActivity(intent);
            }
        });
    }
}

