package com.example.artproject.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.artproject.Activities.BuyActivity;
import com.example.artproject.Data.Picture;
import com.example.artproject.R;

import java.util.ArrayList;

public class ItemListViewAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Picture> pictures;
    private LayoutInflater inf;

    public ItemListViewAdapter(Context context, int layout, ArrayList<Picture> pictures) {
        this.context = context;
        this.layout = layout;
        this.pictures=pictures;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        if(pictures!=null) return pictures.size();
        return 0;
    }
    @Override
    public Object getItem(int position) { return pictures.get(position); }
    @Override
    public long getItemId(int position) { return position; }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) convertView = inf.inflate(layout, null);
        final int pos=position;

        final ImageButton heartButton = (ImageButton)convertView.findViewById(R.id.heartButton);
        final ImageButton shareButton = (ImageButton)convertView.findViewById(R.id.shareButton);

        heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                heartButton.setImageResource();
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final ImageView imageView =(ImageView)convertView.findViewById(R.id.itemImageView);

        imageView.setImageResource(pictures.get(pos).getSrc());

        final TextView itemNameTextView=(TextView)convertView.findViewById(R.id.itemNameTextView);
        final TextView artistTextView=(TextView)convertView.findViewById(R.id.artistTextView);
        final TextView costTextView=(TextView)convertView.findViewById(R.id.costTextView);

        itemNameTextView.setText(pictures.get(pos).getName());
        artistTextView.setText(pictures.get(pos).getArtist());
        costTextView.setText(pictures.get(pos).getCost()+"원");

        final Button cartButton=(Button)convertView.findViewById(R.id.cartButton);
        final Button buyButton=(Button)convertView.findViewById(R.id.buyButton);

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"카트에 상품이 담겼습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), BuyActivity.class);
                intent.putExtra("picture",pictures.get(pos));
                view.getContext().startActivity(intent);
            }
        });




        return convertView;
    }
}
