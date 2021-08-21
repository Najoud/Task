package com.example.task.TabLayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.task.MainActivity;
import com.example.task.MainActivity2;
import com.example.task.R;
import com.example.task.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {


    private FragmentLoginBinding binding;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false);

        binding.Log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    Intent intent= new Intent(getContext(),MainActivity2.class);
                    startActivity(intent);




                }
            });

        view = binding.getRoot();
        return view;
    }
}