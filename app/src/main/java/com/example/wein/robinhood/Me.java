package com.example.wein.robinhood;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wein on 25/7/2017.
 */

public class Me extends Fragment {

    View myView;
    TextView textView;

    public static Me newInstance() {

        Me meFragment = new Me();
        return meFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.me, container, false);

        textView = (TextView) myView.findViewById(R.id.meText);
        textView.setText("Notification page.");

        return myView;

    }
}
