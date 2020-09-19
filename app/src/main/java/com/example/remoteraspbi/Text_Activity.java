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
import android.graphics.Color;

public class Text_Activity extends AppCompatActivity {

    // Add button Move to Activity
    //private static final String TAG = "Data_Activity";
    //private LineChart mChart;









    FirebaseDatabase database;
    DatabaseReference ref;

    User user;
    long s1,s2,s3,s4,s5,s6,s7,s8,dx1,dx2,dx3,dx4,cx;
    float temp, hum;
    long t=0;
    long thmin,thmax;
    TextView se1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,tem,humi,d1,d2,d3,d4;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_first);
        Toast.makeText(Text_Activity.this,"Sensor Value Updating",Toast.LENGTH_LONG).show();
        se1=findViewById(R.id.x1);
        sen2=findViewById(R.id.x2);
        sen3=findViewById(R.id.x3);
        sen4=findViewById(R.id.x4);
        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        /*sen5=findViewById(R.id.x5);
        sen6=findViewById(R.id.x6);
        sen7=findViewById(R.id.x7);
        sen8=findViewById(R.id.x8);
        */
        tem=findViewById(R.id.temp_id);
        humi=findViewById(R.id.hum_id);










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
                t=u.getTime();
                /*
                s5 = u.getSensor5();
                s6 = u.getSensor6();
                s7 = u.getSensor7();
                s8 = u.getSensor8();

                 */
                temp=u.getTemp();
                hum=u.getHum();

                dx1=u.getDev1();
                dx2=u.getDev2();
                dx3=u.getDev3();
                dx4=u.getDev4();
                cx=u.getCount();


                String string21 = Long.toString(s1);
                se1.setText(string21);
                String string22 = Long.toString(s2);
                sen2.setText(string22);
                String string23 = Long.toString(s3);
                sen3.setText(string23);
                String string24 = Long.toString(s4);
                sen4.setText(string24);
                /*String string25 = Long.toString(s5);
                sen5.setText("Sensor 5 => "+string25);
                String string26 = Long.toString(s6);
                sen6.setText("Sensor 6 => "+string26);
                String string27 = Long.toString(s7);
                sen7.setText("Sensor 7 => "+string27);
                String string28 = Long.toString(s8);
                sen8.setText("Sensor 8 => "+string28);
                */
                String Temp = Float.toString(temp);
                tem.setText("Temperature: "+Temp+"°C");
                String Hum = Float.toString(hum);
                humi.setText("Relative Humidity: "+Hum+"%");

                thmin=9000000;
                thmax=9999999;

                if(s1>thmin && s1<thmax)
                    se1.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    se1.setBackgroundColor(Color.rgb(222, 129, 129));
                if(s2>thmin && s2<thmax)
                    sen2.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    sen2.setBackgroundColor(Color.rgb(222, 129, 129));
                if(s3>thmin && s3<thmax)
                    sen3.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    sen3.setBackgroundColor(Color.rgb(222, 129, 129));
                if(s4>thmin && s4<thmax)
                    sen4.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    sen4.setBackgroundColor(Color.rgb(222, 129, 129));















            }


            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                User u = dataSnapshot.getValue(User.class);
                dataSnapshot.getKey();


                s1 = u.getSensor1();
                s2 = u.getSensor2();
                s3 = u.getSensor3();
                s4 = u.getSensor4();
                /*s5 = u.getSensor5();
                s6 = u.getSensor6();
                s7 = u.getSensor7();
                s8 = u.getSensor8();

                 */
                t=u.getTime();
                temp=u.getTemp();
                hum=u.getHum();

                dx1=u.getDev1();
                dx2=u.getDev2();
                dx3=u.getDev3();
                dx4=u.getDev4();
                cx=u.getCount();

                //System.out.println(u.getSensor1());
                thmin=9000000;
                thmax=9999999;

                if(s1>thmin && s1<thmax)
                    se1.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    se1.setBackgroundColor(Color.rgb(222, 129, 129));
                if(s2>thmin && s2<thmax)
                    sen2.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    sen2.setBackgroundColor(Color.rgb(222, 129, 129));
                if(s3>thmin && s3<thmax)
                    sen3.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    sen3.setBackgroundColor(Color.rgb(222, 129, 129));
                if(s4>thmin && s4<thmax)
                    sen4.setBackgroundColor(Color.rgb(144, 224, 121));
                else
                    sen4.setBackgroundColor(Color.rgb(222, 129, 129));




                String string11 = Long.toString(s1);
                se1.setText(string11);
                String string12 = Long.toString(s2);
                sen2.setText(string12);
                String string13 = Long.toString(s3);
                sen3.setText(string13);
                String string14 = Long.toString(s4);
                sen4.setText(string14);
                /*String string15 = Long.toString(s5);
                sen5.setText("Sensor 5 => "+string15);
                String string16 = Long.toString(s6);
                sen6.setText("Sensor 6 => "+string16);
                String string17 = Long.toString(s7);
                sen7.setText("Sensor 7 => "+string17);
                String string18 = Long.toString(s8);
                sen8.setText("Sensor 8 => "+string18);

                 */
                String Temp = Float.toString(temp);
                tem.setText("Temperature: "+Temp+"°C");
                String Hum = Float.toString(hum);
                humi.setText("Relative Humidity: "+Hum+"%");

                String deviation1=Long.toString(dx1);
                String deviation2=Long.toString(dx2);
                String deviation3=Long.toString(dx3);
                String deviation4=Long.toString(dx4);

                if(cx==1)
                {
                    d1.setText(deviation1);
                    d2.setText(deviation2);
                    d3.setText(deviation3);
                    d4.setText(deviation4);
                }






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

