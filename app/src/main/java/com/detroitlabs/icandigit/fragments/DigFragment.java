package com.detroitlabs.icandigit.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.detroitlabs.icandigit.FindStuff;
import com.detroitlabs.icandigit.R;
import com.google.android.gms.maps.GoogleMap;

public class DigFragment extends Fragment {

    private GoogleMap googleMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_map, null);
        googleMap =  ((com.google.android.gms.maps.MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        // Check if button has been pressed
        Button button = (Button) rootView.findViewById(R.id.button_digit);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FindStuff.startDig();
            }
        });

        return rootView;
    }
}
