package com.batch4.fragmentbatch4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment2 extends Fragment {
    String name;
    TextView textView;
    BlankFragment2(String name){
        this.name = name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_blank2, container, false);

        textView = view.findViewById(R.id.textView2);
        textView.setText(name);
        // Inflate the layout for this fragment
        return view;
    }
}