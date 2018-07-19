package com.maineybnaya.randomrecyclercieew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ErrorCodes;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.maineybnaya.randomrecyclercieew.adapterstobinddata.AdapterToBindData;
import com.maineybnaya.randomrecyclercieew.modelsorsaydataset.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnSO;

    private static final int RC_SIGN_IN = 007;
    private static final String TAG = "RNADI MADARJAAT";
    RecyclerView rvChatObject;
    AdapterToBindData merarVAdapterObject;
    List<models> listObject;

    FirebaseUser mv_loginUser;  //default is null
    /*
    We check this value if this is not null then login otherwise do not do anything or say go to login page
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSO = findViewById(R.id.btnSO);

        rvChatObject = findViewById(R.id.rvChatBox);

        listObject = new ArrayList<>();

        mv_loginUser = FirebaseAuth.getInstance().getCurrentUser(); //to get currentUser information
        rvChatObject.setLayoutManager(new LinearLayoutManager(this)); //By default vertical
        merarVAdapterObject = new AdapterToBindData(listObject, this);

        rvChatObject.setAdapter(merarVAdapterObject);

/*
to logoff a user and bring him to first screen
NOTE: back karte hi isme bhi wahi prev data dikhai deta hai
 */
        btnSO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AuthUI.getInstance().signOut(MainActivity.this);
                startActivityForResult(  //this brings the login wala sundar UI
                        AuthUI.getInstance()
                                .createSignInIntentBuilder()
                                .setAvailableProviders(Arrays.asList(
                                        new AuthUI.IdpConfig.GoogleBuilder().build(),
                                        new AuthUI.IdpConfig.EmailBuilder().build(),
                                        new AuthUI.IdpConfig.PhoneBuilder().build()))
                                .build(),
                        RC_SIGN_IN);
            }
        });




        if (mv_loginUser != null) {
            rvChatObject.setLayoutManager(new LinearLayoutManager(this)); //By default vertical
            merarVAdapterObject = new AdapterToBindData(listObject, this);

            rvChatObject.setAdapter(merarVAdapterObject);


            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));

            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));

            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));

            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
            listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));


        } else {
            startActivityForResult(
                    AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(Arrays.asList(
                                    new AuthUI.IdpConfig.GoogleBuilder().build(),
                                    new AuthUI.IdpConfig.EmailBuilder().build(),
                                    new AuthUI.IdpConfig.PhoneBuilder().build()))
                            .build(),
                    RC_SIGN_IN);
        }


    }


    /*
    IF THE USER FAILS TO LOGIN THEN THIS HAPPENS,
    PREVIOUSLY VO MAINACTIVITY PE HI CHALE JATA THA..
     */

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // RC_SIGN_IN is the request code you passed into startActivityForResult(...) when starting the sign in flow.
        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            // Successfully signed in
            if (resultCode == RESULT_OK) {

                rvChatObject.setLayoutManager(new LinearLayoutManager(this)); //By default vertical
                merarVAdapterObject = new AdapterToBindData(listObject, this);

                rvChatObject.setAdapter(merarVAdapterObject);

                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));

                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));

                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));

                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));
                listObject.add(new models("Sahil", "Kya baat hai launde.. Chha gya tuu toh.. Balle!!!"));


            } else {
                // Sign in failed
                if (response == null) {
                    // User pressed back button
                    return;
                }

                if (response.getError().getErrorCode() == ErrorCodes.NO_NETWORK) {
                    return;
                }
            }
        }
    }

    public static void fun1(){

    }


}
