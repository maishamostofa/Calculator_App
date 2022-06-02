package com.example.standardcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StandardCalculator extends AppCompatActivity {
    Button scientificbutton,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView tvmain,tvsec;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_calculator);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        scientificbutton=(Button) findViewById(R.id.scibtn);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners

        scientificbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   Intent intent=new Intent(StandardCalculator.this,ScientificCalculator.class);
                   startActivity(intent);
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //One button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"1");
                }
                catch (Exception e) {     // Handle the error/exception

                }
            }
        });
        //Two button
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"2");
                }
                catch (Exception e) {     // Handle the error/exception

                }
            }
        });
        //Three button
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"3");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Four button
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"4");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Five button
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"5");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Six button
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"6");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Seven button
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"7");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Eight button
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"8");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Nine button
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"9");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Zero button
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"0");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Dot button
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+".");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Clear button
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText("");
                    tvsec.setText("");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Delete button
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = tvmain.getText().toString();
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Addition button
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"+");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Minus button
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"-");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Multiplication button
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"×");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText()+"÷");
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });
        //Equal button
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = tvmain.getText().toString();
                    String replacedstr = val.replace('÷','/').replace('×','*');
                    double result = eval(replacedstr);
                    tvmain.setText(String.valueOf(result));
                    tvsec.setText(val);
                }
                catch (Exception e) {     // Handle the error/exception

                }

            }
        });

    }


    //equal function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('('))
                { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.')
                { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}