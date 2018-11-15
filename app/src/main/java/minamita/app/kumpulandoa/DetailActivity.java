package minamita.app.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtDetailJudul, txtDetailAyat, txtDetailBaca, txtDetailArti;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetailJudul = (TextView) findViewById(R.id.txt_detail_judul);
        txtDetailAyat = (TextView) findViewById(R.id.txt_detail_ayat);
        txtDetailBaca = (TextView) findViewById(R.id.txt_detail_baca);
        txtDetailArti = (TextView) findViewById(R.id.txt_detail_arti);

        getData();
    }

    private void getData() {
        txtDetailJudul.setText(getIntent().getStringExtra("id_nama"));
        txtDetailAyat.setText(getIntent().getStringExtra("id_surah"));
        txtDetailBaca.setText(getIntent().getStringExtra("id_baca"));
        txtDetailArti.setText(getIntent().getStringExtra("id_arti"));
    }
}
