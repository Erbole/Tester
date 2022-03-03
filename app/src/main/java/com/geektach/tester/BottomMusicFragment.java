package com.geektach.tester;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektach.tester.databinding.FragmentBottomMusicBinding;

import java.util.ArrayList;

public class BottomMusicFragment extends Fragment {
    private FragmentBottomMusicBinding binding;
    private Music_Adapter adapter;
    private ArrayList<Model> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBottomMusicBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter =  new Music_Adapter(arrayList);
        binding.recyclerMusic.setAdapter(adapter);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Model("Teylor swift", "ewrwer", 1, "3:33"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 2, "2:32"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 3, "1:33"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 5, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 6, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 7, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 8, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 9, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 10, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 11, "4:22"));
        arrayList.add(new Model("Teylor swift", "ewrwer", 12, "4:22"));

    }
}