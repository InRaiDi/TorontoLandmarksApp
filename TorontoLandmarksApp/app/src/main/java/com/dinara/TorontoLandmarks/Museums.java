package com.dinara.TorontoLandmarks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(getResources().getText(R.string.cat2));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
    }
    public void Loc1_reg(View view) {
        Intent intent1 = new Intent(this, RoyalOntarioMuseumRegular.class);
        startActivity(intent1);
    }

    public void Loc1_sat(View view) {
        Intent intent2 = new Intent(this, RoyalOntarioMuseumSat.class);
        startActivity(intent2);
    }
    public void Loc2_reg(View view) {
        Intent intent3 = new Intent(this, ArtGalleryofOntarioRegular.class);
        startActivity(intent3);
    }

    public void Loc2_sat(View view) {
        Intent intent4 = new Intent(this, ArtGalleryofOntarioSat.class);
        startActivity(intent4);
    }
    public void Loc3_reg(View view) {
        Intent intent5 = new Intent(this, GardinerMuseumRegular.class);
        startActivity(intent5);
    }

    public void Loc3_sat(View view) {
        Intent intent6 = new Intent(this, GardinerMuseumSat.class);
        startActivity(intent6);
    }
}