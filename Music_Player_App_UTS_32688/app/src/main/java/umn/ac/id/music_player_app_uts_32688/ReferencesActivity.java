package umn.ac.id.music_player_app_uts_32688;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ReferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToReferenes (View view) {
        goToReferenes ( "https://drive.google.com/file/d/1_w4goFTQ2H1MXrxLvVYyNuPHOQ8ZfIPO/view?usp=sharing");
    }

    private void goToReferenes (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}