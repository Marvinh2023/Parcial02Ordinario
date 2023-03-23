package utec.edu.sv.parcial2ordinario;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorUsuarios extends ArrayAdapter<DatosUsuarios> {
    private Context contexto;
    private List<DatosUsuarios> lstDatosUsuarios;

    public AdaptadorUsuarios(Context contexto, ArrayList<DatosUsuarios>lstDPerson) {
        super(contexto, R.layout.lista_usuarios,lstDPerson);
        this.contexto = contexto;
        this.lstDatosUsuarios = lstDPerson;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater =LayoutInflater.from(contexto);
        View item =inflater.inflate(R.layout.lista_usuarios,null);

        DatosUsuarios dp = lstDatosUsuarios.get(position);
        ImageView imagen =item.findViewById(R.id.ivAvatar);
        imagen.setImageResource(dp.getAvatar());

        TextView nombre = item.findViewById(R.id.tvNombre);
        nombre.setText(dp.getNombre());

        TextView edad = item.findViewById(R.id.tvCargo);
        edad.setText(String.valueOf(dp.getCargo()));

        TextView direccion = item.findViewById(R.id.tvCompania);
        direccion.setText(dp.getCompania());
        return(item);
    }
}
