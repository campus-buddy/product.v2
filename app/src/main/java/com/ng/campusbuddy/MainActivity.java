package com.ng.campusbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.ng.campusbuddy.Education.EducationActivity;

public class MainActivity extends AppCompatActivity {

    Context mcontext = MainActivity.this;

    NavigationView navigationView;
    DrawerLayout drawerLayout;

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SetupNavigationDrawer();
        
        FolatingActionButton();
    }

    private void FolatingActionButton() {
        
        floatingActionButton = (FloatingActionButton) findViewById(R.id.post_fab);
        
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext, "Post New Status", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void SetupNavigationDrawer() {

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_drawer);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(mcontext, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_education:
                        Intent education = new Intent(mcontext, EducationActivity.class);
                        startActivity(education);
                        break;
                    case R.id.nav_social:
                        Toast.makeText(mcontext, "Social", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_entertainment:
                        Toast.makeText(mcontext, "Entertainment", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_business:
                        Toast.makeText(mcontext, "Business", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_settings:
                        Toast.makeText(mcontext, "Settings", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_log_out:
                        Toast.makeText(mcontext, "Log Out", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });
    }
}
