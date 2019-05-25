package com.example.databinding.dataBinding;

import com.example.databinding.adapter.ProductDetailAdapter;
import com.example.databinding.models.Product;

import java.util.List;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainFragmentBindingAdapter {

    @BindingAdapter("productListAssign")
    public static void setProductList(RecyclerView recyclerView, List<Product> products){
        if (products == null) return;

        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null){
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(),2));
        }

        ProductDetailAdapter adapter = (ProductDetailAdapter) recyclerView.getAdapter();

        if (adapter == null){
            adapter = new ProductDetailAdapter(recyclerView.getContext(),products);
            recyclerView.setAdapter(adapter);
        }


    }

}
