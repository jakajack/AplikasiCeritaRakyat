package com.example.jaka.ceritarakyat.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jaka.ceritarakyat.R;
import com.example.jaka.ceritarakyat.model.Cerita;
import com.example.jaka.ceritarakyat.model.Halaman;

public class CeritaActivity extends AppCompatActivity {

    public static final String TAG = CeritaActivity.class.getSimpleName();

    private Cerita mCerita = new Cerita();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mPilihan1;
    private Button mPilihan2;
    private String mNama;
    private Halaman mHalamanSekarang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerita);

        Intent intent = getIntent();
        mNama = intent.getStringExtra(getString(R.string.key_name));

        if(mNama == null ){
            mNama = "Tanpa Nama";
        }

        Log.d(TAG, mNama);

        mImageView = (ImageView)findViewById(R. id.ceritaimageView);
        mTextView = (TextView)findViewById(R. id.ceritatextView);
        mPilihan1 = (Button)findViewById(R. id.pilihanbutton1);
        mPilihan2 = (Button)findViewById(R. id.pilihanbutton2);

        loadHalaman(0);
    }
    private void loadHalaman(int pilihan){
        final Halaman mHalamanSekarang = mCerita.getHalaman(pilihan);

        Drawable drawable = getResources().getDrawable(mHalamanSekarang.getGambarId());
        mImageView.setImageDrawable(drawable);

        String halamanText = mHalamanSekarang.getTeks();
        halamanText = String.format(halamanText, mNama);

        mTextView.setText(halamanText);

        if (mHalamanSekarang.isApakahSelesai()){
            mPilihan1.setVisibility(View.INVISIBLE);
            mPilihan2.setText("MAIN lAGI");
            mPilihan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }

        else {
            mPilihan1.setText(mHalamanSekarang.getPilihan1().getTeks());
            mPilihan2.setText(mHalamanSekarang.getPilihan2().getTeks());

            mPilihan1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextHalaman = mHalamanSekarang.getPilihan1().getPilihanSelanjutnya();
                    loadHalaman(nextHalaman);
                }
            });

            mPilihan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextHalaman = mHalamanSekarang.getPilihan2().getPilihanSelanjutnya();
                    loadHalaman(nextHalaman);
                }
            });
        }
    }

}
