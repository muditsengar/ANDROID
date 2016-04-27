package com.example.anonymousx.calculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text, ans;
    Button zero, one, two, three, four, five, six, seven, eight, nine, doubleZero, add, subtract,
            multiply, divide, point, result, delete, clear;
    char operator;
    double answer;
    String p = "";
    String s = "";
    double i1, i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        ans = (TextView) findViewById(R.id.ans);

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
                operator = '+';
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "+");
                    } else {
                        c1[c1.length - 1] = '+';
                        text.setText(String.valueOf(c1));
                    }
                }
                add.setEnabled(false);
                subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
            }
        });

        subtract = (Button) findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                operator = '-';
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "-");
                    } else {
                        c1[c1.length - 1] = '-';
                        text.setText(String.valueOf(c1));
                    }
                }
                add.setEnabled(false);
                subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
            }
        });

        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                operator = '*';
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "*");
                    } else {
                        c1[c1.length - 1] = '*';
                        text.setText(String.valueOf(c1));
                    }
                }
                add.setEnabled(false);
                subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
            }
        });

        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                operator = '/';
                if (c1.length > 0) {
                    if (c1[c1.length - 1] != '+' && c1[c1.length - 1] != '-' &&
                            c1[c1.length - 1] != '/' && c1[c1.length - 1] != '*') {
                        text.setText(text.getText() + "/");
                    } else {
                        c1[c1.length - 1] = '/';
                        text.setText(String.valueOf(c1));
                    }
                }
                add.setEnabled(false);
                subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
            }
        });

        point = (Button) findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c1 = text.getText().toString().toCharArray();
                if (c1.length > 0) {
                    if (!text.getText().toString().contains(".")) {
                        if (c1[c1.length - 1] != '.') {
                            text.setText(text.getText() + ".");
                        }
                    }
                }

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
                    if ((originalText[originalText.length - 1] == '+') ||
                            (originalText[originalText.length - 1] == '-') ||
                            (originalText[originalText.length - 1] == '*') ||
                            (originalText[originalText.length - 1] == '/')) {
                        add.setEnabled(true);
                        subtract.setEnabled(true);
                        multiply.setEnabled(true);
                        divide.setEnabled(true);
                    }
                }
            }
        });

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                add.setEnabled(true);
                subtract.setEnabled(true);
                multiply.setEnabled(true);
                divide.setEnabled(true);
            }
        });

        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] c = text.getText().toString().toCharArray();
                if (String.valueOf(c).contains("+") || String.valueOf(c).contains("-") ||
                        String.valueOf(c).contains("*") || String.valueOf(c).contains("/")) {
                    Log.d("cArray", String.valueOf(c));
                    for (int i = 0; i < c.length; i++) {
                        if (c[i] == '+' || c[i] == '-' || c[i] == '/' || c[i] == '*') {
                            for (int j = 0; j < i; j++) {
                                p += String.valueOf(c[j]);
                            }
                            for (int j = i + 1; j < c.length; j++) {
                                s += String.valueOf(c[j]);
                            }
                        }
                    }

                    i1 = Long.parseLong(p);
                    i2 = Long.parseLong(s);
                    Log.d("i1", String.valueOf(i1));
                    Log.d("i1", String.valueOf(i2));
                    Log.d("valueOf", p);
                    Log.d("operator", String.valueOf(operator));

                    if (operator == '+') {
                        answer = i1 + i2;
                        Log.d("answer", String.valueOf(answer));
                        ans.setText(String.valueOf(answer));
                    }
                    if (operator == '-') {
                        answer = i1 - i2;
                        Log.d("answer", String.valueOf(answer));
                        ans.setText(String.valueOf(answer));
                    }
                    if (operator == '*') {
                        answer = i1 * i2;
                        Log.d("answer", String.valueOf(answer));
                        ans.setText(String.valueOf(answer));
                    }
                    if (operator == '/') {
                        if (i2 != 0 || i2 != 00) {
                            answer = i1 / i2;
                            Log.d("answer", String.valueOf(answer));
                            ans.setText(String.valueOf(answer));
                        }
                    }
                } else ans.setText(text.getText());
            }
        });

    }
}
