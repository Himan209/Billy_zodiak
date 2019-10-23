package com.example.billy_zodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    EditText et_nm_dpn, et_tgl_lhr;
    Button btn_tgl, btn_cb_cri;
    Calendar c;
    String var_tgl, var_nm_dpn;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_tgl_lhr = findViewById(R.id.et_tgl_lhr);
        et_nm_dpn = findViewById(R.id.et_nm_lgkp);
        btn_cb_cri = findViewById(R.id.btn_cb_cri);
        btn_tgl = findViewById(R.id.btn_tgl);


        btn_cb_cri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et_tgl_lhr.getText().toString().length()==0){
                    et_tgl_lhr.setError("Tangal Tidak Boleh Kosong");
                }else {
                    var_tgl = et_tgl_lhr.getText().toString();
                    var_nm_dpn = et_nm_dpn.getText().toString();
                    Intent abc = new Intent(MainActivity.this,ResultZodiac.class);
                    Bundle b = new Bundle();
                    b.putString("parse_tanggal", var_tgl);
                    b.putString("parse_nama", var_nm_dpn);
                    abc.putExtras(b);
                    startActivity(abc);
                }

            }
        });

        btn_tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        et_tgl_lhr.setText(mDay + "/" +(mMonth+1) + "/" + mYear);
                    }
                },day,month,year);
                dpd.show();
            }
        });
    }
}





