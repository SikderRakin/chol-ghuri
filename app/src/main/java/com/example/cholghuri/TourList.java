package com.example.cholghuri;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class TourList extends AppCompatActivity {

    private RecyclerView tourRecycler;
    private FirebaseDatabase firebaseDatabase;
    private List<Tour> tourList;
    private TourAdapter tourAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_list);

        initialize();
        //initRecyclerView();
        //getDataFromDB();
    }


    private void initialize() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        tourRecycler = findViewById(R.id.tourRecycler);

        tourList = new ArrayList<>();
    }
/*

    private void initRecyclerView() {
        tourRecycler.setLayoutManager(new LinearLayoutManager(this));
        tourAdapter = new TourAdapter(tourList);
        tourRecycler.setAdapter(tourAdapter);
    }
*/

    public void addTour(View view) {

        Intent intent = new Intent(this, AddTour.class);
        startActivity(intent);
    }

 /*   private void getDataFromDB() {

        DatabaseReference tourDB = firebaseDatabase.getReference().child("Tour");

        tourDB.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                if (dataSnapshot.exists()) {
                    tourList.clear();
                    for (DataSnapshot data : dataSnapshot.getChildren()) {
                        Tour tour = data.getValue(Tour.class);
                        tourList.add(tour);
                       // tourAdapter.notifyDataSetChanged();

                    }

                } else {
                    Toast.makeText(Trips.this, "Empty database", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
*/
}
