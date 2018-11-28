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

    public class PaesActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_paes);

            ArrayList<Pratos> pratos = new ArrayList<>();
            pratos.add(new Pratos("Pão Caseiro",
                    "1 kg de farinha de trigo\n" +
                            "2 ovos\n" +
                            "1 gema para pincelar\n" +
                            "2 sachês de fermento biológico seco (20 g)\n" +
                            "500 ml de leite morno\n" +
                            "1 colher (sopa) de sal\n" +
                            "½ xícara de açúcar (125 g)\n"+
                            "½ xícara (125 ml) de óleo ou manteiga derretida ou margarina derretida" ,
                    "1- Coloque em uma bacia o trigo e o fermento, misture bem e reserve\n" +
                            "\n" +
                            "2- Coloque o leite em uma panela e leve ao fogo para amornar (não pode ferver)\n" +
                            "\n" +
                            "3- Abra um espaço no meio do trigo e acrescente o açúcar, o sal, os ovos e o óleo, mexa bem\n" +
                            "\n" +
                            "4- Em seguida acrescente o leite morno e misture com uma colher\n" +
                            "\n" +
                            "5- A massa não deve ficar seca demais, se ficar muito mole acrescente um pouco de farinha de trigo e sove bem por uns 3 minutos para misturar\n" +
                            "\n" +
                            "6- A massa estará no ponto quando não grudar mais nas mãos\n" +
                            "\n" +
                            "7- Divida a massa em porções (número de pães desejados)\n" +
                            "\n" +
                            "8- Em uma tábua de vidro (de preferência) abra a massa com um rolo ou garrafa de vidro\n" +
                            "\n" +
                            "9- Em seguida enrole para modelar os pães\n" +
                            "\n" +
                            "10- Em uma assadeira untada e enfarinhada coloque os pães deixando um bom espaço entre eles para que a massa possa crescer\n" +
                            "\n" +
                            "11- Deixe descansar de 40 a 60 minutos ou até dobrarem de tamanho\n" +
                            "\n" +
                            "12- Antes de levar ao forno, misture a gema com uma colher (sopa) de leite liquido e pincele os pães\n" +
                            "\n" +
                            "13- Leve ao forno preaquecido, inicialmente durante 10 minutos a 160 °C\n" +
                            "\n" +
                            "14- Ao fim desse tempo aumente para 180 °C por mais 20 minutos ou até ficar dourado\n",
                    R.drawable.paocaseiro
            ));
            pratos.add(new Pratos("Pão de Alho",
                            "5 dentes de alho\n" +
                            "1 caixa de creme de leite de 200 ml\n" +
                            "\n" +
                            "2 sachê de sazón sabor carne\n" +
                            "1 pote de maionese de 500 ml\n" +
                            "1 poção de orégano (a gosto)\n",
                    "Cobertura\n" +
                            "1- Coloque os 5 dentes de alho e o creme de leite no liquidificador e bata por 1 minuto\n" +
                            "\n" +
                            "2- Acrescente a maionese, Sazón e orégano e bata por mais 1 minuto e meio\n" +
                            "\n" +
                            "3- Quando virar uma pasta e passe no pão e coloque para assar na churrasqueira\n" +
                            "\n" +
                            "4- Pode colocar em forno elétrico ou a gás, o tempo depende do forno\n",
                    R.drawable.paodealho
            ));
            pratos.add(new Pratos("Pão de Batata",
                    "3 ovos\n" +
                            "1 copo de leite\n" +
                            "1 copo de óleo\n" +
                            "1 copo de água\n" +
                            "1/2 copo de açúcar\n" +
                            "4 batatinhas médias cozidas\n" +
                            "1 colher de sopa de sal\n" +
                            "2 colheres de margarina\n" +
                            "1 kg de farinha de trigo\n" +
                            "1 pacotinho de fermento para pães\n",
                    "1- Misture o fermento com o açúcar, em uma bacia grande\n" +
                            "\n" +
                            "2- Bata no liquidificador todos os ingredientes, menos a farinha\n" +
                            "\n" +
                            "3- Despeje o liquido na bacia, acrescente a farinha, amasse bem\n" +
                            "\n" +
                            "4- Cubra com um plástico e pano e espere crescer por 2 horas\n" +
                            "\n" +
                            "5- Faça os pãezinhos, e coloque nas assadeiras apenas polvilhadas com farinha\n" +
                            "\n" +
                            "6- Espere crescer por mais 30 minutos\n" +
                            "\n" +
                            "7- Asse em forno pré-aquecido a 180° graus por aproximadamente 20 minutos, não precisa corar muito\n",

                    R.drawable.paodebatata

            ));
            pratos.add(new Pratos("Pão de Calabresa",
                            "1 calabresa\n" +
                            "4 fatias de queijo mussarela\n" +
                            "4 xícaras de trigo\n" +
                            "1 colher (sopa) de fermento de pão\n" +
                            "1 colher (sopa) de sal\n" +
                            "2 colheres (sopa) de açúcar\n" +
                            "1 colher (sopa) de manteiga\n" +
                            "1 ovo\n" +
                            "água morna\n" +
                            "orégano a gosto\n",
                    "1- Em uma vasilha coloque o trigo, sal, açúcar e o fermento\n" +
                            "\n" +
                            "2- Misture bem e acrescente o ovo e a margarina, mexa bem\n" +
                            "\n" +
                            "3- Coloque água morna até dar o ponto (até que a massa solte da mão)\n" +
                            "\n" +
                            "4- Deixe-a descansar por 30 minutos\n" +
                            "\n" +
                            "5- Pique a calabresa e o queijo\n" +
                            "\n" +
                            "6- Abra a massa com o rolo e acrescente a calabresa e queijo\n" +
                            "\n" +
                            "7- Tudo em um lado da massa\n\n" +
                            "\n" +
                            "8- Corte tiras no outro lado da massa e enrole como um rocambole\n" +
                            "\n" +
                            "9- Passe a gema de ovo por cima e orégano\n" +
                            "\n" +
                            "10- Asse por 30 minutos a 180º C\n" +
                            "", R.drawable.paodecalabresa
            ));

            pratos.add(new Pratos("Pão de Queijo",
                    "4 copos de polvilho doce (500 g)\n" +
                            "1 colher (sopa) tempero ou sal a gosto\n" +
                            "2 copos (americano) de leite (300 ml)\n" +
                            "1 copo (americano) de óleo (150 ml)\n" +
                            "2 ovos grandes ou 3 pequenos\n" +
                            "4 copos (americano) de queijo minas meia cura ralado\n" +
                            "óleo para untar\n",
                    "1- Coloque o polvilho em uma tigela grande\n" +
                            "\n" +
                            "2- À parte, aqueça o sal, o leite e o óleo\n" +
                            "\n" +
                            "3- Quando ferver, escalde o polvilho com essa mistura, mexa muito bem para desfazer pelotinhas\n" +
                            "\n" +
                            "4- Deixe esfriar\n" +
                            "\n" +
                            "5- Acrescente os ovos, um a um, alternando com o queijo e sovando bem após cada adição\n" +
                            "\n" +
                            "6- Unte as mãos com óleo, se necessário\n" +
                            "\n" +
                            "7- Enrole bolinhos de 2 cm de diâmetro e coloque-os em uma assadeira untada\n" +
                            "\n" +
                            "8- Leve ao forno médio (180º C), preaquecido\n" +
                            "\n" +
                            "9- Asse até ficarem douradinhos\n",
                    R.drawable.paodequeijo
            ));

            final PratosAdapter adapter = new PratosAdapter(this,pratos);
            ListView list = (ListView) findViewById(R.id.listaPaes);
            list.setAdapter(adapter);

            final Intent intent = new Intent(PaesActivity.this,ResultPratosActivity.class);

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


