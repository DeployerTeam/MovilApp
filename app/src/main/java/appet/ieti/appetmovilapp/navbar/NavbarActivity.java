package appet.ieti.appetmovilapp.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import appet.ieti.appetmovilapp.R;
import appet.ieti.appetmovilapp.login.*;
import appet.ieti.appetmovilapp.register.*;

public class NavbarActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);
        dl = (DrawerLayout) findViewById(R.id.dl);
        actionBar = new ActionBarDrawerToggle(this,dl,R.string.open,R.string.close);
        actionBar.setDrawerIndicatorEnabled(true);
        dl.addDrawerListener(actionBar);
        actionBar.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navView = (NavigationView)findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 int id= item.getItemId();

                if(id == R.id.login){
                    Toast.makeText(NavbarActivity.this,"Login",Toast.LENGTH_SHORT).show();
                    Intent login = new Intent(NavbarActivity.this, LoginActivity.class);
                    startActivity(login);
                }else if(id == R.id.signup){
                    Toast.makeText(NavbarActivity.this,"Register",Toast.LENGTH_SHORT).show();
                    Intent signup = new Intent(NavbarActivity.this,RegisterActivity.class);
                    startActivity(signup);
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBar.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}