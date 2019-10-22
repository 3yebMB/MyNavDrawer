package dev.m13d.mynavdrawer;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

public class EighthActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";
    private static final String EXTRA_THEME = "EXTRA_THEME";

    private int themeNumber;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate");

        if (savedInstanceState != null) {
            themeNumber = savedInstanceState.getInt(EXTRA_THEME);

            switch (themeNumber) {
                case 0:
                    setTheme(R.style.AppTheme);
                    break;
                case 1:
                    setTheme(R.style.AppThemePurple);
                    break;
                case 2:
                    setTheme(R.style.AppThemeBrown);
                    break;
            }
        }

        initActivity();
    }

    private void initActivity() {
        setContentView(R.layout.activity_eighth);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string.menu_class8);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(EXTRA_THEME, themeNumber);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        switch (id) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.standard:
                themeNumber = 0;
                break;
            case R.id.puple:
                themeNumber = 1;
                break;
            case R.id.brown:
                themeNumber = 2;
                break;
        }
        recreate();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        switch (id) {
            case R.id.standard:
                setTheme(R.style.AppTheme);
                break;
            case R.id.puple:
                setTheme(R.style.AppThemePurple);
                break;
            case R.id.brown:
                setTheme(R.style.AppThemeBrown);
                break;
        }
        setContentView(R.layout.activity_main);
        return super.onOptionsItemSelected(menuItem);
    }

    public void onFab8Click(View view) {
//        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.putExtra("EXIT", true);
//        startActivity(intent);

        onBackPressed();
    }
}
