package com.example.studente.morracinese;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Risultato  extends AppCompatActivity {
    private  TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risultato);
        r=(TextView) findViewById(R.id.ris);
        int ri=getIntent().getExtras().getInt("r");
            if(ri==1){
                r.setText("Hai vinto!!");
            }
            else{
                r.setText("Hai perso...");
            }
        final Button menu=findViewById(R.id.button4);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i=new Intent(Risultato.this,MainActivity.class);
                startActivity(i);
            }
        });


    }

}

