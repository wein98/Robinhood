package com.example.wein.robinhood;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wein on 29/7/2017.
 */

public class GridAdapter extends ArrayAdapter<Product> {

    private Context mContext;
    LayoutInflater layoutInflater;
    int mResource;
    View view;

    public GridAdapter(Context context, int resource, ArrayList<Product> objects)
    {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        String brand = getItem(position).getBrand();
        String model = getItem(position).getModel();
        double price = getItem(position).getPrice();
        int image = getItem(position).getImage();

        String convertPrice = Double.toString(price);

        //Product product = new Product(name, price);

        layoutInflater  = LayoutInflater.from(mContext);
        //convertView = layoutInflater.inflate(mResource, parent, false);
        convertView = layoutInflater.inflate(R.layout.gridview_custom_layout, null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.img);
        TextView productBrand = (TextView) convertView.findViewById(R.id.productBrand);
        TextView productModel = (TextView) convertView.findViewById(R.id.productModel);
        TextView productPrice = (TextView) convertView.findViewById(R.id.price);

        productBrand.setText(brand);
        productModel.setText(model);
        productPrice.setText(convertPrice);
        imageView.setImageResource(image);



        return convertView;
    }
}
