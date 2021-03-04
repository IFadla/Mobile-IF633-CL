package umn.ac.id.week06_32688;

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

    public void goToActAnimProp(View view) {
        Intent intent = new Intent(this, AnimasiProperty.class);
        startActivity(intent);
    }

    public void goToActAnimDraw(View view) {
        Intent intent = new Intent(this, AnimasiDrawable.class);
        startActivity(intent);
    }

    public void goToActAnimFisika(View view) {
        Intent intent = new Intent(this, AnimasiFisika.class);
        startActivity(intent);
    }
}