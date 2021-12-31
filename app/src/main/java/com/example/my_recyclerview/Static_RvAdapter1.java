package com.example.my_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Static_RvAdapter1 extends RecyclerView.Adapter<Static_RvAdapter1.StaticRVViewHolder1>{

    private ArrayList<Static_RvModel1> items;
    public Context context;
    //private ArrayList<Static_RvModel1> item1;


    public Static_RvAdapter1(ArrayList<Static_RvModel1> items,Context context) {

        this.items = items;
        this.context = context;
    }

    public Static_RvAdapter1(ArrayList<Static_RvModel1> item1) {
       // this.item1 = item1;
    }

    @NonNull

    @Override
    public StaticRVViewHolder1 onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item1,parent,false);

        StaticRVViewHolder1 staticRVViewHolder1 = new StaticRVViewHolder1(view);
     return staticRVViewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull  Static_RvAdapter1.StaticRVViewHolder1 holder, int position) {
        Static_RvModel1 currentItem = items.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());
        holder.textView1.setText(currentItem.getText1());

        holder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,details_activity.class);
                //intent.putExtra("image",items.get(position).getImage());
                //intent.putExtra("title",items.get(position).getText());
                //intent.putExtra("ibnasina",items.get(position).getText1());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class StaticRVViewHolder1 extends RecyclerView.ViewHolder {

        TextView textView;
        TextView textView1;
        ImageView imageView;
        RelativeLayout relativeLayout;



        public StaticRVViewHolder1(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image1);
            textView = itemView.findViewById(R.id.text1);
            textView1 = itemView.findViewById(R.id.text2);
            relativeLayout = itemView.findViewById(R.id.relativeLayout1);




        }


    }
}
