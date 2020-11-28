package com.dinara.dinarasharipova_vladislavostrikov_comp304lab5_ex1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CasaLomaRegular extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_loma_regular);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng CasaLoma = new LatLng(43.67893718789539, -79.4092722386258);
        mMap.addMarker(new MarkerOptions().position(CasaLoma).title("Casa Loma"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CasaLoma,15));
        mMap.setMapType(mMap.MAP_TYPE_NORMAL);

    }
}