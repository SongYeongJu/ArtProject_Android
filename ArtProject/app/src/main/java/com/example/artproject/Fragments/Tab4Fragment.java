package com.example.artproject.Fragments;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.artproject.Activities.ItemInfoActivity;
import com.example.artproject.Adapter.GridViewAdapter;
import com.example.artproject.Client.ClientInfoManager;
import com.example.artproject.R;


public class Tab4Fragment extends Fragment {
    static public Tab4Fragment tab4Fragment= new Tab4Fragment();
    static public Tab4Fragment getInstance(){ return tab4Fragment; }
    private ClientInfoManager clientInfoManager=ClientInfoManager.getInstance();


    private ImageView profileImageView;
    private Button settingButton1;
    private Button settingButton2;

    private ListView listView;
    private GridViewAdapter adapter;


    public Tab4Fragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        profileImageView=(ImageView)getActivity().findViewById(R.id.profileImageView);

        settingButton1=(Button)getActivity().findViewById(R.id.settingButton1);
        settingButton2=(Button)getActivity().findViewById(R.id.settingButton2);

        settingButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        settingButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // make ImageView to round
        profileImageView.setBackground(new ShapeDrawable(new OvalShape()));
        profileImageView.setClipToOutline(true);

        listView=(ListView)getActivity().findViewById(R.id.myItemListView);
        adapter = new GridViewAdapter(getActivity(), R.layout.row, clientInfoManager.getPictures());    // 데이터
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), ItemInfoActivity.class);
                intent.putExtra("picture",clientInfoManager.getPictures().get(position));
                startActivity(intent);
            }
        });

        return inflater.inflate(R.layout.fragment_tab4, container, false);
    }
}
