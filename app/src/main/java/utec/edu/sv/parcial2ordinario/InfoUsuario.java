package utec.edu.sv.parcial2ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;

public class InfoUsuario extends AppCompatActivity {
    private TextView tv1;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_usuario);



        Intent intent = getIntent();
        String valor = intent.getStringExtra("Nombre");
       // int a = intent.getIntExtra()t("avatar");
        tv1 = findViewById(R.id.tvUserName);
        tv1.setText(valor);

        avatar = findViewById(R.id.imageView);
        int images = intent.getIntExtra("avatar",0);

        avatar.setImageResource(images);
        //int inf = intent.getInt("avatar");

    }
}