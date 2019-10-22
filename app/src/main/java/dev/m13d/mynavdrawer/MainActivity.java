package dev.m13d.mynavdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import dev.m13d.mynavdrawer.class45.FourthActivity;
import dev.m13d.mynavdrawer.class6.SixthActivity;
import dev.m13d.mynavdrawer.class7.SeventhActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finishAffinity();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_class2:
//                Toast.makeText(this, "Class2", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;
            case R.id.nav_class4:
//                Toast.makeText(this, "Class4", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, FourthActivity.class));
                break;
            case R.id.nav_class6:
//                Toast.makeText(this, "Class6", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SixthActivity.class));
                break;
            case R.id.nav_class7:
//                Toast.makeText(this, "Class7", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SeventhActivity.class));
                break;
            case R.id.nav_class8:
//                Toast.makeText(this, "Class7", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, EighthActivity.class));
                break;

        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
