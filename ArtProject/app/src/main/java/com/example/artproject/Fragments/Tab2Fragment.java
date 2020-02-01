package com.example.artproject.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.artproject.Adapter.ItemListViewAdapter;
import com.example.artproject.Client.ClientInfoManager;
import com.example.artproject.R;


public class Tab2Fragment extends Fragment {
    static public Tab2Fragment tab2Fragment= new Tab2Fragment();
    static public Tab2Fragment getInstance(){ return tab2Fragment; }

    private ClientInfoManager clientInfoManager= ClientInfoManager.getInstance();

    private ListView timeline;
    private ItemListViewAdapter adapter;

    public Tab2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        timeline = (ListView) view.findViewById(R.id.itemListView);
        adapter = new ItemListViewAdapter(getActivity(), R.layout.item_layout, clientInfoManager.getPictures());    // 데이터
        timeline.setAdapter(adapter);

        return view;
    }
}
