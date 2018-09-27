package com.jae.han.hanjaelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button2) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.6202° N, 121.0047° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}