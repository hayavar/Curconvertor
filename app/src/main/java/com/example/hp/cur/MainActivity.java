package com.example.hp.cur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


public void convert(View view){
    EditText dollarfied=(EditText)findViewById(R.id.dollarfield);
    double dollaramount=Double.parseDouble(dollarfied.getText().toString());

    double inramount=dollaramount*69.36;

    EditText t1=(EditText)findViewById(R.id.txtscreen);
    Toast.makeText(MainActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
    t1.append(String.valueOf(inramount));


}
public  void reset(View view){
    EditText dollar=(EditText)findViewById(R.id.dollarfield);
    dollar.setText(" ");
    EditText txt=(EditText) findViewById(R.id.txtscreen);
    txt.setText("INR ");
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    }

