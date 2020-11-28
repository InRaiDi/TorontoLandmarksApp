package com.dinara.dinarasharipova_vladislavostrikov_comp304lab5_ex1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RipleysAquariumRegular extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripleys_aquarium_regular);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng locationPoint= new LatLng(43.64267532001808, -79.38525277010844);
        mMap.addMarker(new MarkerOptions().position(locationPoint).title("Ripley's Aquarium of Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locationPoint,15));
        mMap.setMapType(mMap.MAP_TYPE_NORMAL);
    }
}