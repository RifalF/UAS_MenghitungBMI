package com.example.uas_mengitungbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edBB, edTB, edBMI, edKet;
    Button btnHitung;
    Double vBB, vTB, vBMI;
    String vKet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edBB = (EditText)findViewById(R.id.edBB);
        edTB = (EditText)findViewById(R.id.edTB);
        edBMI = (EditText)findViewById(R.id.edBMI);
        edKet = (EditText)findViewById(R.id.edKet);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }

    public void Hitung(View view) {
        vBB = Double.parseDouble(edBB.getText().toString());
        vTB = Double.parseDouble(edTB.getText().toString());

        vBMI = vBB /((vTB/100)*(vTB/100));

        if (vBMI < 18.5){
            vKet = "Underweight";
        }
        else if (vBMI >= 18.5 && vBMI <22.9){
            vKet = "Normal";
        }
        else if (vBMI >= 23 && vBMI <24.9){
            vKet = "Risk to Overweight ";
        }
        else if (vBMI >= 25 && vBMI <30){
            vKet = "Overweight";
        }
        else {
            vKet = "Obese";
        }
        edBMI.setText(""+vBMI);
        edKet.setText(""+vKet);
    }
}