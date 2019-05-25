package com.example.databinding.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.Utils.Products;
import com.example.databinding.databinding.FragmentProductDetailBinding;


public class ProductDetail extends Fragment {

    FragmentProductDetailBinding fragmentProductDetailBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProductDetailBinding =FragmentProductDetailBinding.inflate(inflater);

        Products products = new Products();
        fragmentProductDetailBinding.setProduct(products.allProducts[0]);
        fragmentProductDetailBinding.setQuantity(3);

        return fragmentProductDetailBinding.getRoot();
    }

}
