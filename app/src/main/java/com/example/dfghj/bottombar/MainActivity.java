package com.example.dfghj.bottombar;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView;

        bottomNavigationView.setOnNavigationItemSelectedListener(new OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.favorites) {
                    // on favorites clicked
                    return true;
                }
                return false;
            }
        });
        BottomNavigationView navigationView;
// ...
        navigationView= (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        navigationView.getMenu().getItem(itemToSelect).setChecked(true);
    }
}
