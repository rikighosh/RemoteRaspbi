/*package com.example.remoteraspbi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.lang.reflect.Array;
import java.util.ArrayList;


import java.lang.reflect.Array;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Data_Activity2 extends AppCompatActivity {

    // Add button Move to Activity
    private static final String TAG = "Data_Activity2";
    private LineChart mChart5;
    private LineChart mchart6;
    private LineChart mchart7;
    private LineChart mchart8;

    ArrayList<ILineDataSet> dataSets5 = new ArrayList<>();
    ArrayList<Entry> yvalues5 = new ArrayList<>();

    ArrayList<ILineDataSet> dataSets6 = new ArrayList<>();
    ArrayList<Entry> yvalues6 = new ArrayList<>();

    ArrayList<ILineDataSet> dataSets7 = new ArrayList<>();
    ArrayList<Entry> yvalues7 = new ArrayList<>();

    ArrayList<ILineDataSet> dataSets8 = new ArrayList<>();
    ArrayList<Entry> yvalues8 = new ArrayList<>();


    FirebaseDatabase database;
    DatabaseReference ref;

    User user;
    long s1,s2,s3,s4,s5,s6,s7,s8;
    long t=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_second);
        Toast.makeText(Data_Activity2.this,"Plotting...",Toast.LENGTH_LONG).show();

        user=new User();


        database = FirebaseDatabase.getInstance();
        ref = database.getReference();



        ref.child("db1").addChildEventListener(new ChildEventListener() {

            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                User u = dataSnapshot.getValue(User.class);
                dataSnapshot.getKey();




                s1 = u.getSensor1();

                s2 = u.getSensor2();
                s3 = u.getSensor3();
                s4 = u.getSensor4();
                s5 = u.getSensor5();
                s6 = u.getSensor6();
                s7 = u.getSensor7();
                s8 = u.getSensor8();







            }


            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                User u = dataSnapshot.getValue(User.class);
                dataSnapshot.getKey();

                s1 = u.getSensor1();
                s2 = u.getSensor2();
                s3 = u.getSensor3();
                s4 = u.getSensor4();
                s5 = u.getSensor5();
                s6 = u.getSensor6();
                s7 = u.getSensor7();
                s8 = u.getSensor8();
                t=u.getTime();



                setContentView(R.layout.data_second);
                mChart5 = (LineChart) findViewById(R.id.linechart5);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mChart5.setDragEnabled(true);
                mChart5.setScaleEnabled(false);

                mchart6 = (LineChart) findViewById(R.id.linechart6);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mchart6.setDragEnabled(true);
                mchart6.setScaleEnabled(false);

                mchart7 = (LineChart) findViewById(R.id.linechart7);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mchart7.setDragEnabled(true);
                mchart7.setScaleEnabled(false);

                mchart8 = (LineChart) findViewById(R.id.linechart8);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mchart8.setDragEnabled(true);
                mchart8.setScaleEnabled(false);

                yvalues5.add(new Entry(t, s5));
                LineDataSet set5 = new LineDataSet(yvalues5, "");
                set5.setFillAlpha(110);
                set5.setDrawCircles(false);
                dataSets5.add(set5);
                LineData data5 = new LineData(dataSets5);
                mChart5.setData(data5);

                yvalues6.add(new Entry(t, s6));
                LineDataSet set6 = new LineDataSet(yvalues6, "");
                set6.setFillAlpha(110);
                set6.setDrawCircles(false);
                dataSets6.add(set6);
                LineData data6 = new LineData(dataSets6);
                mchart6.setData(data6);

                yvalues7.add(new Entry(t, s7));
                LineDataSet set7 = new LineDataSet(yvalues7, "");
                set7.setFillAlpha(110);
                set7.setDrawCircles(false);
                dataSets7.add(set7);
                LineData data7 = new LineData(dataSets7);
                mchart7.setData(data7);

                yvalues8.add(new Entry(t, s8));
                LineDataSet set8 = new LineDataSet(yvalues8, "");
                set8.setFillAlpha(110);
                set8.setDrawCircles(false);
                dataSets8.add(set8);
                LineData data8 = new LineData(dataSets8);
                mchart8.setData(data8);



            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        // Add_button add clicklistener







    }

}

*/