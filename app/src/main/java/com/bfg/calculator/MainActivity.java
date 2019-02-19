package com.bfg.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{
    private TextView result = null;

    private Button oneButton = null;
    private Button twoButton = null;
    private Button threeButton = null;
    private Button fourButton = null;
    private Button fiveButton = null;
    private Button sixButton = null;
    private Button sevenButton = null;
    private Button eightButton = null;
    private Button nineButton = null;
    private Button zeroButton = null;

    private Button plusButton = null;
    private Button minusButton = null;
    private Button multButton = null;
    private Button divButton = null;
    private Button dotButton = null;
    private Button percentButton = null;
    private Button backspaceButton = null;
    private Button deleteButton = null;
    private Button equalsButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.resultView);

        oneButton = findViewById(R.id.button_1);
        twoButton = findViewById(R.id.button_2);
        threeButton = findViewById(R.id.button_3);
        fourButton = findViewById(R.id.button_4);
        fiveButton = findViewById(R.id.button_5);
        sixButton = findViewById(R.id.button_6);
        sevenButton = findViewById(R.id.button_7);
        eightButton = findViewById(R.id.button_8);
        nineButton = findViewById(R.id.button_9);
        zeroButton = findViewById(R.id.button_0);

        plusButton = findViewById(R.id.buttonPlus);
        minusButton = findViewById(R.id.buttonMinus);
        multButton = findViewById(R.id.buttonMult);
        divButton = findViewById(R.id.buttonDivide);
        dotButton = findViewById(R.id.buttonDot);
        percentButton = findViewById(R.id.buttonPercantage);
        backspaceButton = findViewById(R.id.buttonDel);
        deleteButton = findViewById(R.id.buttonReset);
        equalsButton = findViewById(R.id.buttonEquals);
    }
}
