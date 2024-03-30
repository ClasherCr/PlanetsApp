package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {

    Context context;

    public MyCustomAdapter( ArrayList<Planet> planetArrayList, Context context1) {
        super(context1, R.layout.item_list_layout, planetArrayList);
        this.context = context1;
    }

    private static class MyViewHolder{

        TextView planetName;
        TextView moonCount;
        ImageView planetImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planets = getItem(position);

        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );

            myViewHolder.planetName = convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount = convertView.findViewById(R.id.moon_count_text);
            myViewHolder.planetImg = convertView.findViewById(R.id.imageview);

            result = convertView;

            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.planetName.setText(planets.getPlanetname());
        myViewHolder.moonCount.setText(planets.getMooncount());
        myViewHolder.planetImg.setImageResource(planets.getPlanetimage());

        return result;


    }
}
