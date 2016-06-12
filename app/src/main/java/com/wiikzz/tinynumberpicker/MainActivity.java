package com.wiikzz.tinynumberpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.textView);


        TinyNumberPicker tinyNumberPicker = (TinyNumberPicker) findViewById(R.id.tinyNumberPicker);
        assert tinyNumberPicker != null;
        tinyNumberPicker.setMinValue(0);
        tinyNumberPicker.setMaxValue(5);
        tinyNumberPicker.setValue(2);

        tinyNumberPicker.setDisplayedValues(new String[] {"00", "10", "20", "30", "40", "50"});

        tinyNumberPicker.setOnValueChangedListener(new TinyNumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(TinyNumberPicker picker, int oldVal, int newVal) {
                if(mTextView != null) {
                    mTextView.setText("Last:" + oldVal + ", Now:" + newVal);
                }
            }
        });
    }
}
