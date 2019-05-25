package com.example.databinding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.databinding.SingleColumnProductBinding;
import com.example.databinding.models.Product;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class ProductDetailAdapter extends RecyclerView.Adapter<ProductDetailAdapter.MyViewHolder> {
    private List<Product> productList = new ArrayList<>();
    private Context context;

    public ProductDetailAdapter(Context context, List<Product> productList){
        this.productList = productList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        SingleColumnProductBinding singleColumnProductBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.single_column_product,parent,false);

        return new MyViewHolder(singleColumnProductBinding.getRoot());

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Product product = productList.get(position);

        holder.singleColumnProductBinding.setProduct(product);
        holder.singleColumnProductBinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        SingleColumnProductBinding singleColumnProductBinding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            singleColumnProductBinding = DataBindingUtil.bind(itemView);

        }
    }
}
