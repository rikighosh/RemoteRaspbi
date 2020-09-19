package com.example.remoteraspbi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Add button Move to Activity

    Button next_Activity_button;
    Button next_Activity_button1;
    Button next_Activity_button3;
    Button next_Activity_button2;
    Button next_Activity_button30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Connected",Toast.LENGTH_LONG).show();
        next_Activity_button = (Button)findViewById(R.id.command_button);
        next_Activity_button1=(Button)findViewById(R.id.data1_button);
        next_Activity_button2=(Button)findViewById(R.id.text);
        next_Activity_button3=(Button)findViewById(R.id.pca_button);
        // next_Activity_button30=(Button)findViewById(R.id.data2_button);

        next_Activity_button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Text_Activity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        next_Activity_button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, pca_plot.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });


        // Add_button add clicklistener
        next_Activity_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Command_Activity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        next_Activity_button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Data_Activity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        /*next_Activity_button30.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Data_Activity2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });*/
    }
}
