package com.example.studente.morracinese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.nio.channels.InterruptedByTimeoutException;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private int k;
    private  RadioGroup radioGroup;
    private  RadioButton radio3;
    private  RadioButton radio5 ;
    private  RadioButton radioOltranza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final Intent i=new Intent(this,Gioco.class);
        final Button giocaO=findViewById(R.id.button3);
        giocaO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i=new Intent(MainActivity.this,Gioco.class);

                i.putExtra("partite",0);
                startActivity(i);
            }
        });


        final Button gioca3=findViewById(R.id.button33);
        gioca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i=new Intent(MainActivity.this,Gioco.class);

                i.putExtra("partite",3);
                startActivity(i);

            }
        });

        final Button gioca5=findViewById(R.id.button4);
        gioca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i=new Intent(MainActivity.this,Gioco.class);

                i.putExtra("partite",5);
                startActivity(i);
            }
        });

        final Intent in2=new Intent(this,Regole.class);
        final Button regole=findViewById(R.id.button2);
        regole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(in2);
                in2.putExtra("ese",1);

            }
        });


    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }



    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {  //per salvare la variabile

        super.onSaveInstanceState(outState);
    }


}
