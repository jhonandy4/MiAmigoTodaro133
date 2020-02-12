package com.example.miamigotodaro13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class nemote extends AppCompatActivity {



    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    SharedPreferences preferences;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nemote);


        mRecyclerView=findViewById(R.id.recyclerView);

        preferences = this.getSharedPreferences("My_Pref", MODE_PRIVATE);

        getMyList();




    }

    private void getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new  Model();
        m.setTitle("Núcleos de la base");
        m.setDescription("El núcleo es el cuerpo central de las células o conjuntos de neuronas, bien delimitados, que se encuentran en el sistema nervioso central. Unos núcleos están formados por neuronas sensitivas, otros por neuronas motoras, y todavía se puede considerar un tercer grupo, formado por neuronas internunciales, es decir, núcleos que no son ni sensitivos, ni motores, sino que tienen una significación moduladora; p. ej., la oliva bulbar y los núcleos del puente. En el cuadro sinóptico adjunto aparecen reseñados los principales núcleos y centros nerviosos.\u200B\n" +
                "\n" +
                "Estructura neurológica - Núcleos(núcleos) basales\n" +
                "\n" +
                "Núcleo caudado - Núcleo caudado\n" +
                "Núcleo lenticular - Globo pálido más putamen\n" +
                "Claustro - Claustro\n" +
                "Cuerpo estriado = Núcleo caudado más núcleo lenticular\n" +
                "Neoestriado (estriado) - Núcleo caudado más putamen\n" +
                "Cuerpo amigdalino - Núcleo amigdalino\n" +
                "Núcleo estriado.\n" +
                "");
        m.setImg(R.drawable.nemot_basales);
        models.add(m);

        m = new  Model();
        m.setTitle("Miembro superior");
        m.setDescription("Los músculos ayudan a sostener el hombro y permiten la movilidad de la articulación en todas direcciones. Los más importantes para el funcionamiento del hombro son:2\n" +
                "\t•\tEl músculo supraespinoso. Realiza la abducción o separación del brazo.\n" +
                "\t•\tEl músculo subescapular. Realiza la rotación interna.\n" +
                "\t•\tEl músculo infraespinoso. Realiza la rotación externa.\n" +
                "\t•\tEl músculo redondo menor. Contribuye a la rotación externa.\n" +
                "\t•\tEl músculo redondo mayor. Contribuye a la extensión.\n" +
                "\t•\tEl músculo deltoides. Realiza la extensión, flexión y la abducción.\n" +
                "\t•\tEl músculo pectoral mayor. Interviene en la aducción o aproximación, la flexión y la extensión.\n" +
                "\t•\tEl músculo dorsal ancho. Interviene en la extensión y la aducción.\n" +
                "\t•\tEl músculo coracobraquial. Aduce al húmero.\n" +
                "\t•\tEl músculo trapecio. Eleva, retrae y rota externamente la escapula.\n" +
                "\t•\tEl músculo serrato anterior. Rota la escapula y la tracciona anteriormente contra la pared torácica.\n" +
                "");
        m.setImg(R.drawable.nemot_brazo);
        models.add(m);

        m = new  Model();
        m.setTitle("Miembro superior - mano");
        m.setDescription("El carpo está formado por ocho huesos cortos dispuestos en dos hileras o filas, una superior o antebraquial y otra inferior o metacarpiana. En conjunto, forman un macizo óseo con forma de canal de concavidad anterior por donde pasan tendones de músculos flexores, además de alguna rama nerviosa y vascular. La mayoría de estos huesos tienen forma más o menos cúbica, pudiendo distinguir en ellos seis caras: las caras anterior y posterior corresponden a las caras palmar y dorsal de la mano, respectivamente; las caras superior, inferior, laterales y mediales son articulares, excepto las caras laterales y mediales de los huesos situados en las partes extremas de ambas filas del carpo.\n" +
                "");
        m.setImg(R.drawable.nemot_carpo);
        models.add(m);

        m = new  Model();
        m.setTitle("Retina - conos y bastones");
        m.setDescription("Los bastones se ocupan de la visión periférica y se encuentran fuera de la parte central de la retina. Son muy numerosos –casi 120 millones–, y son responsables de la visión nocturna porque son muy sensibles a la luz de baja intensidad. Por el contrario, se vuelven completamente ciegos ante luz de alta intensidad y, por lo tanto, carecen de importancia respecto a la visión diurna o a la agudeza visual. Al no ser capaces de distinguir los colores, dan lugar a una visión acromática.\n" +
                "Los conos, que varían en número de 6 a 7 millones, le permiten al ojo humano tener una agudeza visual (capacidad del ojo de resolver y percibir detalles pequeños en un objeto) y de diferenciar los colores. Se concentran en la parte central pequeña amarillenta de la retina, conocida como «mácula». En el centro de esta región se encuentra la fóvea, una zona de 0,3 milímetros de diámetro sin ningún bastón\n" +
                "");
        m.setImg(R.drawable.nemot_conosbast);
        models.add(m);

        m = new  Model();
        m.setTitle("Hioides");
        m.setDescription("Músculos suprahioideos\n" +
                "\n" +
                "Son aquellos músculos que se ubican por sobre el hueso hioides, entre éste y las estructuras óseas de la zona anteroinferior de la cabeza (triángulos submentoniano y subamndibular).\n" +
                "Los músculos suprahiodeos forman el piso de la boca y elevan el hueso hioides y los infrahiodeos hacen descender al hioides.\n" +
                "Las funciones principales de este grupo muscular son el descenso de la mandíbula durante los procesos masticatorios y fonéticos, así como la fijación del hueso hioides para facilitar la acción de los músculos infrahioideos en los procesos de deglución.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Músculos infrahioideos\n" +
                "\n" +
                "Los músculos infrahioideos se encuentran por debajo del hueso hioides. Estos músculos fijan el hueso hioides y descienden el hioides y la laringe durante la deglución y el habla. También contribuyen a la flexión de la cabeza. Están situados en 2 planos: unos profundo y otro superficial.\n" +
                "Este grupo muscular que contribuye al descenso mandibular durante la apertura de la boca, fijando el hueso hioides para la acción del grupo muscular suprahioídeo.\n" +
                "");
        m.setImg(R.drawable.nemot_hioides);
        models.add(m);

        m = new  Model();
        m.setTitle("Manguito rotador");
        m.setDescription("El manguito de los rotadores es un término anatómico aplicado al conjunto de músculos y tendones que proporcionan estabilidad al hombro. Todos estos músculos conectan la escápula con la cabeza del húmero, formando un puño en la articulación. Su importancia estriba en que mantienen la cabeza del húmero dentro de la cavidad glenoidea de la escápula. Este manguito forma continuidad con la cápsula de la articulación del hombro. El conjunto incluye los siguientes músculos:\n" +
                "\n" +
                "El supraespinoso se origina en la fosa supraespinosa de la escápula y se inserta en el tubérculo mayor del húmero. Realiza los primeros 15 a 20 grados de separación del miembro superior del tronco, durante la abducción del brazo.\n" +
                "El infraespinoso se origina en la fosa infraespinosa de la escapúla y se inserta en el tubérculo mayor del húmero. Rota el brazo externamente.\n" +
                "El redondo menor, actualmente llamado teres minor, se origina en la fosa infraespinosa, a lo largo del borde lateral de la escápula y se inserta en el tubérculo mayor del húmero, y también rota el brazo externamente.\n" +
                "El subescapular, proveniente de la fosa subescapular de la escápula, se inserta en el tubérculo menor del húmero. Este músculo rota internamente el húmero.\n" +
                "");
        m.setImg(R.drawable.nemot_manguirot);
        models.add(m);

        m = new  Model();
        m.setTitle("Miembro inferior - pierna");
        m.setDescription("Los músculos de la pierna son en general músculos alargados, con un largo tendón que cruza la articulación del tobillo. Todos ellos están envueltos por la fascia profunda de la pierna de la que parten los tabiques intermusculares anterior y posterior que forman 3 compartimentos musculares. En total, se contabilizan 13 músculos distribuídos de la manera siguiente: 4 en el compartimento anterior, 2 en el compartimento lateral y 5 en el compartimento posterior (si bien uno de ellos, el triceps sural, se subdivide en tres músculos adicionales)\n" +
                "En el compartimento anterior se disponen los músculos tibial anterior, extensor del dedo gordo, extensor largo de los dedos y músculo tercer peroneo\n" +
                "En el tobillo, la fascia se transforma por un lado en dos láminas fibrosas que tienen la misión de sujetar las vainas fibrosas por donde discurren los tendones de los peroneos largo y corto (retináculos de los peroneos) y en una banda que sujeta las vainas de los tendones flexores (retináculo de los flexores).\n" +
                "");
        m.setImg(R.drawable.nemot_muscpierna);
        models.add(m);

        m = new  Model();
        m.setTitle("Pares craneales 1");
        m.setDescription("TNervio olfatorio\n" +
                "\n" +
                "El nervio olfatorio es un nervio únicamente sensorial, conduciendo impulsos olfatorios de la nariz al sistema nervioso central, siendo clasificado como fibras aferentes viscerales especializadas.\n" +
                "Es posible encontrar células olfatorias especializadas ante todo en la mucosa pituitaria, con una prolongación periférica y una prolongación central, siendo verdaderas células nerviosas, homólogas de las células del Ganglio de Corti y del Ganglio de Scarpa de la vía auditiva y homólogas, por consiguiente, de las células constituidas de los ganglios espinales.\n" +
                "\n" +
                "\n" +
                "Nervio óptico\n" +
                "El nervio óptico es un nervio sensorial (el segundo par craneal) encargado de transmitir la información visual desde la retina hasta el cerebro.\n" +
                "Se origina en la capa de células ganglionares de la retina, y su origen aparente es el ángulo anterior del quiasma óptico.\n" +
                "");
        m.setImg(R.drawable.nemot_parescra1);
        models.add(m);

        m = new  Model();
        m.setTitle("Pares craneales 2");
        m.setDescription("Los pares craneales, también llamados nervios craneales, son doce pares de nervios que surgen directamente del cerebro o a nivel del tronco del encéfalo para distribuirse a través de los agujeros de la base del cráneo en la cabeza, cuello, tórax y abdomen. La Nomenclatura Anatómica Internacional incluye al nervio terminal como nervio craneal, a pesar de ser atrófico en los humanos y estar estrechamente relacionado con el nervio olfatorio.\n" +
                "\n" +
                "Los nervios craneales tienen un origen aparente que es el lugar donde el nervio sale o entra en el encéfalo. El origen real es distinto de acuerdo a la función que cumplan. Las fibras de los pares craneales con función motora (eferente) se originan de grupos celulares que se encuentran en la profundidad del tallo encefálico (núcleos motores) y son homólogas de las células del asta anterior de la médula espinal. Las fibras de los pares craneales con función sensitiva o sensorial (aferente) tienen sus células de origen (núcleos de primer orden) fuera del tallo encefálico, por lo general en ganglios que son homólogos de los de la raíz dorsal de los nervios raquídeos. Los núcleos sensitivos de segundo orden se encuentran en el tallo encefálico.\n" +
                "Los núcleos de donde parten los pares craneales se ubican en una región generalizada conocida como tegmentum que recorre el tronco del encéfalo.\n" +
                "\t•\tA nivel del mesencéfalo (estructura superior del tronco del encéfalo) parten el par III y IV\n" +
                "\t•\tA nivel del puente troncoencefálico (estructura media del tronco del encéfalo) parten los pares V, VI, VII y VIII\n" +
                "\t•\tA nivel del bulbo raquídeo (estructura inferior del tronco del encéfalo) parten los pares IX, X, XI y XII.\n" +
                "");
        m.setImg(R.drawable.nemot_parescra2);
        models.add(m);

        m = new  Model();
        m.setTitle("Miembro inferior - tarso");
        m.setDescription("Huesos tarsales. El pie se compone de tobillo, empeine y cinco dedos. El tobillo está compuesto por siete huesos que forman un grupo llamado \"tarso\". Estos huesos están dispuestos de forma que uno de ellos, el \"talud\", se puede mover libremente, donde se une a la tibia y al peroné (huesos de la pierna baja), esto se conoce como la \"cabeza del astrágalo\".\n" +
                "El resto de los huesos del tarso están firmemente unidos, formando una masa sobre la que descansa el astrágalo. Los otros huesos que componen el tarso son el \"calcáneo\", el mayor de los huesos del tobillo, el \"astrágalo\", el \"escafoides\", el \"cuboides\", la \"cuña lateral\", la \"cuña intermedia\" y la \"cuña medial\". El calcáneo o hueso del talón, se encuentra por debajo del astrágalo donde se proyecta hacia atrás para formar la base del talón, esto ayuda a soportar el peso del cuerpo y proporciona una inserción para los músculos que mueven los pies.\n" +
                "");
        m.setImg(R.drawable.nemot_tarso);
        models.add(m);

        m = new  Model();
        m.setTitle("Vasos");
        m.setDescription("La fosa poplítea o hueco poplíteo, en el hombre y algunos otros animales, es una depresión más o menos romboidal de eje mayor vertical, localizada en la región entre el muslo y la piernas, que se corresponde adelante con la rodilla.\n" +
                "\n" +
                "De lateral a medial se encuentran las siguientes estructuras:\n" +
                "\t•\tNervio ciático, ubicado al nivel del ángulo superior de la fosa poplítea, se bifurca en sus ramos terminales (nervio tibial y nervio peroneo común).\n" +
                "\t•\tVena poplítea, ocupa el plano medio, entre la arteria y el nervio de la región. A nivel de la interlínea articular recibe a la vena safena externa o menor; esta última corre por el piso de la fosa poplítea, y antes de desembocar en la vena poplítea cruza al lado medial del nervio tibial.\n" +
                "\t•\tArteria poplítea, ubicada en un plano más profundo, apoyada sobre el esqueleto, desciende oblicuamente hacia lateral, hasta que llega al anillo del sóleo, aquí termina dividiéndose en la arteria tibial anterior y posterior.\n" +
                "\t•\tAdemás se encuentran los nódulos linfáticos poplíteos.\n" +
                "");
        m.setImg(R.drawable.nemot_vasos);
        models.add(m);

        m = new  Model();
        m.setTitle("Miembro inferior - Lig. cruzados");
        m.setDescription("Los dos ligamentos cruzados están en la región intercondilea de la rodilla y conectan el fémur y la tibia. Se denominan “cruzados” porque se cruzan entre sí en el plano sagital entre sus inserciones tibial y femoral:\n" +
                "\n" +
                "-El ligamento cruzado anterior se inserta en una carilla de la parte anterior del área intercondílea de la tibia, y asciende en sentido posterior para insertarse en una carilla de la porción posterior de la pared lateral de la fosa intercondílea del fémur.Ligamentos cruzados\n" +
                "\n" +
                "-El ligamento cruzado posterior se inserta en la cara posterior del área intercondílea de la tibia y asciende en sentido anterior para insertarse en la pared medial de la fosa intercondílea del fémur.\n" +
                "\n" +
                "El ligamento cruzado anterior cruza lateral al ligamento cruzado posterior a su paso a través de la región intercondilea.\n" +
                "\n" +
                "El ligamento cruzado anterior evita el desplazamiento anterior de la tibia respecto del fémur, y el ligamento cruzado posterior limita el desplazamiento posterior.\n" +
                "");
        m.setImg(R.drawable.nemot_ligamentoscruzados);
        models.add(m);

        m = new  Model();
        m.setTitle("Retina - capas");
        m.setDescription("La retina contiene diez capas paralelas que son, comenzando por la zona más superficial, hasta la más interna:3\n" +
                "\t1\tEpitelio pigmentario: Es la capa más externa de la retina. Está formada por células cúbicas que no son neuronas y poseen gránulos de melanina que le dan una pigmentación característica.\n" +
                "\t2\tCapa de células fotorreceptoras: Está formada por los segmentos más externos de los conos y los bastones.\n" +
                "\t3\tCapa limitante externa: No es una membrana, sino uniones intercelulares del tipo zónula adherente entre las células fotorreceptoras y las células de Müller.\n" +
                "\t4\tCapa nuclear o granular externa: Está formada por los núcleos celulares de las células fotorreceptoras.\n" +
                "\t5\tCapa plexiforme externa o sináptica externa: Es la región de conexión sináptica entre células fotorreceptoras y las células bipolares.\n" +
                "\t6\tCapa nuclear o granular interna: Está formada por los núcleos celulares de las células bipolares, las células horizontales y las células amacrinas.\n" +
                "\t7\tCapa plexiforme interna o sináptica interna: Es la región de conexión sináptica entre células bipolares, amacrinas y ganglionares.\n" +
                "\t8\tCapa de células ganglionares: Está formada por los núcleos de las células ganglionares.\n" +
                "\t9\tCapa de fibras del nervio óptico: Está formada por los axones de células ganglionares que forman el nervio óptico.\n" +
                "\t10\tCapa limitante interna: Separa la retina del humor vítreo.\n" +
                "\t11\t\n" +
                "Células de la retina[editar]\n" +
                "La retina tiene tres tipos de células:\n" +
                "\t•\tPigmentadas: Se encargan del metabolismo de los fotorreceptores.\n" +
                "\t•\tNeuronas:\n" +
                "\t1\tCélulas fotorreceptoras: Son los conos y los bastones. Transforman los impulsos luminosos en señales eléctricas.\n" +
                "\t2\tCélulas bipolares de la retina. Conectan las células fotorreceptoras con las células ganglionares.\n" +
                "\t3\tCélulas amacrinas. Son interneuronas moduladoras.\n" +
                "\t4\tCélulas horizontales. Cumplen una función similar a las células amacrinas, son interneuronas moduladoras.\n" +
                "\t5\tCélulas ganglionares de la retina. De estas neuronas parte el nervio óptico que conecta la retina con el cerebro.\n" +
                "\t•\tCélulas de sostén:\n" +
                "\t1\tAstrocitos.\n" +
                "\t2\tCélulas de Müller. Su función es de soporte, sintetizan glucógeno y ceden glucosa a otras células nerviosas.\n" +
                "");
        m.setImg(R.drawable.nemot_ret);
        models.add(m);


        String mSortSetting = preferences.getString("Sort", "ascending");

        if (mSortSetting.equals("ascending")) {

            Collections.sort(models, Model.By_TITLE_ASCENDING);


        }

        else if (mSortSetting.equals("descending")) {

            Collections.sort(models, Model.By_TITLE_DESCENDING);


        }




        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, models);
        mRecyclerView.setAdapter(myAdapter);



        //empezaremos el nuevo cambio

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        //tratar boton buscar

        MenuItem item = menu.findItem(R.id.search);

        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                myAdapter.getFilter(). filter(query);


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                myAdapter.getFilter().filter(newText);


                return false;
            }
        });

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.sorting) {
            sortDailog();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private void sortDailog() {

        String[] options = {"Ascending", "Descending"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Sort by");
        builder.setIcon(R.drawable.ic_action_sort);



        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (which == 0) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("Sort", "ascending");
                    editor.apply();
                    getMyList();

                }

                if (which == 1) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("Sort", "descending");
                    editor.apply();
                    getMyList();


                }




            }
        });

        builder.create().show();

    }


}

//trataermos d eponer en orden