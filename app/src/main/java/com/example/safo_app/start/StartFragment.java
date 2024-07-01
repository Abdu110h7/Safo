package com.example.safo_app.start;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.safo_app.Login.phone.PhoneFragment;
import com.example.safo_app.R;
import com.google.android.material.card.MaterialCardView;


public class StartFragment extends Fragment {
    MaterialCardView start;

    public StartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PhoneFragment phoneFragment = new PhoneFragment();

                // Fragmentni almashtirish uchun FragmentTransaction dan foydalanish
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, phoneFragment);
                transaction.addToBackStack(null); // Or add a specific tag if needed
                transaction.commit();
            }
        });
    }
    private void initViews(View view) {
        start = view.findViewById(R.id.royhatdanotish);
    }
}