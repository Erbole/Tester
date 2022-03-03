package com.geektach.tester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.geektach.tester.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container_image_up, new ImageUpFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_music_bottom, new BottomMusicFragment()).commit();

    }
}