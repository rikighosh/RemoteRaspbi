package com.example.remoteraspbi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Command_Activity extends AppCompatActivity {

    // Add button Move to Activity


    Button Start;
    Button Stop;
    Button Refresh;
    Button Exit;
    EditText file_name;

    DatabaseReference reff;
    DatabaseReference reff1;
    TextView x;
    Status_class stat;
    file_name name;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.command_first);
        x=(TextView)findViewById(R.id.Status);
        Start = (Button)findViewById(R.id.start_button);
        Stop = (Button)findViewById(R.id.stop_button);
        Refresh = (Button)findViewById(R.id.refresh_button);
        Exit = (Button)findViewById(R.id.exit_button);
        file_name=findViewById(R.id.namefile);
        reff= FirebaseDatabase.getInstance().getReference().child("Status");
        stat=new Status_class();
        reff1= FirebaseDatabase.getInstance().getReference().child("FileName");
        name=new file_name();
        // Add_button add clicklistener


        Start.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v)
            {
                String name1=file_name.getText().toString();
                stat.setStat("0");
                reff.setValue(stat);
                name.setName(name1);
                reff1.setValue(name);

                x.setText("Started");

                Intent intent = new Intent(Command_Activity.this, Data_Activity.class);

                // start the activity connect to the specified class
                startActivity(intent);
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:



            }
        });

        Stop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                stat.setStat("1");
                reff.setValue(stat);
                x.setText("Stopped");
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:


            }
        });

        Refresh.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v)
            {

                stat.setStat("2");
                reff.setValue(stat);
                x.setText("Refreshed");
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:


            }
        });

        Exit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                stat.setStat("3");
                reff.setValue(stat);
                x.setText("Exit GUI");
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

            }
        });



    }
}
