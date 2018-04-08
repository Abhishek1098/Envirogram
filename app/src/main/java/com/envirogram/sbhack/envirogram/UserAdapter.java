package com.envirogram.sbhack.envirogram;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter {
    Context context;
    ArrayList<User> userArrayList;
    public UserAdapter(@NonNull Context context, int resource, @NonNull ArrayList<User> objects) {
        super(context, resource, objects);
        this.context=context;
        userArrayList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
        View adapterView = layoutInflater.inflate(R.layout.layout_list_feed, null);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/cool.ttf");

        TextView textView = adapterView.findViewById(R.id.id_layoutuser);
        textView.setText(userArrayList.get(position).getUsername());
        textView.setTypeface(typeface);

        return adapterView;
    }
}
