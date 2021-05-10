package com.example.exerci18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
         TextView tx1, txt_resultado;
         EditText n_txt1;
         Button verificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1=findViewById(R.id.txt1);
        txt_resultado=findViewById(R.id.txt2);
        n_txt1=findViewById(R.id.edt1);
        verificar=findViewById(R.id.button);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number= Integer.parseInt(n_txt1.getText().toString()) ;
                txt_resultado.setText( String.valueOf(n_txt1));

                for (int i=2 ; i<number; i++){
                   if( number%i==0){

                       txt_resultado.setText("não é primo");

                       return;
                       
                   }else {

                       txt_resultado.setText("é primo");
                   }

                }
            }
        });

    }
}