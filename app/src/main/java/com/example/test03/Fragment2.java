package com.example.test03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment2 extends Fragment {

    Button btnfragmrnt1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"This is Fragment TWO",Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        btnfragmrnt1=view.findViewById(R.id.btngotofragment1);

        btnfragmrnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new Fragment1();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainContainer,fragment).commit();
            }
        });
        return view;
    }
}