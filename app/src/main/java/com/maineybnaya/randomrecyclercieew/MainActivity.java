package com.maineybnaya.randomrecyclercieew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.maineybnaya.randomrecyclercieew.adapterstobinddata.AdapterToBindData;
import com.maineybnaya.randomrecyclercieew.modelsorsaydataset.models;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvChatObject;
    AdapterToBindData merarVAdapterObject;
    List<models> listObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvChatObject = findViewById(R.id.rvChatBox);

        listObject = new ArrayList<>();

        rvChatObject.setLayoutManager(new LinearLayoutManager(this)); //By default vertical

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























        merarVAdapterObject = new AdapterToBindData(listObject,this);

        rvChatObject.setAdapter(merarVAdapterObject);
    }
}
