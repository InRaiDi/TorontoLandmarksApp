package com.dinara.dinarasharipova_vladislavostrikov_comp304lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(getResources().getText(R.string.cat4));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
    }
    public void Loc1_reg(View view) {
        Intent intent1 = new Intent(this, CNTowerRegular.class);
        startActivity(intent1);
    }

    public void Loc1_sat(View view) {
        Intent intent2 = new Intent(this, CNTowerSat.class);
        startActivity(intent2);
    }
    public void Loc2_reg(View view) {
        Intent intent3 = new Intent(this, RipleysAquariumRegular.class);
        startActivity(intent3);
    }

    public void Loc2_sat(View view) {
        Intent intent4 = new Intent(this, RipleysAquariumSat.class);
        startActivity(intent4);
    }
    public void Loc3_reg(View view) {
        Intent intent5 = new Intent(this, TorontoZooRegular.class);
        startActivity(intent5);
    }

    public void Loc3_sat(View view) {
        Intent intent6 = new Intent(this, TorontoZooSat.class);
        startActivity(intent6);
    }
}