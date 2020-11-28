package com.dinara.dinarasharipova_vladislavostrikov_comp304lab5_ex1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BMOFieldSat extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_o_field_sat);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng locationPoint= new LatLng(43.63340327913042, -79.41768563757049);
        mMap.addMarker(new MarkerOptions().position(locationPoint).title("BMO Field"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locationPoint,15));
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);
    }
}