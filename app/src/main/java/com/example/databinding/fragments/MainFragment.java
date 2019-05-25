package com.example.databinding.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.Utils.Products;
import com.example.databinding.adapter.ProductDetailAdapter;
import com.example.databinding.databinding.FragmentMainBinding;
import com.example.databinding.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;


public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    FragmentMainBinding fragmentMainBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentMainBinding = FragmentMainBinding.inflate(inflater);

        fragmentMainBinding.swipeRefreshLayout.setOnRefreshListener(this);

        setupRecyclerView();
        return fragmentMainBinding.getRoot();
    }

    private void setupRecyclerView() {

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        fragmentMainBinding.allProductRecyclerView.setLayoutManager(gridLayoutManager);

        Products productList = new Products();
        List<Product> products = new ArrayList<>();
        products.addAll(Arrays.asList(productList.allProducts));

        ProductDetailAdapter adapter = new ProductDetailAdapter(getActivity(),products);
        fragmentMainBinding.allProductRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onRefresh() {

    }
}
