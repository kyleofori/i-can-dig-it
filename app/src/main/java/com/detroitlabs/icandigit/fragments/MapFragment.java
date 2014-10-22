package com.detroitlabs.icandigit.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.detroitlabs.icandigit.R;

public class MapFragment extends Fragment {

    private Button mDigButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_map, null);

        mDigButton = (Button) rootView.findViewById(R.id.button_digit);
        mDigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        return rootView;
    }
}
