package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextMessage);
    }

    public void onClickShowMessage(View view) {
        String msg = editText.getText().toString();
        //Intent intent = new Intent(this, ReceivedMessageActivity.class); //Explicite intent
        //intent.putExtra("msg", msg);
        Intent intent = new Intent(Intent.ACTION_SEND);  //Implicite intent
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_INTENT, msg);
        Intent choosenIntent = Intent.createChooser(intent, "Как вы хотите отправить сообщение?");

        startActivity(choosenIntent);
    }
}
