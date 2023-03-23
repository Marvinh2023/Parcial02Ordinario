package utec.edu.sv.parcial2ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<DatosUsuarios> lvDatosUsers;
    private ListView lvDatosPer;
    private ListAdapter listAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDatosPer = findViewById(R.id.lsvDatosUsuarios);
        lvDatosUsers = new ArrayList<DatosUsuarios>();
        lvDatosUsers.add(new DatosUsuarios("Alexander Pierrort","CEO","Insures S.O", R.drawable.lead_photo_1));
        lvDatosUsers.add(new DatosUsuarios("Carlos Lopez","Asistente","Hospital Blue", R.drawable.lead_photo_2));
        lvDatosUsers.add(new DatosUsuarios("Sara Bonz","Directora de Marketing","Electrica Parts ltd", R.drawable.lead_photo_3));
        lvDatosUsers.add(new DatosUsuarios("Liliana Clarence","Disenadora de Producto","Creativa App", R.drawable.lead_photo_4));
        lvDatosUsers.add(new DatosUsuarios("Benito Peralta","Supervisor de Ventas","Neumaticos Press", R.drawable.lead_photo_5));
        lvDatosUsers.add(new DatosUsuarios("Juan Jaramillo","CEO","Banco Nacional", R.drawable.lead_photo_6));
        lvDatosUsers.add(new DatosUsuarios("Christian Steps","CTO","Cooperativa Verde", R.drawable.lead_photo_7));
        lvDatosUsers.add(new DatosUsuarios("Alexa Giraldo","Lead Programmer","Frustisofy", R.drawable.lead_photo_8));
        lvDatosUsers.add(new DatosUsuarios("Linda Murillo","Directora de Marqueting","Seguros Boliver", R.drawable.lead_photo_9));
        lvDatosUsers.add(new DatosUsuarios("Lizeth Astrada","CEO","Concesionario Motolox", R.drawable.lead_photo_10));
        AdaptadorUsuarios adaptador = new AdaptadorUsuarios(this,lvDatosUsers);
        lvDatosPer.setAdapter(adaptador);


        lvDatosPer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(parent.getContext(),"Selecciono"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, InfoUsuario.class);
                intent.putExtra("Nombre", lvDatosUsers.get(position).getNombre());
                startActivity(intent);
                intent.putExtra("avatar", lvDatosUsers.get(position).getAvatar());
                startActivity(intent);
            }
        });
    }
}