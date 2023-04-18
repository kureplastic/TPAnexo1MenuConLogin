package com.example.tpanexo1menuconlogin.ui.musica;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tpanexo1menuconlogin.R;
import com.example.tpanexo1menuconlogin.databinding.FragmentMiMusicaBinding;

public class MiMusicaFragment extends Fragment {

    private MiMusicaViewModel mViewModel;
    private FragmentMiMusicaBinding binding;

    public static MiMusicaFragment newInstance() {
        return new MiMusicaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentMiMusicaBinding.inflate(getLayoutInflater());
        return inflater.inflate(R.layout.fragment_mi_musica, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MiMusicaViewModel.class);
        // TODO: Use the ViewModel
        binding.btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.play(view);
            }
        });
        binding.btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.stop(view);
            }
        });
    }




}