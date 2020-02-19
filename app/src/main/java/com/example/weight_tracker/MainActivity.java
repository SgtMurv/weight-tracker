package com.example.weight_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveEntry(View view){
        Toast successMessage = Toast.makeText(this, "Saving...",Toast.LENGTH_LONG);
        successMessage.show();
    }

}
