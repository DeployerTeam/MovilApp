package appet.ieti.appetmovilapp.adoption;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import appet.ieti.appetmovilapp.R;

public class AdoptionActivity extends AppCompatActivity {

    private RecyclerView gridAdoption;
    RecyclerView.LayoutManager layoutManager;
    AdoptionAdapterActivity adoptionAdapterActivity;

    int[] pets = {R.drawable.a,R.drawable.b,R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption);
        gridAdoption = findViewById(R.id.gridView);
        layoutManager = new GridLayoutManager(this,2);
        gridAdoption.setLayoutManager(layoutManager);
        adoptionAdapterActivity = new AdoptionAdapterActivity(pets);
        gridAdoption.setAdapter(adoptionAdapterActivity);
        gridAdoption.setHasFixedSize(true);

    }
}