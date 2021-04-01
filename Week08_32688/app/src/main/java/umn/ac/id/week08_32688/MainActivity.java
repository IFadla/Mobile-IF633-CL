package umn.ac.id.week08_32688;

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

    public void goToTutorial1(View view) {
        Intent intent = new Intent(MainActivity.this, TutorialOne.class);
        startActivity(intent);
    }

    public void goToTutorial2(View view) {
        Intent intent = new Intent(MainActivity.this, TutorialTwo.class);
        startActivity(intent);
    }
}