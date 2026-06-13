package com.example.simplewebview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.web_url = "https://www.google.com/";

                // Video_Player Activity চালানোর আগে static variable এ URL set করা হচ্ছে
                // Video_Player class-এর static variable হওয়ায় object ছাড়া class name দিয়ে access করা হচ্ছে

                Intent myIntent = new Intent(MainActivity.this, Video_Player.class);
                startActivity(myIntent);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.web_url = "https://www.youtube.com/";

                // Video_Player Activity চালানোর আগে static variable এ URL set করা হচ্ছে
                // Video_Player class-এর static variable হওয়ায় object ছাড়া class name দিয়ে access করা হচ্ছে

                Intent myIntent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(myIntent);

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.web_url = "https://discord.com/";

                // Video_Player Activity চালানোর আগে static variable এ URL set করা হচ্ছে
                // Video_Player class-এর static variable হওয়ায় object ছাড়া class name দিয়ে access করা হচ্ছে

                Intent myIntent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(myIntent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}