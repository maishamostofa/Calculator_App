package com.example.standardcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScientificCalculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac,exponentbutton,xcubebutton,ansbutton,stpower2nd,epowerbtn,varNoPower,percentbutton,tenexponent,rootbutton,cuberootbutton;
    TextView tvmain;
    TextView tvsec;
    String pi = "3.14159265";
    double ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

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
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        percentbutton=findViewById(R.id.percentbtn);
        varNoPower=findViewById(R.id.varpowerbtn);
        epowerbtn= findViewById(R.id.epowerbtn);
        stpower2nd= findViewById(R.id.istpower2nd);
        tenexponent= findViewById(R.id.tenexponent) ;
        ansbutton=findViewById(R.id.ansbtn);
        xcubebutton= findViewById(R.id.xcubebtn);
        exponentbutton= findViewById(R.id.expbtn);
        rootbutton=findViewById(R.id.fourthrtbtn);
        cuberootbutton=findViewById(R.id.cuberootbtn);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners
        //Standard button
        varNoPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent=new Intent(ScientificCalculator.this,StandardCalculator.class);
                    startActivity(intent);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }


            }
        });

        //Number to the power button
        stpower2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                        tvmain.setText(tvmain.getText()+"^");
                }
                catch (Exception e){

                }

            }
        });

        //e to the power button
        epowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double n= Double.parseDouble(tvmain.getText().toString());
                    Double exp = (Double) Math.pow(2.718281828, n);
                    tvmain.setText(String.valueOf(exp));
                    tvsec.setText("e^"+n);
                }
                catch (Exception e){

                }
            }
        });

        //Percentage button
        percentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double n= Double.parseDouble(tvmain.getText().toString());
                    Double mod = n/100;
                    tvmain.setText(String.valueOf(mod));
                    tvsec.setText(n+"%");
                }
                catch (Exception e){

                }
            }
        });

        //Ten exponent button
        tenexponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int n= Integer.parseInt(tvmain.getText().toString());
                    int exp = (int) Math.pow(10, n);
                    tvmain.setText(String.valueOf(exp));
                    tvsec.setText("10^"+n);
                }
                catch (Exception e){

                }
            }
        });

        //Square button
        rootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                     tvmain.setText(tvmain.getText()+"√");
               }
               catch(Exception e){

              }
            }
        });

        //Cube button
        cuberootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double d=Double.parseDouble(tvmain.getText().toString());
                    Double a = Math.cbrt(d);
                    tvmain.setText(String.valueOf(a));
                    tvsec.setText("∛"+d);
                }
                catch(Exception e){

                }
            }
        });

        //Exponent button
        exponentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int d = Integer.parseInt(tvmain.getText().toString());
                    double exp = 2.718281828*d;
                    tvmain.setText(String.valueOf(exp));
                    tvsec.setText(d+"e");
                }
                catch (Exception e){

                }

            }
        });

        //Cube button
        xcubebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double d = Double.parseDouble(tvmain.getText().toString());
                    double cube = d*d*d;
                    tvmain.setText(String.valueOf(cube));
                    tvsec.setText(d+"^3");
                }
                catch (Exception e){

                }
            }
        });

        //Answer button
        ansbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(ans+"");
                }
                catch (Exception e){

                }
            }
        });

        //One button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"1");
                }
                catch (Exception e){

                }
            }
        });

        //Two button
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"2");
                }
                catch (Exception e){

                }
            }
        });

        //Three button
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"3");
                }
                catch (Exception e){

                }
            }
        });

        //Four button
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"4");
                }
                catch (Exception e){

                }
            }
        });

        //Five button
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"5");
                }
                catch (Exception e){

                }
            }
        });

        //Six button
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"6");
                }
                catch (Exception e){

                }
            }
        });

        //Seven button
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"7");
                }
                catch (Exception e){

                }
            }
        });

        //Eight button
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"8");
                }
                catch (Exception e){

                }
            }
        });

        //Nine button
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"9");
                }
                catch (Exception e){

                }
            }
        });

        //Zero button
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"0");
                }
                catch (Exception e){

                }
            }
        });

        //Dot button
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+".");
                }
                catch (Exception e){

                }
            }
        });

        //Clear button
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText("");
                    tvsec.setText("");
                }
                catch (Exception e){

                }
            }
        });

        //Delete button
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String val = tvmain.getText().toString();
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }
                catch (Exception e){

                }
            }
        });

        //Addition button
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"+");
                }
                catch (Exception e){

                }
            }
        });

        //Subtraction button
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"-");
                }
                catch (Exception e){

                }
            }
        });

        //Multiplication button
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"×");
                }
                catch (Exception e){

                }
            }
        });

        //Division button
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"÷");
                }
                catch (Exception e){

                }
            }
        });

        //Square root button
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String val = tvmain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(val));
                    tvmain.setText(String.valueOf(r));
                    tvsec.setText("√"+val);
                }
                catch (Exception e){

                }
            }
        });

        //First bracket open button
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"(");
                }
                catch (Exception e){

                }
            }
        });

        //First bracket close button
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+")");
                }
                catch (Exception e){

                }
            }
        });

        //Pi button
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+pi);
                }
                catch (Exception e){

                }
            }
        });

        //Sine button
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"sin");
                }
                catch (Exception e){

                }
            }
        });

        //Cosine button
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"cos");
                }
                catch (Exception e){

                }
            }
        });

        //Tangent button
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"tan");
                }
                catch (Exception e){

                }
            }
        });

        //Inverse button
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"^"+"(-1)");
                }
                catch (Exception e){

                }
            }
        });

        //Factorial button
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int val = Integer.parseInt(tvmain.getText().toString());
                    int fact = factorial(val);
                    tvmain.setText(String.valueOf(fact));
                    tvsec.setText(val+"!");
                }
                catch (Exception e){

                }
            }
        });

        //Square button
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double d = Double.parseDouble(tvmain.getText().toString());
                    double square = d*d;
                    tvmain.setText(String.valueOf(square));
                    tvsec.setText(d+"²");
                }
                catch (Exception e){

                }
            }
        });

        //Ln button
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"ln");
                }
                catch (Exception e){

                }
            }
        });

        //Logarithm button
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    tvmain.setText(tvmain.getText()+"log");
                }
                catch (Exception e){

                }
            }
        });

        //Equal button
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String val = tvmain.getText().toString();
                    String replacedstr = val.replace('÷','/').replace('×','*');
                    double result = eval(replacedstr);
                    tvmain.setText(String.valueOf(result));
                    tvsec.setText(val);
                    ans=Double.parseDouble(tvmain.getText().toString());
                }
                catch (Exception e){

                }
            }
        });

    }

    //factorial function
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
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
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);


                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                if (eat('√'))x = Math.pow(parseFactor(), (1/x));

                    //

                return x;
            }
        }.parse();
    }
}
