package com.maineybnaya.randomrecyclercieew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.maineybnaya.randomrecyclercieew.adapterstobinddata.AdapterToBindData;
import com.maineybnaya.randomrecyclercieew.modelsorsaydataset.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int RC_SIGN_IN = 007;
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

        rvChatObject = findViewById(R.id.rvChatBox);

        listObject = new ArrayList<>();

        mv_loginUser = FirebaseAuth.getInstance().getCurrentUser(); //to get currentUser information
        rvChatObject.setLayoutManager(new LinearLayoutManager(this)); //By default vertical


        if (mv_loginUser != null) {
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

        merarVAdapterObject = new AdapterToBindData(listObject, this);

        rvChatObject.setAdapter(merarVAdapterObject);
    }
}
