package com.example.recyclerviewadvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNumber;
    private ProfileRecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    // TODO Set Data Type
    private List<Profile> profileList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Set Data
        // Set data into an arrayList
        profileList = new ArrayList<>();
        Profile profile = new Profile("User 1", "---");
        Profile profile1 = new Profile("User 2", "---");
        profileList.add(profile);
        profileList.add(profile1);

        // Link RecyclerView & data
        recyclerViewNumber = findViewById(R.id.mainRecyclerViewNumber);
        ProfileRecyclerViewAdapter adapter = new ProfileRecyclerViewAdapter(
                profileList);

        // NOTE: (Optional) setFixedSize
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerViewNumber.setHasFixedSize(true);

        // Use a Layout Manager
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerViewNumber.setLayoutManager(recyclerLayoutManager);

        // Specify an adapter
        recyclerViewNumber.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
