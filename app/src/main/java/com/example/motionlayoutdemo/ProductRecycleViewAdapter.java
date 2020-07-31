package com.example.motionlayoutdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductRecycleViewAdapter extends RecyclerView.Adapter<ProductRecycleViewAdapter.ProductViewHolder> {

    private String[] mStringArray;

    @NonNull
    @Override
    public ProductRecycleViewAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.product_item,
                parent,
                false
        );
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductRecycleViewAdapter.ProductViewHolder holder, int position) {
        holder.bind(mStringArray[position]);
    }

    @Override
    public int getItemCount() {
        return mStringArray.length;
    }

    public void setStringArray(String[] stringArray) {
        mStringArray = stringArray;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(String str) {
            TextView textView = itemView.findViewById(R.id.textView);
            textView.setText(str);
        }
    }
}
