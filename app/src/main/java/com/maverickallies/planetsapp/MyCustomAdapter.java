package com.maverickallies.planetsapp;

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

    private ArrayList<Planet> planetsArrayList;
    Context context;


    public MyCustomAdapter( ArrayList<Planet> planetsArrayList, Context context1) {
        super(context1, R.layout.item_list_layout,planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context1;
    }

    private static class ViewHolder{
        TextView planetTextView,moonCountTextView;
        ImageView planetImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);

        ViewHolder myViewHolder;
        final View result;
        if(convertView == null){
            myViewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.item_list_layout,parent,false);
            myViewHolder.planetTextView = (TextView) convertView.findViewById(R.id.planetTVID);
            myViewHolder.moonCountTextView = (TextView) convertView.findViewById(R.id.moonTVID);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.imageViewID);

            result = convertView;

            convertView.setTag(myViewHolder);

        }
        else {
            //the view is recycled.
            myViewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        myViewHolder.planetTextView.setText(planet.getName());
        myViewHolder.moonCountTextView.setText(planet.getMoonCount());
        myViewHolder.planetImg.setImageResource(planet.getPlanetImage());

        return convertView;
    }

}
