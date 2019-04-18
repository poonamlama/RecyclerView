package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recycleview);

        List<Contacts> contactsList = new ArrayList<>();

        contactsList.add(new Contacts("Saugat Malla", "902345685",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","980234564",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang Rai","9821346652",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC","98456726225",R.drawable.bhuwan));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }}

