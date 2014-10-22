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
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {

    //Declaring member variables.
    private Button mDigButton;
    private GoogleMap mMap;
    private MapFragment mMapFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Getting access to the activity view, and putting the map fragment into the background.
        View rootView = inflater.inflate(R.layout.fragment_map, null);

        //Making the Dig button a button (instead of just a square on the screen),
        mDigButton = (Button) rootView.findViewById(R.id.button_digit);

        // and making it do something when clicked.
        mDigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMapFragment = ((MapFragment) getFragmentManager().findFragmentById(R.id.map));
                //Android documentation says I won't be able to getMap() until the underlying
                // maps system is loaded and the underlying view in the fragment exists. It doesn't
                // exist yet?
                mMap = mMapFragment.getMap();
                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(10, 10))
                        .title("Hello world"));
            }
        });
        return rootView;
    }
}
