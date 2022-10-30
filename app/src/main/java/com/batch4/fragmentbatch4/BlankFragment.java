package com.batch4.fragmentbatch4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    String name;
    TextView textView;
    Button button;
    BlankFragment(String n){
        name = n;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        textView = view.findViewById(R.id.textView);
        button = view.findViewById(R.id.button2);

        textView.setText(name);
        button.setOnClickListener(v -> {
           requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new BlankFragment2(name)).commit();
        });
        // Inflate the layout for this fragment
        return view;
    }
}