package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user　taps the Send button */
    public void  sendmessage(View view)  {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void clearText(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("");
    }
    public void onPushZeroBotton(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("0");
    }
    public void onPushoneBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("1");
    }
    public void onPushtwoBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("2");
    }
    public void onPushthreeBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("3");
    }
    public void onPushfourBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("4");
    }
    public void onPushfiveBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("5");
    }
    public void onPushsixBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("6");
    }
    public void onPushsevenBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("7");
    }
    public void onPusheightBotton(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("8");
    }












}
