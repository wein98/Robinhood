package com.example.wein.robinhood;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;

/**
 * Created by wein on 31/7/2017.
 */

public class Home extends Fragment {

    View myView;
    GridView gridView;
    static ArrayList<Product> productList = new ArrayList<Product>();


    public static Home newInstance() {

        Home homeFragment = new Home();
        return homeFragment;
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

        myView = inflater.inflate(R.layout.home, container, false);

        addItem();
        //textView = (TextView) getView().findViewById(R.id.homeText);
        //textView.setText("This is home.");
        gridView = (GridView) myView.findViewById(R.id.gridView);

        GridAdapter gridAdapter = new GridAdapter(getActivity(), R.layout.gridview_custom_layout, productList);
        gridView.setAdapter(gridAdapter);

        return myView;

    }

    public void addItem() {

        Product item1 = new Product("Adidas", "Yeezy Boost 350 V2 Cream White", 700.0, "Wein",R.drawable.yeezywhite);
        Product item2 = new Product("Adidas2", "Yeezy Boost 350 V2 Cream White", 600.0, "Wein",R.drawable.yeezywhite);
        Product item3 = new Product("Adidas3", "Yeezy Boost 350 V2 Cream White", 7800.0, "Wein",R.drawable.yeezywhite);
        Product item4 = new Product("Adidas4", "Yeezy Boost 350 V2 Cream White", 800.0, "Wein",R.drawable.yeezywhite);
        Product item5 = new Product("Adidas5", "Yeezy Boost 350 V2 Cream White", 900.0, "Wein",R.drawable.yeezywhite);
        Product item6 = new Product("Adidas6", "Yeezy Boost 350 V2 Cream White", 500.0, "Wein",R.drawable.yeezywhite);

        productList.add(item1);
        productList.add(item2);
        productList.add(item3);
        productList.add(item4);
        productList.add(item5);
        productList.add(item6);
    }
}
