package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    //Criar a base de dados para os filmes

    String titulo[] = {"Sonic The Hedgehog","Sonic 2", "Jose do Egito","Pequenos Espiões 3","Mônica Laços","Batman Lego"};
    String desc []={"Um rato azul que corre rapido derrota um homem maluco com bigode, e quer uma familia",
    "Um rato azul, uma rapoza amarela, contra uma equidna vermelha e um careca, paulada 25hrs, mas tem um casamento ainda",
    "Um menino rejeitado pelos seus irmão, é abusado pela sua patroa, vai preso, e se torna um governador, uma linda historia de superação",
    "dois irmãos espiões entrão num mundo de videogame e lutam contra o mal",
    "Uma gorducha, uma gulosa, um cabeça de cebola e um fedido procurando um cacchorro com dois rabos... Ou duas caldas",
    "Um cara rico batendo em pobre na zoeira, tem mordomo, tem carro, tem cavernas, tem robins, e não falta diversão"};
    String score []={"5,0","5,0","5,0","4,8","4,9","5,0"};
    int filmes []={R.drawable.sonico,R.drawable.sonicodois,R.drawable.jose,R.drawable.pequenosespioestres,R.drawable.monicalacos,R.drawable.logobataman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaFilmes = findViewById(R.id.idlistaFilmes);
        MyAdapter adapter = new MyAdapter();


        listaFilmes.setAdapter(adapter);
    }
    //Criando uma inner class MyAdapter
    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return titulo.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //variaveis do modelo
            ImageView imagemfilme;
            TextView titulofilme, descfilme, notafilme;

            //Adaptador ligando ao modelo

            View v = getLayoutInflater().inflate(R.layout.modelo_filme,null);

            //Apresentar as variaveis do java para o modelo xml

            imagemfilme = v.findViewById(R.id.sonicfoto);
            titulofilme = v.findViewById(R.id.idsonictitulo);
            descfilme = v.findViewById(R.id.idsonicdesc);
            notafilme = v.findViewById(R.id.idscore);

            //Inserindo os valores nas variaveis do java
            titulofilme.setText(titulo[i]);
            descfilme.setText(desc[i]);
            notafilme.setText(score[i]);
            imagemfilme.setImageResource(filmes[i]);

            return v;
        }
    }
}