package com.hhoretzky.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void convertUSD (View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountinETH = editText.getText().toString();
        double ETH = Double.parseDouble(amountinETH);
        double USD = ETH*108.27;
        String amountInUSD = String.format("%.2f", USD);
        Toast.makeText(this, amountinETH + " ETH " + "is $" + amountInUSD, Toast.LENGTH_SHORT).show();
    }
    public void convertEURO (View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountinETH = editText.getText().toString();
        double ETH = Double.parseDouble(amountinETH);
        double EURO = ETH*93.77;
        String amountInEURO = String.format("%.2f", EURO);
        Toast.makeText(this, amountinETH + " ETH " + "is €" + amountInEURO, Toast.LENGTH_SHORT).show();

    }
    public void convertHRK (View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountinETH = editText.getText().toString();
        double ETH = Double.parseDouble(amountinETH);
        double HRK = ETH*706.46;
        String amountInHRK = String.format("%.2f", HRK);
        Toast.makeText(this, amountinETH + " ETH " + "is " + amountInHRK + "HRK", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
