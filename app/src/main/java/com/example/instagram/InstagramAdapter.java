package com.example.instagram;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.instagram.R.color.red;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.InstagramViewHolder>{

List<instagram> listInstagrams;
public InstagramAdapter(List<instagram> instagrams){
    this.listInstagrams = instagrams;
}

    @Override
    public InstagramViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_instagram,  parent, false);
        InstagramViewHolder viewHolder = new InstagramViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( InstagramViewHolder holder, int position) {
      holder.textname.setText(listInstagrams.get(position).user_name);
      holder.texta.setText(listInstagrams.get(position).texta);
      holder.texter.setText(listInstagrams.get(position).ter);
      holder.textxesh.setText(listInstagrams.get(position).text_xesh);
      holder.imgglav.setImageResource(listInstagrams.get(position).imageid);
    }

    @Override
    public int getItemCount() {
        return listInstagrams.size();
    }

    class InstagramViewHolder extends RecyclerView.ViewHolder {
   TextView textname, texta, texter, textxesh;
   ImageView imgglav, imgfav, imgsoxr;
        private Object MainActivity;


        public InstagramViewHolder(View view){
           super(view);
         textname = view.findViewById(R.id.name_user);
         texta = view.findViewById(R.id.texta);
         texter = view.findViewById(R.id.ter);
         textxesh = view.findViewById(R.id.textxesh);
         imgglav = view.findViewById(R.id.img_glav);
       imgfav = view.findViewById(R.id.ic_favor);
       imgsoxr = view.findViewById(R.id.ic_soxr);
       imgfav.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   imgfav.setBackgroundResource(R.drawable.ic_baseline_favorite_24);
               }
           });
            imgsoxr.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View v) {
                    imgsoxr.setBackgroundResource(R.drawable.ic_baseline_turned_in_24);
                }
            });

       }
    }




}
