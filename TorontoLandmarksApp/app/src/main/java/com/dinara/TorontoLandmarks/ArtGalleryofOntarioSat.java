package com.dinara.TorontoLandmarks;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ArtGalleryofOntarioSat extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_galleryof_ontario_sat);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng locationPoint= new LatLng(43.654072353906635, -79.39105317831934);
        mMap.addMarker(new MarkerOptions().position(locationPoint).title("Art Gallery of Ontario"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locationPoint,15));
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);
    }
}