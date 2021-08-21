package com.example.task.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.task.MainActivity2;
import com.example.task.R;
import com.example.task.databinding.FragmentLoginBinding;
import com.example.task.databinding.OutFragmentBinding;

public class out_fragment extends Fragment {


        private OutFragmentBinding binding ;
        View view;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment


            binding = DataBindingUtil.inflate(inflater,R.layout.out_fragment,container,false);




            view = binding.getRoot();
            return view;
        }
    }