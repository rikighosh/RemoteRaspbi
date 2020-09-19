package com.example.remoteraspbi;

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
import android.graphics.Color;
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
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;


public class Data_Activity extends AppCompatActivity {

    // Add button Move to Activity
    private static final String TAG = "Data_Activity";
    private LineChart mChart;
    private LineChart mchart2;
    private LineChart mchart3;
    private LineChart mchart4;

    ArrayList<ILineDataSet> dataSets = new ArrayList<>();
    ArrayList<Entry> yvalues = new ArrayList<>();

    ArrayList<ILineDataSet> dataSets2 = new ArrayList<>();
    ArrayList<Entry> yvalues2 = new ArrayList<>();

    ArrayList<ILineDataSet> dataSets3 = new ArrayList<>();
    ArrayList<Entry> yvalues3 = new ArrayList<>();

    ArrayList<ILineDataSet> dataSets4 = new ArrayList<>();
    ArrayList<Entry> yvalues4 = new ArrayList<>();

    FirebaseDatabase database;
    DatabaseReference ref;
    long thmin,thmax;
    User user;
    long s1,s2,s3,s4,s5,s6,s7,s8;
    long t=0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_first);
        Toast.makeText(Data_Activity.this,"Plotting...",Toast.LENGTH_LONG).show();



        user=new User();
        //final TextView textView= (TextView)findViewById(R.id.text) ;


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


                thmin=9000000;
                thmax=9999999;




                setContentView(R.layout.data_first);
                mChart = (LineChart) findViewById(R.id.linechart1);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mChart.setDragEnabled(true);
                mChart.setScaleEnabled(false);
                mChart.getLegend().setEnabled(false);
                mChart.getDescription().setText("Sensor 1");

                // enable touch gestures
                mChart.setTouchEnabled(true);
                // enable scaling and dragging
                mChart.setDragEnabled(true);
                mChart.setScaleEnabled(true);
                // if disabled, scaling can be done on x- and y-axis separately
                mChart.setPinchZoom(true);

                mchart2 = (LineChart) findViewById(R.id.linechart2);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mchart2.setDragEnabled(true);
                mchart2.setScaleEnabled(false);
                mchart2.getLegend().setEnabled(false);
                mchart2.getDescription().setText("Sensor 2");


                mchart3 = (LineChart) findViewById(R.id.linechart3);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mchart3.setDragEnabled(true);
                mchart3.setScaleEnabled(false);
                mchart3.getLegend().setEnabled(false);
                mchart3.getDescription().setText("Sensor 3");

                mchart4 = (LineChart) findViewById(R.id.linechart4);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                //mChart.setOnChartGestureListener(Graph_Activity.this);
                mchart4.setDragEnabled(true);
                mchart4.setScaleEnabled(false);
                mchart4.getLegend().setEnabled(false);
                mchart4.getDescription().setText("Sensor 4");
                yvalues.add(new Entry(t, s1));
                LineDataSet set1 = new LineDataSet(yvalues, "");
                if(s1>thmin && s1<thmax)
                    set1.setColor(Color.rgb(0,255,0));
                else
                    set1.setColor(Color.rgb(255,0,0));
                set1.setFillAlpha(110);
                set1.setDrawCircles(false);
                dataSets.add(set1);
                LineData data = new LineData(dataSets);
                mChart.setData(data);

                yvalues2.add(new Entry(t, s2));
                LineDataSet set2 = new LineDataSet(yvalues2, "");
                if(s2>thmin && s2<thmax)
                    set2.setColor(Color.rgb(0,255,0));
                else
                    set2.setColor(Color.rgb(255,0,0));
                set2.setFillAlpha(110);
                set2.setDrawCircles(false);
                dataSets2.add(set2);
                LineData data2 = new LineData(dataSets2);
                mchart2.setData(data2);

                yvalues3.add(new Entry(t, s3));
                LineDataSet set3 = new LineDataSet(yvalues3, "");
                if(s3>thmin && s3<thmax)
                    set3.setColor(Color.rgb(0,255,0));
                else
                    set3.setColor(Color.rgb(255,0,0));
                set3.setFillAlpha(110);
                set3.setDrawCircles(false);
                dataSets3.add(set3);
                LineData data3 = new LineData(dataSets3);
                mchart3.setData(data3);

                yvalues4.add(new Entry(t, s4));
                LineDataSet set4 = new LineDataSet(yvalues4, "");
                if(s4>thmin && s4<thmax)
                    set4.setColor(Color.rgb(0,255,0));
                else
                    set4.setColor(Color.rgb(255,0,0));
                set4.setFillAlpha(110);
                set4.setDrawCircles(false);
                dataSets4.add(set4);
                LineData data4 = new LineData(dataSets4);
                mchart4.setData(data4);



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
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit? Existing plots will be lost.");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }

}

