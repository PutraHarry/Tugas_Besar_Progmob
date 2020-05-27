package com.example.tugasbesarprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class InfoSatuan extends AppCompatActivity {

    RecyclerView infosatuan;

    String s3[],s4[];
    int images3[] = {R.drawable.ruler1,R.drawable.temperature2,R.drawable.weight,R.drawable.area2, R.drawable.volume};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_satuan);

        infosatuan = findViewById(R.id.recyclerView3);
        s3 = getResources().getStringArray(R.array.Satuan);
        s4 = getResources().getStringArray(R.array.desc_satuan);

        AdapterSatuan adapterSatuan = new AdapterSatuan(this,s3,s4, images3);
        infosatuan.setAdapter(adapterSatuan);
        infosatuan.setLayoutManager(new LinearLayoutManager(this));
    }
}
