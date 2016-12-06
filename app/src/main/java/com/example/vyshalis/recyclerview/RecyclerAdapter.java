package com.example.vyshalis.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;



public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();

    public RecyclerAdapter(ArrayList<Dataprovider> arrayList)
    {
      this.arrayList = arrayList;
    }

    @Override

    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

    RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
    return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        Dataprovider dataprovider = arrayList.get(position);
        holder.imageView.setImageResource(dataprovider.getImg_res());
      holder.name.setText(dataprovider.getname());

    }

    @Override

   public int getItemCount () {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
       TextView name;

  public RecyclerViewHolder(View view)
  {
   super(view);

    imageView = (ImageView)view.findViewById(R.id.img);
     name = (TextView)view.findViewById(R.id.name);
    }
  }
}
