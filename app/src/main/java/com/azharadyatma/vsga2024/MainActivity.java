package com.azharadyatma.vsga2024;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etSuhu;
    Spinner Opsi;
    Button btnConvert, btnClear;
    LinearLayout layoutHasil;
    TextView tvhasilHitung, tvhasilKonversi, tvRumus, tvRumusnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSuhu = findViewById(R.id.etSuhu);
        Opsi = findViewById(R.id.Opsi);
        btnConvert = findViewById(R.id.btnConvert);
        btnClear = findViewById(R.id.btnClear);
        layoutHasil = findViewById(R.id.layoutHasil);
        tvhasilHitung = findViewById(R.id.tvhasilHitung);
        tvhasilKonversi = findViewById(R.id.tvhasilKonversi);
        tvRumus = findViewById(R.id.tvRumus);
        tvRumusnya = findViewById(R.id.tvRumusnya);

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                Pilihan
        );
    }
}