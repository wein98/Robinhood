package com.example.wein.robinhood;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wein on 31/7/2017.
 */

public class Notifications extends Fragment {

    View myView;
    TextView textView;

    public static Notifications newInstance() {

        Notifications notificationsFragment = new Notifications();
        return notificationsFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.notifications, container, false);

        textView = (TextView) myView.findViewById(R.id.notificationsText);
        textView.setText("Notification page.");

        return myView;

    }
}
