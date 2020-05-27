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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    String data1[], data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView myText1, myText2;
        ImageView myImage;
        ConstraintLayout mainLayout;
        private final Context context;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myImage= itemView.findViewById(R.id.myImageView);
            mainLayout = itemView.findViewById(R.id.mainLayout);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent =  new Intent(context, KonversiPanjangtest.class);
                    break;

                case 1:
                    intent =  new Intent(context, KonversiSuhu.class);
                    break;

                case 2:
                    intent =  new Intent(context, KonversiMassa.class);
                    break;

                case 3:
                    intent =  new Intent(context, PenghitungLuas.class);
                    break;

                case 4:
                    intent =  new Intent(context, PenghitungVolume.class);
                    break;

                case 5:
                    intent =  new Intent(context, InfoSatuan.class);
                    break;

                case 6:
                    intent =  new Intent(context, ProfilDeveloper.class);
                    break;

                default:
                    intent =  new Intent(context, MainActivity.class);
                    break;
            }
            context.startActivity(intent);
        }

    }

}
