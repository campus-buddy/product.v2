package com.ng.campusbuddy.Education;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.ng.campusbuddy.MainActivity;
import com.ng.campusbuddy.R;

public class EducationActivity extends AppCompatActivity {

    Context mcontext = EducationActivity.this;

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    SpaceNavigationView spaceNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        /*Navigation Drawer*/
        SetupNavigationDrawer();
        /*---------------------*/

        /*Bottom Navigation*/
        SetUpBottomNavigation();
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_timetable));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_myshelf));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_bookmark));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_qa));
        /*---------------------------------------------*/

    }

    private void SetupNavigationDrawer() {

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_drawer);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        Intent home = new Intent(mcontext, MainActivity.class);
                        startActivity(home);
                        break;
                    case R.id.nav_education:
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

    /*Bottom Navigation*/
    private void SetUpBottomNavigation() {

        spaceNavigationView = findViewById(R.id.edu_bottom_nav);


        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(EducationActivity.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                spaceNavigationView.setCentreButtonSelectable(true);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(EducationActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(EducationActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });
    }
    /*-------------------------------------------*/
}
