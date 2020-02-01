package com.example.artproject.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.artproject.R;


public class Tab3Fragment extends Fragment {
    static public Tab3Fragment tab3Fragment= new Tab3Fragment();
    static public Tab3Fragment getInstance(){ return tab3Fragment; }
    public Tab3Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("song","create fragment 3");
        return inflater.inflate(R.layout.fragment_tab3, container, false);
    }
}
