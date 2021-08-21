package com.example.task.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.task.BlankFragment;
import com.example.task.MainActivity;
import com.example.task.MainActivity2;
import com.example.task.MainActivity3;
import com.example.task.R;
import com.example.task.databinding.FirstFragmentBinding;

public class first_fragment extends Fragment {
    FirstFragmentBinding binding;
    View view;
    private EditText editTextMobile;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.first_fragment,container,false);


        binding.back.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity2.class);
                startActivity(intent);

            }

        });
        binding.next.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity3.class);
                startActivity(intent);
            }

        });

       // editTextMobile = findViewById(R.id.editTextMobile);
//
//        findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String mobile = editTextMobile.getText().toString().trim();
//
//                if(mobile.isEmpty() || mobile.length() < 10){
//                    editTextMobile.setError("Enter a valid mobile");
//                    editTextMobile.requestFocus();
//                    return;
//                }
//
//                Intent intent = new Intent(MainActivity.this, VerifyPhoneActivity.class);
//                intent.putExtra("mobile", mobile);
//                startActivity(intent);
//            }
//        });
//    }
//
//}
        view = binding.getRoot();
        return view;
    }
}