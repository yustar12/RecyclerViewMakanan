package com.example.Yustar.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Resep> resep = new LinkedList<Resep>();
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep.add(new Resep("Cireng",
                            "Cireng (singkatan dari aci goreng, bahasa Sunda untuk 'tepung kanji goreng') adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka.",
                            "1. Tepung kanji 250 g.\n" +
                                    "2. Tepung terigu 50 g.\n" +
                                    "3. Daun bawang 2 batang. Iris halus.\n" +
                                    "4. Seledri 2 batang. Iris halus.\n" +
                                    "5. bawang putih 3 siung. Haluskan.\n" +
                                    "6. Penyedap rasa ayam 1 sdt.\n" +
                                    "7. Merica bubuk 1 sdt.\n" +
                                    "8. Garam 2 sdt.\n",
                            "1. Campur tepung tapioka 15 sdm dengan air dan bumbu aduk rata. kemudian masak diatas api sedang. Sambil diaduk hingga mengental.\n" +
                                    "2. Masukkan adonan kedalam tepung tapioka yg kering. Bentuk bulat pipih kemudian remas remas dalam tepung.\n" +
                                    "3. Goreng dalam minyak panas.\n" +
                                    "4. Untuk membuat sambal rujak. Campus semua bahan sambal. Tambah kn air sedikit demi sedikit sampai tingkat kekentalan yg diinginkan.\n" +
                                    "5.Selamat menikmati.\n"));


        resep.add(new Resep("Cilok",
                "Cilok adalah sebuah makanan khas Jawa Barat yang terbuat dari tapioka yang kenyal dengan tambahan bumbu pelengkap seperti sambal kacang, kecap, dan saus. Cilok bentuknya bulat-bulat seperti bakso, hanya saja berbeda bahan dasarnya.",
                "1. 8 sdm tepung terigu\n" +
                        "2. Royco sckpnya\n" +
                        "3. Garam sckpnya\n" +
                        "4. Lada bubuk sckpnya\n" +
                        "5. 1 butir telur\n" +
                        "6. 1 sdm cabe giling halus\n" +
                        "7. Bawang goreng sckpnya\n" +
                        "8. 1/2 sdt asam jawa(larutkan dlm 3 sdm air)\n",
                "1.Campur semua bahan kecuali tepung tapioka, tuang air panas sedikit demi sedikit sampai adonan tepung rata.\n" +
                         "2. Kemudian masukan tepung tapioka, diaduk sampai kalis dan bisa dibentuk.\n" +
                        "3. Didihkan air untuk merebus cilok, beri sedikit minyak goreng agar cilok tidak lengket satu sama lain ketika direbus.\n" +
                        "4. Masukkan cilok, masak sampai mengapung. Cilok siap dihidangkan.\n" +
                        "5. Selamat mencoba\n" ));


        resep.add(new Resep("Mi Goreng",
                "Mi goreng berarti \"mi yang digoreng\" adalah makanan yang populer dan digemari di Indonesia, Malaysia, dan Singapura. ... Mi goreng juga mirip dengan Yakisoba dari Jepang. Akan tetapi mie goreng sudah sedemikian rupa terintegrasi ke dalam seni kuliner Indonesia.",
                "1 keping mie telur urai(1 bks isi 2 keping)\n" +
                        "2. sesuai selera garam\n" +
                        "3. sedikit minyak untuk menumis bumbu\n" +
                        "4. 1 butir telur tambahkan garam merica kocok lepas\n" +
                        "5. 3 lembar kol, iris tipis\n" +
                        "6. 1/2 sdm kecap manis\n" +
                        "7. 1/2 siung bawang bumbai, iris halus\n" +
                        "8. 2 siung bawang putih, geprak\n",

                "1. Siapkan semua bahan\n" +
                        "2. Rebus mie sesuai petunjuk dikemasan, tiriskan, taruh dalam wadah, campur dengan kecap manis, kecap asin, minyak wijen, saori saus tiram, saos raja rasa, garam, merica bubuk, pala bubuk, aduk sampai tercampur rata\n" +
                        "3. Panaskan sedikit minyak dalam wajan, buat orak arik telur, sisihkan\n" +
                        "4. Panaskan sedikit minyak, goreng bawang putih, bawang bombai sampai harum, masukkan kembang kol, tunggu sampai layu\n" +
                        "5.Masukkan mie, telur orak arik, tunggu aampai tercampur rata\n" +
                        "6. Angkat, sajikan\n"));

        resep_process.add("1.process");
        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        for(int i = 0; i < resep.size(); i++){
            resep_nama.add(resep.get(i).nama);
            resep_detail.add(resep.get(i).detail);
            resep_ingredients.add(resep.get(i).ingredients);
            resep_process.add(resep.get(i).proses);
        }
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
