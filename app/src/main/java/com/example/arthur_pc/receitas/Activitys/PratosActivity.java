package com.example.arthur_pc.receitas.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.arthur_pc.receitas.Adapter.PratosAdapter;
import com.example.arthur_pc.receitas.Class.Pratos;
import com.example.arthur_pc.receitas.R;

import java.util.ArrayList;

public class PratosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratos);

        ArrayList<Pratos> pratos = new ArrayList<>();

        pratos.add(new Pratos("Estrogonofe de Carne",
                "1 kg de carne de sua preferência, como patinho ou coxão mole\n" +
                        "3 cebolas médias\n" +
                        "1 vidro de champignon ou palmito\n" +
                        "sal e pimenta-do-reino a gosto\n" +
                        "2 latas de creme de leite\n" +
                        "3 tomates picados sem pele e sem sementes\n" +
                        "3 colheres (sopa) de óleo de oliva\n" +
                        "2 colheres (sopa) de ketchup\n" +
                        "1 cubo de caldo de carne dissolvido em 100 ml de água",
                "1- Em uma panela, adicione o óleo, a carne, a cebola, os tomates, o caldo de carne e deixe cozinhar por 20 minutos\n" +
                        "\n" +
                        "2- Acrescente o ketchup e o champignon e deixe cozinhar até obter um molho consistente e cremoso\n" +
                        "\n" +
                        "3- Desligue o fogo e acrescente o creme de leite sem soro\n" +
                        "\n" +
                        "4- Mexa até incorporar o molho ao creme\n" +
                        "\n" +
                        "5- Coloque em uma forma refratária e decore com tempero e batata palhaSimples, não? Espero que gostem!\n",
                         R.drawable.estrogocarne
        ));
        pratos.add(new Pratos("Almôndegas",
                "500 g de carne moída\n" +
                        "2 colheres (sopa) de azeite de oliva (30 ml)\n" +
                        "1 xícara de cebola bem picada (60 g)\n" +
                        "Massa\n" +
                        "1 ovo\n" +
                        "150 g de farinha de rosca\n" +
                        "sal a gosto\n" +
                        "pimenta-do-reino a gosto\n" +
                        "395 g de molho de tomate",
                "1- Misture a carne com o ovo, a cebola, o sal, um pouco de azeite de oliva (ou óleo) e a pimenta\n" +
                        "\n" +
                        "2- Agregue a farinha até dar o ponto de enrolar as almôndegas\n" +
                        "\n" +
                        "3- Faça pequenas bolinhas\n" +
                        "\n" +
                        "4- Em uma panela com um pouco de azeite, frite as almôndegas selando-as em fogo alto\n" +
                        "\n" +
                        "5- Retire as almôndegas e reserve\n" +
                        "\n" +
                        "6- Em outra panela, esquente o molho de tomate em fogo baixo\n" +
                        "\n" +
                        "7- Na mesma panela da almôndega, elimine o excesso de azeite e coloque o molho de tomate, colocando as almôndegas para cozinhar por alguns minutos\n" +
                        "\n" +
                        "8- Em cerca de 15 minutos as almôndegas estarão totalmente cozidas e o prato estará pronto",
                         R.drawable.almondega
        ));
        pratos.add(new Pratos("Risoto de Camarão",
                "400 g de camarão cinza limpo\n" +
                        "3 xícaras (chá) de arroz branco\n" +
                        "1 cubo de caldo de camarão\n" +
                        "1/2 xícara (chá) de pimentão verde cortado em cubos pequenos\n" +
                        "1 tomate sem semente cortado em cubos pequenos\n" +
                        "2 colheres de extrato de tomate\n" +
                        "2 dentes de alho\n" +
                        "1 colher (sopa) de azeite\n" +
                        "sal\n" +
                        "1/2 limão\n"
                ,
                "1- Tempere o camarão com limão e sal, reserve por 10 minutos\n" +
                        "\n" +
                        "2- Enquanto isso, faça o arroz, fritando-o muito bem\n" +
                        "\n" +
                        "3- Em seguida, coloque água em uma panela, o suficiente para cobrir o arroz (sobrando uns 2 centímetros a mais do que o arroz no fundo da panela)\n" +
                        "\n" +
                        "4- Coloque pouco sal, pois o molho do camarão levará o cubo de caldo de camarão\n" +
                        "\n" +
                        "5- Cozinhe em fogo baixo até que toda água seque\n" +
                        "\n" +
                        "6- E uma frigideira grande, que caiba todo o camarão, doure o alho e coloque todo o camarão sem o suco do limão\n" +
                        "\n" +
                        "7- Junte o tomate, o pimentão, o cheiro-verde, o extrato de tomate e o cubo de caldo de camarão\n" +
                        "\n" +
                        "8- Adicione um pouco de água, para que tenha molho suficiente para encobrir o camarão na frigideira\n" +
                        "\n" +
                        "9- Cozinhe em fogo baixo por 5 minutos\n" +
                        "\n" +
                        "10- Enquanto isso, retire o arroz e coloque-o em um recipiente de cerâmica ou vidro, solte-o bastante com o garfo\n" +
                        "\n" +
                        "11- Junte o molho do camarão e misture, usando em uma das mãos um garfo, e em outra mão uma colher\n" +
                        "\n" +
                        "12- Decore com camarões grelhados e coentro, sirva bem quente!",
                        R.drawable.risocamarao
        ));
        pratos.add(new Pratos("Carne de Panela",
                        "500 g de coxão mole cortado em bifes\n" +
                        "1 cebola ralada\n" +
                        "1 dente de alho amassado\n" +
                        "1/2 xícara chá de óleo\n" +
                        "sal e pimenta-do-reino a gosto\n" +
                        "1 colher sopa de salsinha picada\n" +
                        "500 ml de água quente\n" +
                        "1/2 lata de massa de tomate\n" +
                        "1 pimentão verde picado\n" +
                        "1 tomate sem sementes picado\n" +
                        "1 cenoura pequena picada\n" +
                        "orégano a gosto",
                "1- Em uma panela de pressão, coloque o óleo junte a cebola, alho e refogue bem\n" +
                        "\n" +
                        "2- Acrescente a carne frite por 5 minutos mexendo bem, depois coloque o tempero em pó sabor umami (opcional), tomate, pimentão, massa de tomate, cenoura e a seguir acrescente a água orégano\n" +
                        "\n" +
                        "3- Deixe cozinhar por 30 minutos contando o inicio da fervura, assim que a carne estiver cozida retire do fogo, misture a salsinha e sirva em seguida com arroz branco",
                        R.drawable.carnedepanela
                ));

        pratos.add(new Pratos("Yakissoba Da Casa",
                "300 g de espaguete\n" +
                        "1 cebola grande cortada em pedaços médios\n" +
                        "1 colher (sopa) de óleo\n" +
                        "1/2 maço pequeno de brócolis\n" +
                        "1/2 maço pequeno de couve-flor\n" +
                        "10 colheres (sopa) de molho shoyu\n" +
                        "400 g de carne cortada em tiras\n" +
                        "100 g de champignon\n" +
                        "1 cenoura cortada em rodelas\n" +
                        "250 ml de água\n" +
                        "1 colher (sopa) de amido de milho, dissolvido em 50 ml de água\n" +
                        "acelga a gosto",
                "1- Cozinhe o macarrão em ponto al dente e reserve\n" +
                        "\n" +
                        "2- Em uma panela, adicione o azeite, a cebola, a carne e refogue bem\n" +
                        "\n" +
                        "3- Adicione o molho shoyu e cozinhe por 3 minutos em fogo médio\n" +
                        "\n" +
                        "4- Acrescente mais água, aguarde levantar fervura e adicione o amido de milho\n" +
                        "\n" +
                        "5- Mexa até engrossar, abaixe o fogo e adicione o champignon, a couve-flor, o brócolis e a cenoura\n" +
                        "\n" +
                        "6- Cozinhe por 8 minutos e acrescente, por último, a acelga e o macarrão\n" +
                        "\n" +
                        "7-Misture bem, acerte o sal e tampe a panela por mais 1 minuto\n" +
                        "\n" +
                        "8- Adicione o molho shoyu e cozinhe por 3 minutos em fogo médio\n" +
                        "\n" +
                        "9- Está pronto para servir!",
                R.drawable.yakisoba
        ));

        final PratosAdapter adapter = new PratosAdapter(this,pratos);
        ListView list = (ListView) findViewById(R.id.listaPratos);
        list.setAdapter(adapter);

        final Intent intent = new Intent(PratosActivity.this,ResultPratosActivity.class);

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

