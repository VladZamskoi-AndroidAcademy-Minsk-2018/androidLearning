package com.example.kirill.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

//import androidx.appcompat.app.AppCompatActivity;

public class LoveActivity extends AppCompatActivity {

    private static final String USER_TEXT = "flagResId";
    private TextView textView;

    public static void show(Context context, String text) {
        final Intent intent = new Intent(context, LoveActivity.class);
        intent.putExtra(LoveActivity.USER_TEXT, text);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        Bundle bundle = getIntent().getExtras();

        String stuff = bundle.getString("stuff");
        textView = (TextView) findViewById(R.id.text);
        textView.setText(stuff);

    }
}