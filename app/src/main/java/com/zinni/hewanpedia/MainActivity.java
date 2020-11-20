package com.zinni.hewanpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

    public class MainActivity extends AppCompatActivity {

        ImageButton btnKucing,btnAnjing,btnKelinci;
        public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            inisialisasiView();
        }

        private void inisialisasiView() {
            btnKucing = findViewById(R.id.btn_buka_ras_kucing);
            btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
            btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
            btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
            btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
            btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
        }

        private void bukaGaleri(String jenisHewan) {
            Log.d("MAIN","Buka activity kucing");
            Intent intent = new Intent(this, GaleryActivity.class);
            intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
            startActivity(intent);
        }
    }
