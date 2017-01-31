package com.gypsysofts.rider.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button Btn_calc;
    public EditText num1,num2,result;
    double n1=0,n2=0,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn_calc = (Button) findViewById(R.id.Btn_calc);
        result =(EditText) findViewById(R.id.result);
        num1 = (EditText) findViewById(R.id.n_1);
        num2 = (EditText) findViewById(R.id.n_2);



//        int n1 = Integer.parseInt(num1.getText().toString());
//        int n2 = Integer.parseInt(num2.getText().toString());

//        final int s =1;
//        s=n1+n2;
        Btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
//                final int s;
                s=n1+n2;
        result.setText(Double.toString(s));
            }
        });



    }

}
