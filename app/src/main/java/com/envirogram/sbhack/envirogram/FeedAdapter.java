package com.envirogram.sbhack.envirogram;


import android.content.ContentProvider;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class FeedAdapter extends ArrayAdapter{

    Context context;
    ArrayList<Post> postArrayList;

    public FeedAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Post> postArrayList) {
        super(context, resource, postArrayList);
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
        View adapterView = layoutInflater.inflate(R.layout.layout_list_feed, null);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/cool.ttf");

        ImageView imageView = adapterView.findViewById(R.id.id_listFeed_ImageView);
        imageView.setImageBitmap(postArrayList.get(position).getImageViewResource());

        TextView textViewUsername = adapterView.findViewById(R.id.id_listFeed_TextView_username);
        textViewUsername.setText(postArrayList.get(position).getUsername());
        textViewUsername.setTypeface(typeface);
        return adapterView;
    }
}
