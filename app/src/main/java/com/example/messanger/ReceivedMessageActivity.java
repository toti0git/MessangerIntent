package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    TextView receivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        receivedMsg = findViewById(R.id.textViewReceivedMessage);
        receivedMsg.setText(msg);

    }

}
