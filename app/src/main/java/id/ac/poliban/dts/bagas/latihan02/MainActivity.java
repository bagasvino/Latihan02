package id.ac.poliban.dts.bagas.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menggunakan lambda untuk menulis event listener & event handler
        Button btRealMadrid = findViewById(R.id.btRealMadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btLeicester = findViewById(R.id.btLeicester);
        Button btFiorentina = findViewById(R.id.btFiorentina);

        //lambda
        btRealMadrid.setOnClickListener(v -> {
            Toast.makeText(this, "Saya Madridista", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Saya Visca Barca", Toast.LENGTH_SHORT).show();
        });

        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "Hola Barca", Toast.LENGTH_SHORT).show());
        btLeicester.setOnClickListener(v -> Toast.makeText(this, "Hola halo", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "i am fiorentin", Toast.LENGTH_SHORT).show());


    }
}
