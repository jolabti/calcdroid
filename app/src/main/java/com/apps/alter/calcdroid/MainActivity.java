package com.apps.alter.calcdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnHitung,btnReset; // digunakan untuk aksi pada codingan Java
    TextView tvHasil;
    EditText edangka1,edangka2;

    Double angka1,angka2, rumusT, rumusK, rumusB, rumusKr ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnHitung = (Button) findViewById(R.id.idbuttonhitung);
        btnReset = (Button) findViewById(R.id.idbuttonreset);
        tvHasil = (TextView) findViewById(R.id.idtvhasil);

        edangka1=(EditText) findViewById(R.id.idangka1);
        edangka2=(EditText) findViewById(R.id.idangka2);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputS1= edangka1.getText().toString();
                String inputS2= edangka2.getText().toString();
                angka1= Double.parseDouble(inputS1);
                angka2= Double.parseDouble(inputS2);

                rumusT = angka1 + angka2;
                rumusK = angka1 * angka2;
                rumusB = angka1 / angka2;

                tvHasil.setText
                        ("Hasilnya Tambah : "
                                + tambahMethod(angka1, angka2)+"\n" +
                         "Hasilnya Kurang : " + rumusK+"\n"
                        );
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvHasil.setText("");
                edangka1.setText("");
                edangka2.setText("");
            }
        });

    }

    public Double tambahMethod(Double a, Double b){
        Double rumusTambahMethod = a +b;
        return rumusTambahMethod;
    }

}
