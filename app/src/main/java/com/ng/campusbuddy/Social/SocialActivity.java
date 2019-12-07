package com.ng.campusbuddy.Social;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
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
import com.ng.campusbuddy.Education.EducationActivity;
import com.ng.campusbuddy.MainActivity;
import com.ng.campusbuddy.R;

public class SocialActivity extends AppCompatActivity {

    Context mcontext = SocialActivity.this;

    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        /*Navigation Drawer*/
        SetupNavigationDrawer();
        /*---------------------*/

        /*Bottom Navigation*/
        SetUpBottomNavigation();
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_chat));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_group_chat));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_chat_room));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_search));
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
                        Intent education = new Intent(mcontext, EducationActivity.class);
                        startActivity(education);
                        break;
                    case R.id.nav_social:
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

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    /*Bottom Navigation*/
    private void SetUpBottomNavigation() {

        spaceNavigationView = findViewById(R.id.edu_bottom_nav);


        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(mcontext,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                spaceNavigationView.setCentreButtonSelectable(true);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(mcontext, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(mcontext, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });
    }
    /*-------------------------------------------*/

}
