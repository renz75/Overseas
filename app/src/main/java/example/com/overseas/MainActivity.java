package example.com.overseas;

import androidx.appcompat.app.AppCompatActivity;


import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private boolean phoneDevice = true; // used to force landscape mode
    Button mButton, cmButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText amountEditText;
        final TextView resultTextView;

        // determine screen size
        int screenSize = getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;

        // if device is a tablet, set phoneDevice to false
        if(screenSize == Configuration.SCREENLAYOUT_SIZE_LARGE ||
        screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE)
            phoneDevice = false; // not a phone-sized device

        // if running on phone-sized device, allow only portrait orientation
        if(phoneDevice){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }



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