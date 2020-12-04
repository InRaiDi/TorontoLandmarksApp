package com.dinara.dinarasharipova_vladislavostrikov_comp304lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//4 categories:

// Old buildings: Casa Loma; Gooderham Building; Osgoode Hall.
// Museums: Royal Ontario Museum, Art Gallery of Ontario; Gardiner Museum.
// Stadiums: Rogers Centre; Scotiabank Arena; BMO Field.
// Attractions: CN Tower; Ripley's Aquarium of Canada; Toronto Zoo.

public class MainActivity extends AppCompatActivity {
    private EditText txtTaskId, txtTaskName, txtTaskDescription;
    private ListView lstTasks;
    ArrayAdapter<String> tasksAdapter;
    private onClickInterface onclickInterface;

    private RecyclerView recyclerView;
    private TypeItemAdapter itemAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Type> types = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(getResources().getText(R.string.title_activity_main));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        onclickInterface = new onClickInterface() {
            @Override
            public void setClick(int pos) {
              //  Toast.makeText(MainActivity.this,"Position is "+pos,Toast.LENGTH_LONG).show();
                switch (pos) {
                    case 0:
                        Intent intent1 = new Intent(MainActivity.this, OldBuildings.class);
                        startActivity(intent1);
                        break;

                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, Museums.class);
                        startActivity(intent2);
                        break;

                    case 2:
                        Intent intent3 = new Intent(MainActivity.this, Stadiums.class);
                        startActivity(intent3);
                        break;

                    case 3:
                        Intent intent4 = new Intent(MainActivity.this, Attractions.class);
                        startActivity(intent4);
                        break;
                }

            }
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        TypeItemAdapter adapter = new TypeItemAdapter(this, types, onclickInterface);
        recyclerView.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    private void setInitialData(){
        types.add(new Type (getResources().getString(R.string.cat1)));
        types.add(new Type (getResources().getString(R.string.cat2)));
        types.add(new Type (getResources().getString(R.string.cat3)));
        types.add(new Type (getResources().getString(R.string.cat4)));
    }
}