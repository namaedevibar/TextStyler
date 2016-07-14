package com.activity.devibar.textstyler;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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
    private RadioButton mRed;
    private RadioButton mBlue;
    private RadioButton mGreen;



    public void set(){

        mSample = (EditText) findViewById(R.id.etSample);
        mResult = (TextView) findViewById(R.id.txtResult);
        mBold = (CheckBox) findViewById(R.id.ckBold);
        mItalic = (CheckBox) findViewById(R.id.ckItalic);
        mRed = (RadioButton) findViewById(R.id.rdRed);
        mBlue = (RadioButton) findViewById(R.id.rdBlue);
        mGreen = (RadioButton) findViewById(R.id.rdGreen);



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

                if (mItalic.isChecked()){
                    if (mBold.isChecked()){
                        mResult.setTypeface(null, Typeface.BOLD_ITALIC);
                    }
                    else
                    {
                        mResult.setTypeface(null, Typeface.ITALIC);
                    }

                }


                    if (mBold.isChecked()){
                        mResult.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                    }
                    else
                    {

                            mResult.setTypeface(null, Typeface.NORMAL);}



            }
        });

        mBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mBold.isChecked()){
                    if (mItalic.isChecked()){
                        mResult.setTypeface(null, Typeface.BOLD_ITALIC);
                    }
                    else
                    {

                        mResult.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                    }

                }


                    if (mItalic.isChecked()){
                        mResult.setTypeface(null, Typeface.ITALIC);
                    }
                    else
                    {

                        mResult.setTypeface(null, Typeface.NORMAL);}








            }
        });


        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mRed.isChecked()) {
                    mResult.setTextColor(Color.RED);
                }

                mRed.setChecked(false);
                mGreen.setChecked(false);
                mBlue.setChecked(false);
            }
        });


        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mBlue.isChecked()) {
                    mResult.setTextColor(Color.BLUE);
                }

                mRed.setChecked(false);
                mGreen.setChecked(false);
                mBlue.setChecked(false);
            }
        });


        mGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mGreen.isChecked()) {
                    mResult.setTextColor(Color.GREEN);
                }

                mRed.setChecked(false);
                mGreen.setChecked(false);
                mBlue.setChecked(false);
            }
        });














    }
}
