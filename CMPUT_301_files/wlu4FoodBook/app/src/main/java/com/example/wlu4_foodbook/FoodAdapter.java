package com.example.wlu4_foodbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Food> listDate;
    private LayoutInflater layoutInflater;

    public FoodAdapter(Context context, ArrayList<Food> listDate) {
        this.context = context;
        this.listDate = listDate;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listDate.size();//this return the size of the list
    }

    @Override
    public Object getItem(int i) {
        return listDate.get(i);//get position of the obj
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null){
            //means we have to load the content
            view = layoutInflater.inflate(R.layout.row_layout, null);
            holder = new ViewHolder();
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.count = (TextView) view.findViewById(R.id.count);
            holder.unitCost = (TextView) view.findViewById(R.id.unitCost);

            view.setTag(holder);

        }

        else{
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(listDate.get(position).getDescription());
        holder.count.setText(listDate.get(position).getCount());
        holder.unitCost.setText(listDate.get(position).getUnitCost());





        return view;
    }

    static class ViewHolder{
        TextView name;
        TextView count;
        TextView unitCost;
    }
}
