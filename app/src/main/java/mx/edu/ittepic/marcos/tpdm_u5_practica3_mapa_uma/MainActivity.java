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

        E_LC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LC();
            }
        });

        E_CB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CB();
            }
        });

        E_CB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CB();
            }
        });

        E_UD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UD();
            }
        });

        E_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B();
            }
        });

        E_B1_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B_P();
            }
        });

        E_B2_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B_P();
            }
        });

        E_Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q();
            }
        });

        E_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                P();
            }
        });

        E_EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EE();
            }
        });

        E_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G();
            }
        });

        E_G_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G_P();
            }
        });

        E_UVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UVP();
            }
        });

        E_CBI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBI();
            }
        });

        E_LIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quimica();
            }
        });

        E_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F();
            }
        });

        E_CBI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBI();
            }
        });

        E_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A();
            }
        });

        E_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                H();
            }
        });

        E_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                M();
            }
        });

        E_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                J();
            }
        });

        E_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                L();
            }
        });

        E_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X();
            }
        });

        E_N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N();
            }
        });

        E_LIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LIIA();
            }
        });

        E_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F();
            }
        });

        E_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                K();
            }
        });

        E_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                S();
            }
        });

        E_AD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AD();
            }
        });

        E_CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CI();
            }
        });

        E_TA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TA();
            }
        });

    }

    private void B(){

    }

    private void B_P(){

    }

    private void Q(){

    }

    private void P(){

    }

    private void EE(){

    }

    private void G(){

    }

    private void G_P(){

    }

    private void A(){

    }
    private void H(){

    }
    private void M(){

    }
    private void J(){

    }
    private void L(){

    }
    private void X(){

    }
    private void N(){

    }

    private void LIIA(){

    }
    private void K(){

    }
    private void S(){

    }
    private void AD(){

    }
    private void CI(){

    }
    private void TA(){

    }

    private void LC(){
        AlertDialog.Builder muchosView = new AlertDialog.Builder(this);

        final View contenido = getLayoutInflater().inflate(R.layout.informacion,null);
        ImageView imagen = contenido.findViewById(R.id.imagen);
        imagen.setImageResource(R.drawable.lc);
        TextView descripcion = contenido.findViewById(R.id.descripcion);
        descripcion.setText("Este es el laboratorio de cómputo. Esta conformada por 5 salas de cómputo, 3 de propósito general, una sala CISCO( especializada para el trabajo en redes de computadoras) y una sala de Sistemas Operativos. Las carreras que principalmente utilizan este laboratorio son Sistemas Computacionales, Mecatrónica y Civil");
        muchosView.setTitle("Información");
        //muchosView.setMessage("Se muestran los Views");
        muchosView.setView(contenido);
        muchosView.setPositiveButton("Aceptar", null);
        muchosView.show();
    }
    private void CB(){

    }
    private void UD(){

    }

    private void UVP(){
        Toast.makeText(this,"UVP",Toast.LENGTH_SHORT).show();
    }

    private void CBI(){
        Toast.makeText(this,"CBI",Toast.LENGTH_SHORT).show();
    }

    private void Quimica(){
        Toast.makeText(this,"Quimica",Toast.LENGTH_SHORT).show();
    }

    private void F(){
        Toast.makeText(this,"F",Toast.LENGTH_SHORT).show();
    }

}
