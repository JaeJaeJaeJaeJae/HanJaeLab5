package com.jae.han.hanjaelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId() == R.id.button){
            i = new Intent(this,SecondActivity.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.6307° N, 121.0165° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}

