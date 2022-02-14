package example.com.overseas;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton, cmButton;
        final EditText amountEditText;
        final TextView resultTextView;



        mButton = (Button) findViewById(R.id.mButton);
        cmButton = (Button) findViewById(R.id.cmButton);

        amountEditText = (EditText) findViewById(R.id.amountEditText);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        // Code should have a switch

        mButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Double convert = Double.parseDouble(amountEditText.getText().toString());
                resultTextView.setText(String.valueOf(convert*0.3048));

                resultTextView.setTextColor(Color.RED);
            }
        });

        cmButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Double convert = Double.parseDouble(amountEditText.getText().toString());
                resultTextView.setText(String.valueOf(convert*30.48));

                resultTextView.setTextColor(Color.RED);
            }
        });

    } // end of onCreate



    }// end of main class