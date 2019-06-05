package mx.edu.ittepic.marcos.tpdm_u5_practica3_mapa_uma;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String describir;
    Button E_B, E_B1_P, E_B2_P, E_Q, E_P, E_EE, E_G, E_G_P;
    Button E_CBI, E_A, E_H, E_M, E_J, E_L, E_X, E_N;
    Button E_LIIA, E_F, E_K, E_S, E_AD, E_CI, E_TA;
    Button E_UVP, E_LC, E_CB1, E_CB2, E_UD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E_B = findViewById(R.id.E_B);
        E_B1_P = findViewById(R.id.E_B1_P);
        E_B2_P = findViewById(R.id.E_B2_P);
        E_Q = findViewById(R.id.E_Q);
        E_P = findViewById(R.id.E_P);
        E_EE = findViewById(R.id.E_EE);
        E_G = findViewById(R.id.E_G);
        E_G_P = findViewById(R.id.E_G_P);

        E_CBI = findViewById(R.id.E_CBI);
        E_A = findViewById(R.id.E_A);
        E_H = findViewById(R.id.E_H);
        E_M = findViewById(R.id.E_M);
        E_J = findViewById(R.id.E_J);
        E_L = findViewById(R.id.E_L);
        E_X = findViewById(R.id.E_X);
        E_N = findViewById(R.id.E_N);

        E_LIIA = findViewById(R.id.E_quimica);
        E_F = findViewById(R.id.E_F);
        E_K = findViewById(R.id.E_K);
        E_S = findViewById(R.id.E_S);
        E_AD = findViewById(R.id.E_AD);
        E_CI = findViewById(R.id.E_CI);
        E_TA = findViewById(R.id.E_TA);

        E_UVP = findViewById(R.id.E_UVP);
        E_LC = findViewById(R.id.E_LC);
        E_CB1 = findViewById(R.id.E_CB1);
        E_CB2 = findViewById(R.id.E_CB2);
        E_UD = findViewById(R.id.E_UD);



        E_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Podemos encontrar el Laboratorio de Análisis de Alimentos y el Laboratorio de Procesos de Alimentación. ";
                Mensaje(R.drawable.b,"Edificio B",describir);
            }
        });

        E_B1_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " En este edificio se ubica el Laboratorio de Ingeniería Mecatrónica.";
                Mensaje(R.drawable.b_p,"Edificio B'",describir);
            }
        });

        E_B2_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " En este edificio se ubica el Laboratorio de Ingeniería Mecatrónica. ";
                Mensaje(R.drawable.b_p,"Edificio B'",describir);
            }
        });

        E_Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "Este edificio se ubica en la parte trasera del tecnologico, a un lado de las canchas de futbol," +
                        "aquí normalmente toman clase los alumnos de Ingenieria Bioquimica";
                Mensaje(R.drawable.q,"Edificio Q'",describir);
            }
        });

        E_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Es utilizado principalmente por la carrera de Ingeniería Química y Bioquímica; además podemos encontrar la Sala Audiovisual. ";
                Mensaje(R.drawable.p,"Edificio P",describir);
            }
        });

        E_EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "En esta oficina se encuentran los encargados de la organización de todas las actividades extraescolares que se llevan a cabo en esta institución, así como de todos los eventos relacionados a las mismas. Recuerda siempre estar atento a todas noticias dadas por este departamento.";
                Mensaje(R.drawable.ee,"Departamento de Actividades Extraescolares",describir);
            }
        });

        E_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "El edificio G está en la parte trase del tecnologico, son utilizados para recibir a los aspirantes del tec " +
                        ", donde toman sus cursos de nivelación antes del examen. Tambien son utilizados durante el semestre por todas las areas";
                Mensaje(R.drawable.g,"Edificio G",describir);
            }
        });

        E_G_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "El edificio G' se encuentra justo a un costado del edificio G, en este edificio podemos encontrar" +
                        "el laboratorio de los ingenieros en bioquimica.";
                Mensaje(R.drawable.g,"Edificio G'",describir);
            }
        });

        //--------------------------------------------------------------------------------


        E_CBI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "Este edificio es de los más nuevos del tecnologico, ahí suelen darse conferencias y ceremonias de entrega" +
                        "de certificados como los de CISCO";
                //Mensaje(R.drawable.licbi,"Edificio LICBI",describir);
            }
        });

        E_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "El edficio A es donde normalmente reciben clases los Arquitectos e Ingenieros Civiles, consta de" +
                        "aulas estandar, se encuentra muy cerca de las canchas y el domo,";
                Mensaje(R.drawable.a,"Edificio A",describir);
            }
        });

        E_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "El edificio H es uno muy bien posicionado debido a que se encuentra justo detras del edificio J que tiene" +
                        "un centro de copias e impresiones y a un costado del Kiosko, una pequeña cafeteria donde se venden buenos desayunos.";
                Mensaje(R.drawable.h,"Edificio H",describir);
            }
        });

        E_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " En este edificio podemos encontrar el Laboratorio de Química Analítica y una salon de Topografía ";
                Mensaje(R.drawable.m,"Edificio M",describir);
            }
        });

        E_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Contiene salones de clases además de los locales del Servicio Médico, de Gestión de Titulación y en la planta alta, el de Copias e Impresiones.";
                Mensaje(R.drawable.j,"Edificio J",describir);
            }
        });

        E_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Podemos encontrar el Laboratorio de Ingeniería Industrial y 2 salones de clase. ";
                Mensaje(R.drawable.l,"Edificio L",describir);
            }
        });

        E_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "El edificio X es uno de los edificios muy bien posicionados en el tecnologico," +
                        "se encuentra a un costado del centro de información y muy cercano al edificio Administrativo." +
                        "Consta de aulas sencillas donde alumnos de varias carreras toman clase";
                Mensaje(R.drawable.x,"Edificio X",describir);
            }
        });

        E_N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "El edificio N es donde usualmente los alumnos de gestion empresarial y administracion toman sus clases." +
                        "Ahí tambien se encuentra una sala de maestros en la cual se puede buscar asesor o evaluador de proyecto de residencia";
                Mensaje(R.drawable.n,"Edificio N",describir);
            }
        });

        //---------------------------------------------------------------

        E_LIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "En este edificio suelen tomarse clases de postgrado";
                Mensaje(R.drawable.liia,"Edificio LIIA",describir);
            }
        });

        E_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Este edificio contiene los laboratorios de Ingeniería Eléctrica y de Civil";
                Mensaje(R.drawable.f,"Edificio F",describir);
            }
        });

        E_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " En este edificio podemos encontrar el local donde se ubica un comedor/cafetería, un salon de clase y la cede del Comité Ejecutivo Delegacional. ";
                Mensaje(R.drawable.k,"Edificio K",describir);
            }
        });

        E_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Este edificio solo contiene los locales donde radica el Consejo Estudiantil y el de los encargados de Mantenimiento de equipos de la institución";
                Mensaje(R.drawable.s,"Edificio S",describir);
            }
        });

        E_AD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Podemos encontrar el Departamento de Servicios Escolares, Departamento de Recursos Humanos, el Centro de Cómputo, División de Estudios Profesionales, también en la planta alta podemos encontrar el Departamento de planeación, Programación y Presupuesto(financieros), y las oficinas de la dirección y subdirección de la institución";
                Mensaje(R.drawable.ad,"Administración",describir);
            }
        });

        E_CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Dentro de este edificio se encuentra la única biblioteca de la institución. Además cuenta con tres salas de clases y es usada como cede de algunas de las actividades realizadas, como conferencias, pláticas, reuniones o eventos de importancia.";
                Mensaje(R.drawable.ci,"Centro de Información",describir);
            }
        });

        E_TA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "En este edificio de encuentran las salas especializadas o talleres de dibujo, utilizados por los estudiantes de las carreras de arquitectura.";
                Mensaje(R.drawable.ta,"Edificio TA",describir);
            }
        });

        //------------------------------------------------------------------
        E_UVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " En este edificio podemos encontrar el Departamento de Gestión Tecnológica y Vinculación, el Departamento de Comunicación y Difusión, el Centro de Idiomas y la División de Estudios de Postgrado e Investigación. Además de estos departamentos, cuenta con salones de clase, uno dedicado para el trabajo en la materia de Dispositivos Móviles y el resto usado generalmente para la presentación de proyecto y clases de idioma";
                Mensaje(R.drawable.uvp,"Edificio UVP",describir);
            }
        });

        E_LC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = "Está conformado por 5 salas de cómputo, 3 de propósito general, una sala CISCO( especializada para el trabajo en redes de computadoras) y una sala de Sistemas Operativos. Las carreras que principalmente utilizan este laboratorio son Sistemas Computacionales, Mecatrónica y Civil";
                Mensaje(R.drawable.lc,"Laboratorio de Cómputo",describir);
            }
        });

        E_CB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " También conocido como 'Baston', sus aulas son usadas para impartir materias relacionadas con las ciencias exactas (Matemáticas y Física); además contiene las oficinas de los docentes relacionados a esta área.";
                Mensaje(R.drawable.cb,"Ciencias Básicas",describir);
            }
        });

        E_CB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " También conocido como 'Baston', sus aulas son usadas para impartir materias relacionadas con las ciencias exactas (Matemáticas y Física); además contiene las oficinas de los docentes relacionados a esta área. ";
                Mensaje(R.drawable.cb,"Ciencias Básicas",describir);
            }
        });

        E_UD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                describir = " Podemos encontrar en la planta baja, el Departamento de Ingeniería Industrial, el Departamento de Sistemas Computacionales, Coordinación de Tutorías. En la segunda planta encontramos los Departamento de Ingeniería Eléctrica y Electrónica, de Desarrollo Académico y de Educación a Distancia. Además podemos encontrar salones de clase, aulas de uso múltiple y un taller de matemáticas y ciencias básicas. ";
                Mensaje(R.drawable.ud,"Unidad Académica Departamental",describir);
            }
        });

    }



    private void Mensaje(int imagenID,String edificio,String descripcionG){
        AlertDialog.Builder muchosView = new AlertDialog.Builder(this);
        final View contenido = getLayoutInflater().inflate(R.layout.informacion,null);
        ImageView imagen = contenido.findViewById(R.id.imagen);
        TextView titulo = contenido.findViewById(R.id.titulo);
        TextView descripcion = contenido.findViewById(R.id.descripcion);

        imagen.setImageResource(imagenID);
        titulo.setText(edificio);
        descripcion.setText(descripcionG);

        muchosView.setTitle("Información");
        //muchosView.setMessage("Se muestran los Views");
        muchosView.setView(contenido);
        muchosView.setPositiveButton("Aceptar", null);
        muchosView.show();
    }

}
