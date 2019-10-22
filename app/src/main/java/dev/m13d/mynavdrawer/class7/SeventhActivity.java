package dev.m13d.mynavdrawer.class7;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import dev.m13d.mynavdrawer.R;
import dev.m13d.mynavdrawer.class7.fragments.Fragment1;
import dev.m13d.mynavdrawer.class7.fragments.Fragment2;
import dev.m13d.mynavdrawer.class7.fragments.Fragment3;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        Fragment f1 = Fragment1.newInstance(null);
        Fragment f2 = Fragment2.newInstance(null);
        Fragment f3 = Fragment3.newInstance(null);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.addFragment(f1, "tab1");
        myAdapter.addFragment(f2, "tab2");
        myAdapter.addFragment(f3, "tab3");

        ViewPager vPager = findViewById(R.id.view_pager);
        vPager.setAdapter(myAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(vPager);
    }

    public void onFab7Click(View view) {
        onBackPressed();
    }
}
