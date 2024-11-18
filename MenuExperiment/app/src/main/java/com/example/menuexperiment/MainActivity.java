package com.example.menuexperiment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Set the activity layout

        textView = findViewById(R.id.textView);  // Find the TextView by ID
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu from XML
        getMenuInflater().inflate(R.menu.main_menu, menu);
        Log.d("Menu", "Menu created!");
        return true;  // Return true to show the menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // When 'Settings' is selected, update the TextView
            textView.setText("Settings selected");
            return true;
        } else if (id == R.id.action_about) {
            // When 'About' is selected, update the TextView
            textView.setText("About selected");
            return true;
        } else {
            // If the item doesn't match any case, call the parent method
            return super.onOptionsItemSelected(item);
        }
    }
}
