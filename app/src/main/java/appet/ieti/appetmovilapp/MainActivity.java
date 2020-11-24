package appet.ieti.appetmovilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;

import appet.ieti.appetmovilapp.adoption.AdoptionActivity;
import appet.ieti.appetmovilapp.navbar.NavbarActivity;

public class MainActivity extends NavbarActivity {

    private Object NavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void adoptionClick(View view){
        Intent adoptionIntent = new Intent(this, AdoptionActivity.class);
        startActivity(adoptionIntent);
    }


}