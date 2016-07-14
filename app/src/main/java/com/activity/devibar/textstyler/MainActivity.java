package com.activity.devibar.textstyler;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set();
    }



    private EditText mSample;
    private TextView mResult;
    private CheckBox mBold;
    private CheckBox mItalic;
    private RadioGroup mColor;



    public void set() {

        mSample = (EditText) findViewById(R.id.etSample);
        mResult = (TextView) findViewById(R.id.txtResult);
        mBold = (CheckBox) findViewById(R.id.ckBold);
        mItalic = (CheckBox) findViewById(R.id.ckItalic);
        mColor = (RadioGroup) findViewById(R.id.rdColor);








        mSample.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mResult.setText(mSample.getText());


            }


        });


        mItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mItalic.isChecked() && mBold.isChecked()) {
                    mResult.setTypeface(null, Typeface.BOLD_ITALIC);
                } else if (mItalic.isChecked()) {
                    mResult.setTypeface(null, Typeface.ITALIC);
                } else if (mBold.isChecked()) {
                    mResult.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                } else {
                    mResult.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        mBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mItalic.isChecked() && mBold.isChecked()) {
                    mResult.setTypeface(null, Typeface.BOLD_ITALIC);
                } else if (mBold.isChecked()) {
                    mResult.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                } else if (mItalic.isChecked()) {
                    mResult.setTypeface(null, Typeface.ITALIC);
                } else {
                    mResult.setTypeface(null, Typeface.NORMAL);
                }


            }
        });

        mColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = mColor.getCheckedRadioButtonId();
                if (id == R.id.rdRed){
                    mResult.setTextColor(Color.RED);
                }
                else  if (id == R.id.rdBlue){
                    mResult.setTextColor(Color.BLUE);
                }
                if (id == R.id.rdGreen){
                    mResult.setTextColor(Color.GREEN);
                }
            }
        });

    }
}
