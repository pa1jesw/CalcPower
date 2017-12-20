package com.pa1.calcpower;

import android.support.v4.math.MathUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAnswer;
    EditText etpower,etNumber;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAnswer=findViewById(R.id.tvAnswer);
        etNumber=findViewById(R.id.etNumber);
        etpower=findViewById(R.id.etPercent);
        btnCal=findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(!(etNumber.getText()==null)&&(etpercent.getText()==null)) {
                int num = Integer.parseInt(String.valueOf(etNumber.getText()));
                int power = Integer.parseInt(String.valueOf(etpower.getText()));
                int answer = (int) Math.pow(power,num);
                tvAnswer.setText(" "+answer);
                //}
            }
        });


    }
}
