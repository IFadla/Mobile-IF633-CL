package umn.ac.id.music_player_app_uts_32688;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ViewProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToMyLinkedIn (View view) {
        goToUrlLinkedIn ( "https://www.linkedin.com/in/fadla-ichsan-a4a067207/");
    }

    public void goToAllReferences(View view) {
        Intent intent = new Intent(this, ReferencesActivity.class);
        startActivity(intent);
    }

    private void goToUrlLinkedIn (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}