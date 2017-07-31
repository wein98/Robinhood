package com.example.wein.robinhood;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wein on 25/7/2017.
 */

public class Sell extends Fragment {

    View myView;

    public static Sell newInstance() {

        Sell sellFragment = new Sell();
        return sellFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.sell);

        TextView title = (TextView) findViewById(R.id.sellTitle);
        title.setText("This is sell activity");*/

        /*BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_home:

                        //Intent intent0 = new Intent(Sell.this, MainActivity.class);
                        //startActivity(intent0);
                        break;
                    //mTextMessage.setText(R.string.title_home);
                    //return true;
                    case R.id.ic_sell:

                        break;
                    //mTextMessage.setText(R.string.title_dashboard);
                    //return true;
                    case R.id.ic_me:

                        //Intent intent2 = new Intent(Sell.this, Me.class);
                        //startActivity(intent2);
                        break;
                    //mTextMessage.setText(R.string.title_notifications);
                    //return true;
                }
                return false;
            }
        });*/

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.sell, container, false);

        return myView;

    }
}
