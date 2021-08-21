package com.example.task.TabLayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task.MainActivity;
import com.example.task.MainActivity2;
import com.example.task.R;
import com.example.task.databinding.FragmentRegBinding;


public class RegFragment extends Fragment {


    FragmentRegBinding binding;
    String Namw = "name";
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_reg,container,false);

//
//        binding.name.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                age = Integer.parseInt(binding.name.getText().toString());
//                Intent intent = new Intent(RegFragment.this ,.class );
//                intent.putExtra("data",data);
//                intent.putExtra("age",age);
//                startActivity(intent);
//            }
//        });
//
//            }


        view = binding.getRoot();
        return view;

    }}