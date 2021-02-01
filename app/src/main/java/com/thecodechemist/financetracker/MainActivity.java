package com.thecodechemist.financetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTransactions;
    ArrayList<FinancialTransaction> transactions;
    private TransactionListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transactions = new ArrayList<>();
        transactions.add(new FinancialTransaction("01/01/2021", "Amazon", true, 7.99));
        transactions.add(new FinancialTransaction("05/01/2021", "Ebay", true, 24.99));
        transactions.add(new FinancialTransaction("25/01/2021", "Salary", false, 1650));

        lvTransactions = findViewById(R.id.lvTransactions);
        adapter = new TransactionListAdapter(MainActivity.this, transactions);
        lvTransactions.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}