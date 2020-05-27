package com.example.tugasbesarprogmob;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.CheckedOutputStream;

public class AdapterSatuan extends RecyclerView.Adapter<AdapterSatuan.MyViewHolder>{

    String data3[], data4[];
    int images3[];
    Context context;

    public AdapterSatuan(Context ct, String s3[], String s4[], int img[]) {
        context = ct;
        data3 = s3;
        data4 = s4;
        images3 = img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row3, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data3[position]);
        holder.myText2.setText(data4[position]);
        holder.myImage.setImageResource(images3[position]);
    }

    @Override
    public int getItemCount() {
        return images3.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView myText1, myText2;
        ImageView myImage;
        ConstraintLayout thirdLayout;
        private final Context context;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myImage= itemView.findViewById(R.id.myImageView);
            thirdLayout = itemView.findViewById(R.id.thirdLayout);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent =  new Intent(context, SatuanPanjang.class);
                    break;

                case 1:
                    intent =  new Intent(context, SatuanSuhu.class);
                    break;

                case 2:
                    intent =  new Intent(context, SatuanMassa.class);
                    break;

                case 3:
                    intent =  new Intent(context, SatuanLuas.class);
                    break;

                case 4:
                    intent =  new Intent(context, SatuanVolume.class);
                    break;

                default:
                    intent =  new Intent(context, InfoSatuan.class);
                    break;
            }
            context.startActivity(intent);
        }

    }
}
