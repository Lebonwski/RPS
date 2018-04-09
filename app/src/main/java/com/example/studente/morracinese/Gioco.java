package com.example.studente.morracinese;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;

public class Gioco extends AppCompatActivity {
    private int vr,punti=0,punticpu=0,f=0,count=0,partite=0;
    private TextView cpu,tu;
    private  ImageView v1;
    private  ImageView v2;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getIntent().getExtras();
        setContentView(R.layout.activity_gioco);
        ImageButton sasso = (ImageButton) findViewById(R.id.s);
        ImageButton carta = (ImageButton) findViewById(R.id.c);
        ImageButton forbice = (ImageButton) findViewById(R.id.f);
        cpu=(TextView) findViewById(R.id.puntiC);
        tu=(TextView) findViewById(R.id.puntiT);
        partite=bundle.getInt("partite");
        if(partite==0){
            partite=-1;
        }
       do{
            final Random random = new Random();
            v1 = findViewById(R.id.imageView);
            v2 = findViewById(R.id.imageView2);
            f++;
            sasso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v1.setImageResource(R.drawable.s);

                    switch (vr = random.nextInt(3)) {
                        case 0:
                            v2.setImageResource(R.drawable.s);
                            Toast.makeText(Gioco.this, "Pareggio", LENGTH_SHORT).show();
                            break;
                        case 1:
                            v2.setImageResource(R.drawable.c);
                            Toast.makeText(Gioco.this, "Hai perso", LENGTH_SHORT).show();
                            punticpu++;
                            cpu.setText(""+punticpu);
                            break;
                        case 2:
                            v2.setImageResource(R.drawable.f);
                            Toast.makeText(Gioco.this, "Hai vinto", LENGTH_SHORT).show();
                            punti++;
                            tu.setText(""+punti);
                            break;
                    }
                }
            });
            carta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v1.setImageResource(R.drawable.c);
                    switch (vr = random.nextInt(3)) {
                        case 0:
                            v2.setImageResource(R.drawable.s);

                            Toast.makeText(Gioco.this, "Hai vinto", LENGTH_SHORT).show();
                            punti++;
                            tu.setText(""+punti);
                            break;
                        case 1:
                            v2.setImageResource(R.drawable.c);

                            Toast.makeText(Gioco.this, "Pareggio", LENGTH_SHORT).show();
                            break;
                        case 2:
                            v2.setImageResource(R.drawable.f);
                            Toast.makeText(Gioco.this, "Hai perso", LENGTH_SHORT).show();
                            punticpu++;
                            cpu.setText(""+punticpu);
                            break;
                    }


                }
            });
            forbice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v1.setImageResource(R.drawable.f);
                    switch (vr = random.nextInt(3)) {
                        case 0:
                            v2.setImageResource(R.drawable.s);
                            Toast.makeText(Gioco.this, "Hai perso", LENGTH_SHORT).show();
                            punticpu++;
                            cpu.setText(""+punticpu);
                            f=f+punticpu;
                            break;
                        case 1:
                            v2.setImageResource(R.drawable.c);
                            Toast.makeText(Gioco.this, "Hai vinto", LENGTH_SHORT).show();
                            punti++;
                            tu.setText(""+punti);
                            break;
                        case 2:
                            v2.setImageResource(R.drawable.f);
                            Toast.makeText(Gioco.this, "Pareggio", LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        count++;
        }
       while(count<partite || f==5 || f==3);
        /*if((count==3 && partite==3) ||(count==5 && partite==5)){
            Intent i=new Intent(Gioco.this,Risultato.class);
            if(punti>punticpu){
                i.putExtra("r",1);
            }
            else{
                i.putExtra("r",0);
            }
            startActivity(i);
        }*/
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {  //per salvare la variabile
        //outState.putInt("partite",k);
        super.onSaveInstanceState(outState);
    }

}







