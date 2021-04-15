package umn.ac.id.week10_32688;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToA(View view) {
        Intent intent = new Intent(MainActivity.this, Week10A.class);
        startActivity(intent);
    }
    public void goToB(View view) {
        Intent intent = new Intent(MainActivity.this, Week10B.class);
        startActivity(intent);
    }
    public void goToC(View view) {
        Intent intent = new Intent(MainActivity.this, Week10C.class);
        startActivity(intent);
    }
}