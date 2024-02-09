package com.example.flowervas;

 import android.os.Bundle;
 import android.widget.TabHost;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity{
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         setTitle("ПР6");
         TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

         tabHost.setup();

         TabHost.TabSpec tabSpec = tabHost.newTabSpec("tag1");

         tabSpec.setContent(R.id.linearLayout);
         tabSpec.setIndicator("Влкад 1");
         tabHost.addTab(tabSpec);

         tabSpec = tabHost.newTabSpec("tag2");
         tabSpec.setContent(R.id.linearLayout2);
         tabSpec.setIndicator("Влкад 2");
         tabHost.addTab(tabSpec);

         tabSpec = tabHost.newTabSpec("tag3");
         tabSpec.setContent(R.id.linearLayout3);
         tabSpec.setIndicator("Влкад 3");
         tabHost.addTab(tabSpec);

         tabSpec = tabHost.newTabSpec("tag4");
         tabSpec.setContent(R.id.linearLayout4);
         tabSpec.setIndicator("Влкад 4");
         tabHost.addTab(tabSpec);

         tabHost.setCurrentTab(0);
     }
 }
