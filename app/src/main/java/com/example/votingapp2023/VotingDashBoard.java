package com.example.votingapp2023;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class VotingDashBoard extends AppCompatActivity {
    private DatabaseReference databaseRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting_dash_board);
        databaseRef = FirebaseDatabase.getInstance().getReference();
        Button aap =findViewById(R.id.aap);
        Button bjp =findViewById(R.id.bjp);
        Button congress=findViewById(R.id.congress);
        aap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve the current value of "BJP" from the database
                databaseRef.child("AAP").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            Long currentValue = snapshot.getValue(Long.class);
                            // Increase the value by 1
                            Long newValue = currentValue + 1;
                            // Update the value in the database
                            databaseRef.child("AAP").setValue(newValue);
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Toast.makeText(getApplicationContext(),"Invalid Vote",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        bjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve the current value of "BJP" from the database
                databaseRef.child("BJP").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            Long currentValue = snapshot.getValue(Long.class);
                            // Increase the value by 1
                            Long newValue = currentValue + 1;
                            // Update the value in the database
                            databaseRef.child("BJP").setValue(newValue);
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Toast.makeText(getApplicationContext(),"Invalid Vote",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        bjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve the current value of "BJP" from the database
                databaseRef.child("Congress").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            Long currentValue = snapshot.getValue(Long.class);
                            // Increase the value by 1
                            Long newValue = currentValue + 1;
                            // Update the value in the database
                            databaseRef.child("Congress").setValue(newValue);
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Toast.makeText(getApplicationContext(),"Invalid Vote",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}