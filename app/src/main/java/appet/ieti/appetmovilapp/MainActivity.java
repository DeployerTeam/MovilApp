package appet.ieti.appetmovilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import appet.ieti.appetmovilapp.navbar.NavbarActivity;

public class MainActivity extends NavbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adoptionClick(View view){
        Toast.makeText(MainActivity.this,"Login",Toast.LENGTH_SHORT).show();
    }


}