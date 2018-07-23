package com.example.kirill.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button applyButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button emailButton = findViewById(R.id.button_email);
        Button applyButton = findViewById(R.id.button_activity);

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.plain_text_input);
                final String text = textView.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"testkirimihiniki@email.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "The message I wrote on my app");
                emailIntent.putExtra(Intent.EXTRA_TEXT, text);

                startActivity(Intent.createChooser(emailIntent, "Send Email"));
            }
        });

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, LoveActivity.class);
            TextView textView = findViewById(R.id.plain_text_input);
            String text = textView.getText().toString();

            Bundle bundle = new Bundle();
            bundle.putString("stuff", text);

            i.putExtras(bundle);

            startActivity(i);
            }
        });
        }

    }
