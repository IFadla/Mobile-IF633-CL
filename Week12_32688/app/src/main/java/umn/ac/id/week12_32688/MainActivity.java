package umn.ac.id.week12_32688;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tutorialSatu(View view) {
        Intent intent = new Intent(MainActivity.this, DeteksiSensor.class);
        startActivity(intent);
    }

    public void tutorialDua(View view) {
        Intent intent = new Intent(MainActivity.this, PembacaanDataSensor.class);
        startActivity(intent);
    }
}