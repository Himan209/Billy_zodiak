package com.example.billy_zodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultZodiac extends AppCompatActivity {

    String get_nm, get_tgl;
    TextView zdk_anda, txt_nm_zdk, txt_pjls_zdk, rmr_sih, txt_pjls_rmr;
    ImageView img_zdk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_zodiac);

        txt_nm_zdk = findViewById(R.id.txt_nm_zdk);
        txt_pjls_zdk = findViewById(R.id.txt_pjls_zdk);
        zdk_anda = findViewById(R.id.zdk_anda);
        rmr_sih = findViewById(R.id.rmr_sih);
        txt_pjls_rmr = findViewById(R.id.txt_pjls_rmr);
        img_zdk = findViewById(R.id.img_zdk);

        Bundle b = getIntent().getExtras();
        get_nm = b.getString("parse_nama");
        get_tgl = b.getString("parse_tanggal");

        String[] items1 = get_tgl.split("/");
        String date1=items1[0];
        String month=items1[1];
        String year=items1[2];


        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 12) || (Integer.parseInt(date1)<=19 && Integer.parseInt(month) == 1)){
            //img_zdk.setImageResource(R.drawable.capricorn);
            txt_nm_zdk.setText("Capricorn");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 21 Desember sampai 19 Januari berada di bawah pengaruh zodiak Capricorn, yang berlambang kambing. Orang yang berzodiak Capricorn mengutamakan kesuksesan, status, posisi, reputasi");
            txt_pjls_rmr.setText("Capricorn memang bercita – cita mencari kekuasaan dalam karir sehingga Anda harus siap bekerja dengan tekun");
        }



        if ((Integer.parseInt(date1)>20 && Integer.parseInt(month) == 1) || (Integer.parseInt(date1)<=18 && Integer.parseInt(month) == 2)){
            //img_zdk.setImageResource(R.drawable.aquarius);
            txt_nm_zdk.setText("Aquarius");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 20 Januari sampai 18 Febuari berada di bawah pengaruh zodiak Aquarius, yang berlambang gelombang (alur air). Orang Aquarius tertarik dengan petualangan dan berjiwa kemanusiaan");
            txt_pjls_rmr.setText("Kelahiran Aquarius ini biasanya tekun bekerja dan ingin orang lain sama tekun dalam bekerja sama. Lantaran itu, Aquarius menyukai karir yang mengikat");
        }


        if ((Integer.parseInt(date1)>19 && Integer.parseInt(month) == 2) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 3)){
            //img_zdk.setImageResource(R.drawable.piscess);
            txt_nm_zdk.setText("Pisces");
            txt_pjls_zdk.setText("Orang yang lahir antara tanggal 19 Febuari sampai 20 Maret dikatakan bernaung di bawah zodiak Pisces, yang berlambang ikan. ");
            txt_pjls_rmr.setText("Orang berzodiak Pisces suka pada pujian dan mengharapkan ungkapan cinta dari kekasih." +
                    " Justru itu, seseorang yang berkeperibadian kuat adalah pendamping yang tepat untuk Pisces");
        }


        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 3) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 4)){
            //img_zdk.setImageResource(R.drawable.aries);
            txt_nm_zdk.setText("Aries");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 21 Maret sampai 20 April dikatakan bernaung di bawah zodiak Aries, yang berlambang Biri-biri jantan");
            txt_pjls_rmr.setText("Aries punya daya pesona yang tinggi. Dalam pergaulan, Aries kelihatan lincah, pintar, berkeperibadian kuat dan teman bual yang mengasyikan. ");
        }


        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 4) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 5)){
            //img_zdk.setImageResource(R.drawable.tauruss);
            txt_nm_zdk.setText("Taurus");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 21 April sampai 20 Mei dikatakan bernaung di bawah zodiak Taurus, yang berlambang Lembu Jantan");
            txt_pjls_rmr.setText("Cancer dan Virgo adalah pasangan yang ideal bagi Taurus. Cancer memang pendamping tepat bagi Taurus. Keperibadian Cancer yang matang dan tidak berubah – ubah sesuai dengan cita rasa Taurus. ");
        }


        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 5) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 6)){
            //img_zdk.setImageResource(R.drawable.gemini);
            txt_nm_zdk.setText("Gemini");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 21 Mei sampai 20 Juni dikatakan bernaung di bawah zodiak Gemini, yang berlambang Saudara Kembar");
            txt_pjls_rmr.setText("\n" +
                    "Pendamping yang cocok untuk Gemini adalah seseorang yang cerdas dan memahami cita rasa Gemini yang selalu berubah – ubah. Zodiak Aries dan Taurus adalah pasangan yang tepat buat Anda. ");
        }


        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 6) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 7)){
            //img_zdk.setImageResource(R.drawable.cancer);
            txt_nm_zdk.setText("Cancer");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 21 Juni sampai 20 Juli dikatakan bernaung di bawah zodiak Cancer, yang berlambang Kepiting.");
            txt_pjls_rmr.setText("Seseorang yang berperibadian yang matang adalah pasangan yang ideal buat Cancer. Di sini, zodiak Taurus dan Virgo merupakan pendamping yang ideal bagi Cancer.");
        }


        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 7) || (Integer.parseInt(date1)<=21 && Integer.parseInt(month) == 8)){
           //img_zdk.setImageResource(R.drawable.leooo);
            txt_nm_zdk.setText("Leo");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 21 Juli sampai 21 Agustus dikatakan bernaung di bawah zodiak Leo, yang berlambang Singa.");
            txt_pjls_rmr.setText("Leo suka bergaul sehingga tidak dapat berdampingan dengan seseorang yang cemburu dan mengungkung. Dalam situasi ini, Libra, Sagitarius, dan Taurus adalah pendamping ideal buat Leo. ");
        }


        if ((Integer.parseInt(date1)>22 && Integer.parseInt(month) == 8) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 9)){
            //img_zdk.setImageResource(R.drawable.virgo);
            txt_nm_zdk.setText("Virgo");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 22 Agustus hingga 22 September dikatakan bernaung di bawah zodiak Virgo, yang berlambang Seorang Gadis.");
            txt_pjls_rmr.setText("Zodiak Cancer dapat menjadi teman atau kekasih yang baik bagi Virgo. Sementara bersama Virgo yang serius, Cancer yang cemburu; tidak akan merasa resah. ");
        }


        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 9) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 10)){
            //img_zdk.setImageResource(R.drawable.libra);
            txt_nm_zdk.setText("Libra");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 23 September sampai 22 Oktober dikatakan bernaung di bawah zodiak Libra, yang berlambang Alat Penimbang (Dacin).");
            txt_pjls_rmr.setText("Libra adalah seorang kekasih yang cerdas dan selalu menjaga perbuatan dan pertuturannya agar kekasihnya tidak tersinggung. Pendamping yang ideal buat Libra adalah Taurus dan Leo.");
        }


        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 10) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 11)){
            //img_zdk.setImageResource(R.drawable.scorpio);
            txt_nm_zdk.setText("Scorpio");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 23 Oktober sampai 22 November dikatakan bernaung di bawah zodiak Scorpio, yang berlambang kalajengking.");
            txt_pjls_rmr.setText("Orang yang bernaung di bawah lambang Taurus dan Cancer merupakan pendamping yang sesuai untuk Scorpio. Taurus adalah pedamping yang diperlukan oleh Scorpio.");
        }


        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 11) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 12)){
            //img_zdk.setImageResource(R.drawable.sagitarius);
            txt_nm_zdk.setText("Sagitarius");
            txt_pjls_zdk.setText("Orang yang lahir pada tanggal antara 23 November sampai 20 Desember dikatakan bernaung di bawah zodiak Sagitarius, yang berlambang Pemanah. ");
            txt_pjls_zdk.setText("Sagitarius seorang kekasih yang setia. Pasangan yang dilakukan adalah bukan dari jenis yang cemburu. Jadi, pasangan yang cocok dengan Sagitarius adalah Aries dan Gemini.");
        }
    }
}
