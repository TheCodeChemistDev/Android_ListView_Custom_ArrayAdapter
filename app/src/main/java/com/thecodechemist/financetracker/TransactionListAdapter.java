package com.thecodechemist.financetracker;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TransactionListAdapter extends ArrayAdapter<FinancialTransaction> {

    private ArrayList<FinancialTransaction> arrayList;
    Context context;

    private static class ViewHolder {
        TextView tvDate;
        TextView tvLocation;
        TextView tvIsOutgoing;
        TextView tvValue;
    }

    public TransactionListAdapter(Context context, ArrayList<FinancialTransaction> arrayList) {
        super(context, R.layout.transaction_list_item, arrayList);
        this.arrayList = arrayList;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Get the data item for this position
        FinancialTransaction financialTransaction = arrayList.get(position);

        //Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;

        final View result;

        if(convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.transaction_list_item, parent, false);
            viewHolder.tvDate = convertView.findViewById(R.id.tvDate);
            viewHolder.tvLocation = convertView.findViewById(R.id.tvLocation);
            viewHolder.tvIsOutgoing = convertView.findViewById(R.id.tvIsOutgoing);
            viewHolder.tvValue = convertView.findViewById(R.id.tvValue);

            result = convertView;
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        FinancialTransaction ft = arrayList.get(position);
        viewHolder.tvLocation.setText(ft.getLocation());
        viewHolder.tvDate.setText(ft.getDate());
        viewHolder.tvValue.setText(Double.toString(ft.getValue()));
        if(ft.isOutgoing()) {
            viewHolder.tvIsOutgoing.setText("Yes");
        } else {
            viewHolder.tvIsOutgoing.setText("No");
        }


        return convertView;
    }


}
