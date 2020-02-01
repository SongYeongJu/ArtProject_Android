package com.example.artproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.artproject.Activities.ItemInfoActivity;
import com.example.artproject.Adapter.GridViewAdapter;
import com.example.artproject.Client.ClientInfoManager;
import com.example.artproject.R;


public class Tab1Fragment extends Fragment {
    static public Tab1Fragment tab1Fragment= new Tab1Fragment();
    static public Tab1Fragment getInstance(){ return tab1Fragment; }
    private ClientInfoManager clientInfoManager=ClientInfoManager.getInstance();
    private GridView gv;
    private GridViewAdapter adapter;


    public Tab1Fragment() { }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        gv = (GridView)view.findViewById(R.id.gridView1);
        adapter = new GridViewAdapter (getActivity(), R.layout.row, clientInfoManager.getPictures());    // 데이터
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), ItemInfoActivity.class);
                intent.putExtra("picture",clientInfoManager.getPictures().get(position));
                startActivity(intent);
            }
        });
        return view;
    }
}
