package umn.ac.id.music_player_app_uts_32688;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView textViewMyProfile;

    EditText inptUsername, inptPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewMyProfile = (TextView) findViewById(R.id.textViewMyProfile);
        textViewMyProfile.setPaintFlags(textViewMyProfile.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        inptUsername = findViewById(R.id.inputUsername);
        inptPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inptUsername.getText().toString().equals("admin") && inptPassword.getText().toString().equals("admin")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder( LoginActivity.this );

                    builder.setIcon(R.drawable.ic_done);
                    builder.setTitle("Login Successfully!");
                    builder.setMessage("Welcome to O BEATS!");

                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            moveToListMusic();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username & Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void moveToListMusic() {
        Intent intent = new Intent(this, ListMusicActivity.class);
        startActivity(intent);
    }

    public void moveToViewProfile(View view) {
        Intent intent = new Intent(this, ViewProfileActivity.class);
        startActivity(intent);
    }


}