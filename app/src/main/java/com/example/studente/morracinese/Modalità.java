package com.example.studente.morracinese;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Modalità extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modalita);
        final RadioButton radio3 = findViewById(R.id.radio3);
        final RadioButton radio5 = findViewById(R.id.radio5);
        final RadioButton radioOltranza = findViewById(R.id.radioOltranza);
        final Intent in = new Intent(this, Gioco.class);
        final Button gioca = findViewById(R.id.button1G);
        gioca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio3.isSelected() == true) {
                    startActivity(in);
                    in.putExtra("partite", 3);
                } else {
                    if (radio5.isSelected() == true) {
                        startActivity(in);
                        in.putExtra("partite", 5);
                    } else {
                        if (radioOltranza.isSelected() == true) {
                            startActivity(in);
                            in.putExtra("partite", 0);
                        } else {
                            Toast.makeText(Modalità.this, "Devi selezionare quante partite vuoi fare", LENGTH_SHORT).show();
                        }
                    }
                }

            }
        });

        final Intent in2 = new Intent(this, Multigiocatore.class);
        final Button multi = findViewById(R.id.button2G);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(in2);
                if (radio3.isSelected() == true) {
                    startActivity(in);
                    in.putExtra("partite", 3);
                } else {
                    if (radio5.isSelected() == true) {
                        startActivity(in);
                        in.putExtra("partite", 5);
                    } else {
                        if (radioOltranza.isSelected() == true) {
                            startActivity(in);
                            in.putExtra("partite", 0);
                        } else {
                            Toast.makeText(Modalità.this, "Devi selezionare quante partite vuoi fare", LENGTH_SHORT).show();
                        }
                    }
                }


            }
        });
    }
}

