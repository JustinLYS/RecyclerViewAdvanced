package com.example.recyclerviewadvanced;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

// TODO Link XML objects to Type
public class ProfileRecyclerViewHolder extends RecyclerView.ViewHolder {

    /*
    The purpose of ViewHolders is to prevent redundant calls to re-bind views that have already been bound,
    this optimizes the performance of the application.
     */

    private static final String TAG = ProfileRecyclerViewHolder.class.getSimpleName();
    public TextView tvName, tvNumber;

    public ProfileRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        Log.d(TAG, "ProfileRecyclerViewHolder: itemView Called");

        tvName = itemView.findViewById(R.id.profile_textView_name);
        tvNumber = itemView.findViewById(R.id.profile_textView_number);
    }

}
