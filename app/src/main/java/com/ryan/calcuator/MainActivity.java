package com.ryan.calcuator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing all buttons, switches, ad text boxes
        final EditText number1;
        number1 = findViewById(R.id.number1);
        final EditText number2;
        number2 = findViewById(R.id.number2);

        final EditText sign;
        sign = findViewById(R.id.sign);

        final TextView result;
        result = findViewById(R.id.result);

        final Button equals;
        equals = findViewById(R.id.equals);

<<<<<<< HEAD
=======
        final int[] counter = {0};
        TextView numCalView = findViewById(R.id.counterNumber);


>>>>>>> e5df318 (This is the first commit)
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number1.getText().toString().equals("") && !number2.getText().toString().equals("")) {
                    if (!sign.getText().toString().equals("+") || !sign.getText().toString().equals("-") || !sign.getText().toString().equals("*") || !sign.getText().toString().equals("/")) {
                        int Int1 = Integer.parseInt(number1.getText().toString());
                        int Int2 = Integer.parseInt(number2.getText().toString());
                        if (sign.getText().toString().equals("+")) {
                            int sum = Int1 + Int2;
                            result.setText(Integer.toString(sum));
<<<<<<< HEAD
=======
                            numCalView.setText(Integer.toString(counter[0] += 1));

>>>>>>> e5df318 (This is the first commit)
                        }
                        if (sign.getText().toString().equals("-")) {
                            int sum = Int1 - Int2;
                            result.setText(Integer.toString(sum));
<<<<<<< HEAD
=======
                            numCalView.setText(Integer.toString(counter[0] += 1));


>>>>>>> e5df318 (This is the first commit)
                        }
                        if (sign.getText().toString().equals("*")) {
                            int sum = Int1 * Int2;
                            result.setText(Integer.toString(sum));
<<<<<<< HEAD
=======
                            numCalView.setText(Integer.toString(counter[0] += 1));

>>>>>>> e5df318 (This is the first commit)
                        }
                        if (sign.getText().toString().equals("/")) {
                            int sum = Int1 / Int2;
                            result.setText(Integer.toString(sum));
<<<<<<< HEAD
=======
                            numCalView.setText(Integer.toString(counter[0] += 1));

>>>>>>> e5df318 (This is the first commit)
                        }
                    } else {
                        System.out.println("Error, enter an addition, subtraction, multiplication, or division sign");
                    }
                } else {
                    System.out.println("Error, Text field is empty ");
                }
            }
        });
        final CheckBox myCheckbox = findViewById(R.id.checkbox);

        myCheckbox.setOnClickListener(new View.OnClickListener() {

            boolean isOn = false;

            @Override
            public void onClick(View v) {
                if (!isOn) {// If the switch is on then this line of code will execute
                    myCheckbox.setText("On");//setting the text of the switch to Off
                    myCheckbox.setBackgroundColor(Color.GREEN);
                    isOn = true;
                    equals.setEnabled(true);
                    number1.setEnabled(true);
                    number2.setEnabled(true);
                    sign.setEnabled(true);
                } else {
                    myCheckbox.setText("Off");
                    myCheckbox.setBackgroundColor(Color.RED);
                    isOn = false;
                    equals.setEnabled(false);
                    number1.setEnabled(false);
                    number2.setEnabled(false);
                    sign.setEnabled(false);
                }
            }
        });
    }
}