package com.example.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textToGreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToGreet = findViewById(R.id.NameText);

    }


    public void Greet(View view){
        if(number(textToGreet.getText().toString())){
            Context context = getApplicationContext();
            CharSequence text = "Please Enter Name";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {
            displayGreetText("Hello, " + textToGreet.getText().toString() + ".");
        }

    }
    public void displayGreetText(String point) {
        TextView scoreView = (TextView) findViewById(R.id.MainText);
        scoreView.setText(String.valueOf(point));
    }

    private boolean number(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
