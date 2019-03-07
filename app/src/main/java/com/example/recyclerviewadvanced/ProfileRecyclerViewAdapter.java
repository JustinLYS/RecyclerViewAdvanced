package com.example.recyclerviewadvanced;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ProfileRecyclerViewAdapter extends RecyclerView.Adapter<ProfileRecyclerViewHolder> {

    public static final String TAG = ProfileRecyclerViewAdapter.class.getSimpleName();
    // TODO Set Data Type
    private List<Profile> profileList;
    public ProfileRecyclerViewAdapter(List<Profile> profileList) {
        this.profileList = profileList;
    }

    @NonNull
    @Override
    public ProfileRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // TODO Link Layout XML of item
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profile_card, viewGroup, false);
        return new ProfileRecyclerViewHolder(layoutView);

    }

    @Override
    public void onBindViewHolder(@NonNull ProfileRecyclerViewHolder profileRecyclerViewHolder, int position) {
        if (profileList != null && position < profileList.size()) {
            Profile profile = profileList.get(position);
            // TODO Set display items data
            profileRecyclerViewHolder.tvName.setText(profile.getName());
            profileRecyclerViewHolder.tvNumber.setText(profile.getNumber());
        }
    }

    @Override
    public int getItemCount() {
        if (profileList != null) {
            return profileList.size();
        } else {
            return 0;
        }
    }
}
