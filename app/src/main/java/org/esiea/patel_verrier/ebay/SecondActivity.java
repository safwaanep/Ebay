package org.esiea.patel_verrier.ebay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void clickButton3(View view) {
        // Intent
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }

    public void clickButtonGeo(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=eBay, Heron Square, Richmond, Royaume-Uni")));
    }



}