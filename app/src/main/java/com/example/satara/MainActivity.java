package com.example.satara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private EditText editTextMobile;
     private EditText mytext;
     private Button googleButton;
     private FirebaseAuth myauth;
     private FirebaseUser myuser;
     private String mvid;
     int RC_SIGN_IN=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        myauth=FirebaseAuth.getInstance();  //User's id
        myuser=myauth.getCurrentUser(R.id.editText);


        if(myuser!=null)
        {
            Intent intent2 = new Intent(MainActivity.this, second.class);
            startActivity(intent2);
        }

        //  setContentView(R.layout.activity_main);

        // Configure Google Sign In
      /*  GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        private void signIn() {
            Intent signInIntent = mGoogleSignInClient.getSignInIntent();
            startActivityForResult(signInIntent, RC_SIGN_IN);
        }
        googleButton=findViewById(R.id.google_signin);


        //google sign in
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Choose authentication providers
                List<AuthUI.IdpConfig> providers;
                providers = Arrays.asList(

                        new AuthUI.IdpConfig.GoogleBuilder().build());

                // Create and launch sign-in intent
                startActivityForResult(
                        AuthUI.getInstance()
                                .createSignInIntentBuilder()
                                .setAvailableProviders(providers)
                                .build(),
                        RC_SIGN_IN);

            }
        });*/
    }
}
