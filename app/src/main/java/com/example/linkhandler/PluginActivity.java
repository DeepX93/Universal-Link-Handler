package com.example.linkhandler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PluginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String url = intent.getDataString();

        if (url != null) {
            Toast.makeText(this, "Intercepted URL: " + url, Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
