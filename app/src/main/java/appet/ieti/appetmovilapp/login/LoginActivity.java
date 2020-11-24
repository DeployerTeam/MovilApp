package appet.ieti.appetmovilapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import appet.ieti.appetmovilapp.R;
import appet.ieti.appetmovilapp.navbar.NavbarActivity;

public class LoginActivity extends NavbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}