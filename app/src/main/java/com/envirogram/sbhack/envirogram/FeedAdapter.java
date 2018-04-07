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

        ImageView imageView = adapterView.findViewById(R.id.id_listFeed_ImageView);
        imageView.setImageResource(postArrayList.get(position).getImageViewResource());

        TextView textViewUsername = adapterView.findViewById(R.id.id_listFeed_TextView_username);
        textViewUsername.setText(postArrayList.get(position).getUsername());

        TextView textViewCaption = adapterView.findViewById(R.id.id_listFeed_TextView_caption);
        textViewCaption.setText(postArrayList.get(position).getCaption());

        return adapterView;
    }
}
