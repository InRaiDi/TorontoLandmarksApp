package com.dinara.TorontoLandmarks;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RoyalOntarioMuseumRegular extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal_ontario_museum_regular);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng locationPoint= new LatLng(43.66882724076501, -79.39460543862579);
        mMap.addMarker(new MarkerOptions().position(locationPoint).title("Royal Ontario Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locationPoint,15));
        mMap.setMapType(mMap.MAP_TYPE_NORMAL);
    }
}