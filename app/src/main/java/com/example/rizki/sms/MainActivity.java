package com.example.rizki.sms;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Inbox;
    private Button Outbox;
    private FloatingActionButton New;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inbox = (Button) findViewById(R.id.btnInbox);
        Inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInbox();
            }
        });

        Outbox= (Button) findViewById(R.id.btnOutbox);
        Outbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOutbox();
            }
        });

        New = (FloatingActionButton) findViewById(R.id.addNew);
        New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNew();
            }
        });

    }

    public void openInbox(){
        Intent intent = new Intent(this, InboxActivity.class);
        startActivity(intent);
    }

    public void openOutbox(){
        Intent intent = new Intent(this, OutboxActivity.class);
        startActivity(intent);
    }

    public void openNew(){
        Intent intent = new Intent(this, CreateMessageActivity.class);
        startActivity(intent);
    }
}
