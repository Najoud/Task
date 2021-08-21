package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
     private EditText editText ;
    private EditText editTextMessage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();}}
//        ActivityCompat.requestPermissions(MainActivity3.this,new String[]{Manifest.permission.SEND_SMS,Manifest.permission.READ_SMS},PackageManager.PERMISSION_GRANTED);
//
//        editTextMessage = findViewById(R.id.phone);
//        editText = findViewById(R.id.squareField);
//    }
//
//    public void sendSMS(View view){
//
//        String message = editTextMessage.getText().toString();
//        String number = editText.getText().toString();
//
//        SmsManager mySmsManager = SmsManager.getDefault();
//        mySmsManager.sendTextMessage(number,null, message, null, null);
//    }
//}
//
//
