package com.example.databinding.Utils;

import com.example.databinding.R;
import com.example.databinding.models.Product;

import java.util.HashMap;

public class Products {

    public Product [] allProducts = {redLamb,yellowLamb,greenHat,purpleCase,blackHat,blueCase};

    public HashMap<String,Product> allProductMap = new HashMap<>();


    public Products (){

        for (Product product : allProducts){
            allProductMap.put(String.valueOf(product.getSerialNumber()),product);
        }
    }

    public static final Product redLamb = new Product("Lamb","Red Lamb",
            R.drawable.kirmizi,19.9,15.99,123,  4.5f,441241);

    public static final Product yellowLamb = new Product("Lamb","Yellow Lamb",
            R.drawable.sari,16.19,0,23,  4f,524362);

    public static final Product greenHat = new Product("Hat","Green Hat",
            R.drawable.yesil,23.49,18.59,44,  2.5f,262632);

    public static final Product purpleCase = new Product("Case","Purple Case",
            R.drawable.mor,12.50,5.99,42,  3f,441241);

    public static final Product blackHat = new Product("Hat","Black Hat",
            R.drawable.siyah,29,12.50,12,  4.5f,123141);


    public static final Product blueCase = new Product("Case","Blue Case",
            R.drawable.mavi,21.25,13.99,23,  5f,441241);














}
