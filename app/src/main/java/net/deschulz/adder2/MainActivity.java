package net.deschulz.adder2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user clicks the Send button
     */
    public void sendMessage(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        EditText total = (EditText) findViewById(R.id.total);

        String msg1 = number1.getText().toString();
        String msg2 = number2.getText().toString();
        Double d1 = Double.valueOf(msg1).doubleValue();
        Double d2 = Double.valueOf(number2.getText().toString()).doubleValue();
        Double tot = d1 + d2;

        total.setText(Double.toString(tot));
    }

    public void clearScreen(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        EditText total = (EditText) findViewById(R.id.total);
        number1.setText("");
        number2.setText("");
        total.setText("");
        number1.requestFocus();
    }
}
