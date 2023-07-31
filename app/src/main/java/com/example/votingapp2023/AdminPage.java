package com.example.votingapp2023;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AdminPage extends AppCompatActivity {
    private final String passcode= "abc@123";
    private DatabaseReference databaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        Button logout = findViewById(R.id.logout);
        Button button = findViewById(R.id.button);
        EditText password= findViewById(R.id.password);
        TextView b= findViewById(R.id.b);
        TextView c=findViewById(R.id.c);
        TextView a=findViewById(R.id.a);

        databaseRef = FirebaseDatabase.getInstance().getReference();
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Long[] bjpValue = new Long[1];
                final Long[] congressValue = new Long[1];
                final Long[] aapValue = new Long[1];
                if(password.getText().toString()==passcode){
                    databaseRef.child("BJP").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                bjpValue[0] = snapshot.getValue(Long.class);
                                // Do something with the value of BJP (bjpValue)
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            // Handle database read error if needed
                        }
                    });
                    databaseRef.child("Congress").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                congressValue[0] = snapshot.getValue(Long.class);
                                // Do something with the value of BJP (bjpValue)
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            // Handle database read error if needed
                        }
                    });
                    databaseRef.child("AAP").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                aapValue[0] = snapshot.getValue(Long.class);
                                // Do something with the value of BJP (bjpValue)
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            // Handle database read error if needed
                        }
                    });
                    b.setText("BJP:" + bjpValue[0]);
                    c.setText("Congress: "+ congressValue[0]);
                    a.setText("AAP: "+ aapValue[0]);

                }

            }
        });

    }
}