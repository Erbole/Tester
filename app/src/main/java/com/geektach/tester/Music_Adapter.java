package com.geektach.tester;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektach.tester.databinding.ItemBinding;

import java.util.ArrayList;

public class Music_Adapter extends RecyclerView.Adapter<Music_Adapter.ArraylistViewHolder> {
    private OnClick onClick;
    private ArrayList<Model> arrayList;

    public Music_Adapter(ArrayList<Model> arrayList, OnClick onClick) {
        this.arrayList = arrayList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ArraylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ArraylistViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ArraylistViewHolder holder, int position) {
        holder.bind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.click(arrayList.get(position));
                Log.d("ray", "adasdasd");
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ArraylistViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding binding;

        public ArraylistViewHolder(@NonNull ItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model) {
            binding.tvNames.setText(model.getName());
            binding.tvNumber.setInputType(model.getNumbers());
            binding.tvNamesPeople.setText(model.getMusic());
            binding.tvTimes.setText(model.getTimes());
        }
    }
}
