package com.example.a3screens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ReportFragment;

import android.app.Fragment;
import android.location.SettingInjectorService;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation_Profile = findViewById(R.id.navigation_Profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        // Display initial fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new androidx.fragment.app.Fragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        private MenuItem item;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            this.item = item;
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new ReportFragment();
                    break;
                case R.id.navigation_search:
                    selectedFragment = new ReportFragment();
                    break;
                case R.id.navigation_profile:
                selectedFragment = new ReportFragment();
                break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }

        ;
    };
}









