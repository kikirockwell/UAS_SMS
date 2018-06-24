package com.example.rizki.sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailSMSActivity extends AppCompatActivity  {
    TextView txtPhone, txtMessage, txtDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sms);

        txtPhone = (TextView) findViewById(R.id.txtPhone);
        txtMessage = (TextView) findViewById(R.id.txtMessage);
        txtDate = (TextView) findViewById(R.id.txtDate);


        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            txtPhone.setText(extras.getString("txtPhone"));
            txtMessage.setText(extras.getString("txtMessage"));
            txtDate.setText(extras.getString("txtDate"));
        }
    }
}
