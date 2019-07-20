package com.example.jaka.ceritarakyat.model;

import com.example.jaka.ceritarakyat.R;

/**
 * Created by Jaka on 6/24/2019.
 */

public class Cerita {
    private Halaman[] mHalamans;

    public  Cerita(){
        mHalamans = new Halaman[7];

        mHalamans[0] = new Halaman(
                R.drawable.gambar0,
                "Suatu hari di sebuah desa hiduplah seorang wanita dengan anak nya yang bernama Malin, Malin adalah anak baik dan pintar, meskipun agak sedikit nakal. Ia selalu membantu ibunya setiap saat dan sangat mencintainya. Saat Malin tumbuh menjadi pria pintar, tampan, dan kuat. Namun, meskipu masih saja mereka tetap miskin. Malin pun sedih melihat ibunya masih bekerja di waktu tuanya. menurut %1$s, Apa yang yang terjadi selanjutnya?",
                new Pilihan("Meminta izin bekerja di kota", 1),
                new Pilihan("Pergi dengan kapal ", 2));

        mHalamans[1] = new Halaman(
                R.drawable.gambar2,
                "Akhirnya, dengan perasaan berat hati, sang ibu  mengizinkan anaknya pergi ke kota. Pada keesokan harinya, Malin sampai di sebuah kota hingga menjadi orang sukses dan mempunyai istri disana   ",
                new Pilihan("Malin terdampar di kampungnya", 3),
                new Pilihan("Malin tidak mengenal ibunya", 4));

        mHalamans[2] = new Halaman(
                R.drawable.gambar2,
                "Malin menaiki sebuah kapal besar Sembari berpamitan kepada ibunya dan meminta restu untuk pergi kekota untuk mencari kerja namun setelah ia menjadi kaya dan memiliki istri nan cantik jelita ia lupa dengan ibu dan kampung halaman nya ",
                new Pilihan("Malin tidak mengenal ibunya", 4),
                new Pilihan("Malin di kutuk ibunya", 6));
        mHalamans[3] = new Halaman(
                R.drawable.gambar3,
                "Akhirnya setelah sekian lama dan menjadi orang kaya malin pun tak sadar terdampar di kampung halaman nya namun sayang malin sama sekali tidak mengenali ibunya  ",
                new Pilihan("Malin tidak mengenal ibunya", 4),
                new Pilihan("Malin membuat ibunya sedih", 5));

        mHalamans[4] = new Halaman(
                R.drawable.gambar4,
                "Malin sama sekali tidak mengenal ibunya, dia tidak sama sekali mengingat wajah orang tuanya dan kampung halaman nya. ",
                new Pilihan("Malin membuat ibunya sedih", 5),
                new Pilihan("Malin dikutuk jadi batu", 6));


        mHalamans[5] = new Halaman(
                R.drawable.gambar5,
                "Malin menghina dan berkata kasar pada ibunya bahkan dia tidak mengenali sama sekali ibukandungnya sendiri yang telah melahirkannya sehingga membuat ibunya mengeluarkan air mata");

        mHalamans[6] = new Halaman(
                R.drawable.gambar6,
                "Akhirnya malin pun di kutuk oleh ibunya menjadi batu. ");

    }
    public  Halaman getHalaman(int pageNumber){
      return mHalamans[pageNumber];
    }

}