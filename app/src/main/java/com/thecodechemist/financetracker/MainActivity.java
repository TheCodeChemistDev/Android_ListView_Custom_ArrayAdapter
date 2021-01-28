package com.thecodechemist.financetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTransactions;
    ArrayList<String> transactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transactions = new ArrayList<>();
        transactions.add("Transaction 1");
        transactions.add("Transaction 2");
        transactions.add("Transaction 3");

        lvTransactions = findViewById(R.id.lvTransactions);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, transactions);
        lvTransactions.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}