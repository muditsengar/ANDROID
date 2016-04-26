package com.example.anonymousx.calculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button zero, one, two, three, four, five, six, seven, eight, nine, doubleZero, add, subtract,
            multiply, divide, point, result, delete, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });

        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });

        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });

        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });

        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });

        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });

        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });

        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });

        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });

        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });

        doubleZero = (Button) findViewById(R.id.doubleZero);
        doubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "00");
            }
        });

        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "+");
                    } else {
                        c1[c1.length - 1] = '+';
                        text.setText(String.valueOf(c1));
                    }
                }
            }
        });

        subtract = (Button) findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "-");
                    } else {
                        c1[c1.length - 1] = '-';
                        text.setText(String.valueOf(c1));
                    }
                }
            }
        });

        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "*");
                    } else {
                        c1[c1.length - 1] = '*';
                        text.setText(String.valueOf(c1));
                    }
                }
            }
        });

        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "/");
                    } else {
                        c1[c1.length - 1] = '/';
                        text.setText(String.valueOf(c1));
                    }
                }
            }
        });

        point = (Button) findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '.') {
                        text.setText(text.getText() + ".");
                    }
                }
            }
        });

        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer number = Integer.parseInt(text.getText().toString());
                Log.d("number", String.valueOf(number));
                text.setText(text.getText() + " = " + number);
            }
        });

        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString().length() > 0) {
                    char[] originalText = text.getText().toString().toCharArray();
                    char[] newText = new char[originalText.length - 1];
                    for (int i = 0; i < newText.length; i++) {
                        newText[i] = originalText[i];
                    }
                    String newT = String.valueOf(newText);
                    text.setText(newT);
                }
            }
        });

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });
    }
}
