package com.example.tugasbesarprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ProfilDeveloper extends AppCompatActivity {

    RecyclerView profirecycler;
    String s1[],s2[];
    int images2[] = {R.drawable.profil,R.drawable.profil2,R.drawable.profil3,R.drawable.profil4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_developer);

        profirecycler = findViewById(R.id.recyclerView2);

        s1 = getResources().getStringArray(R.array.NIM);
        s2 = getResources().getStringArray(R.array.Nama_developer);

        AdapterProfil adapterProfil = new AdapterProfil(this, s1, s2, images2);
        profirecycler.setAdapter(adapterProfil);
        profirecycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
