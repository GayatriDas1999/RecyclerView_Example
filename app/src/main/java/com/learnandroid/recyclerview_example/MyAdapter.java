package com.learnandroid.recyclerview_example;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<Data> data;

    public MyAdapter(Context c, ArrayList<Data>d){
        context= c;
        data=d;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.sender.setText(data.get(i).getSender());
        holder.date.setText(data.get(i).getDate());
        holder.subject.setText(data.get(i).getSubject());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView sender,date,subject;

    public MyViewHolder(View itemView){
        super(itemView);

        sender = (TextView) itemView.findViewById(R.id.sender);
        date = (TextView) itemView.findViewById(R.id.date);
        subject = (TextView) itemView.findViewById(R.id.subject);

    }
}
}
