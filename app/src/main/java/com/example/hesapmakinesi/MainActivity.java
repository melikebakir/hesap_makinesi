package com.example.hesapmakinesi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button_C,button_bol,button_yuzde,button_carp,button_cikar,button_eksi;
    Button button_topla,button_AC,button_nokta,button_esit,button_0,button_1,button_2;
    Button button_3,button_4,button_5,button_6,button_7,button_8,button_9;

    TextView result,solution;
    boolean topla,cikar,carp,bol;
    float valueOne,valueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
result=findViewById(R.id.result);
solution=findViewById(R.id.solution);
button_C= findViewById(R.id.button_C);
button_eksi=findViewById(R.id.button_eksi);
button_bol= findViewById(R.id.button_bol);
button_carp= findViewById(R.id.button_carp);
button_cikar= findViewById(R.id.button_cikar);
button_topla= findViewById(R.id.button_topla);
button_yuzde= findViewById(R.id.button_yuzde);
button_AC= findViewById(R.id.button_AC);
button_nokta= findViewById(R.id.button_nokta);
button_esit= findViewById(R.id.button_esit);
button_0= findViewById(R.id.button_0);
button_1= findViewById(R.id.button_1);
button_2= findViewById(R.id.button_2);
button_3= findViewById(R.id.button_3);
button_4= findViewById(R.id.button_4);
button_5= findViewById(R.id.button_5);
button_6= findViewById(R.id.button_6);
button_7= findViewById(R.id.button_7);
button_8= findViewById(R.id.button_8);
button_9= findViewById(R.id.button_9);


button_1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
            result.setText(result.getText() + "1");
            solution.setText(result.getText());

    }
});

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "2");
                    solution.setText(result.getText());
            }

        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "3");
                    solution.setText(result.getText());
                }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "4");
                    solution.setText(result.getText());

                }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
                solution.setText(result.getText());
        }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "6");
                    solution.setText(result.getText());
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "7");
                    solution.setText(result.getText());
                }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "8");
                    solution.setText(result.getText());
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "9");
                    solution.setText(result.getText());
                }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.setText(result.getText() + "0");
                    solution.setText(result.getText());
            }
        });

        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
                solution.setText(result.getText());
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("");
            }
        });
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String currentText = result.getText().toString();

                if (!currentText.isEmpty()) {
                    String newText = currentText.substring(0, currentText.length() - 1);
                    result.setText(newText);
                    solution.setText(newText);
                }
            }
        });

        button_topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().length() > 0) {
                    valueOne = Float.parseFloat(result.getText().toString());
                    topla = true;
                    result.setText(null);
                }
            }
        });

        button_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().length() > 0){
                    valueOne = Float.parseFloat(result.getText().toString());
                    cikar=true;
                    result.setText(null);
                }
            }
        });
        button_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().length() > 0){
                    valueOne=Float.parseFloat(result.getText().toString());
                    carp=true;
                    result.setText(null);
                }
            }
        });
        button_bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().length() > 0){
                    valueOne=Float.parseFloat(result.getText().toString());
                    bol=true;
                    result.setText(null);
                }
            }
        });
        button_yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (result.getText().length() > 0) {

                    valueOne = Float.parseFloat(result.getText()+(""));
                    result.setText(valueOne/100+"");
                }
            }
        });
        button_eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = result.getText().toString();
                if (currentText.isEmpty() || currentText.equals("-")) {
                    result.setText("-");
                }
                solution.setText(result.getText());
            }
        });


        button_esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo=Float.parseFloat(result.getText()+"");
                if(topla==true){
                   result.setText(valueOne+valueTwo+"");
                   solution.setText(valueOne+"+"+valueTwo);
                   topla=false;
                }
                if(cikar==true){
                    result.setText(valueOne-valueTwo+"");
                    solution.setText(valueOne+"-"+valueTwo);
                    cikar=false;
                }
                if(carp==true){
                    result.setText(valueOne*valueTwo+"");
                    solution.setText(valueOne+"*"+valueTwo);
                    carp=false;
                }
                if(bol==true){
                    result.setText(valueOne/valueTwo+"");
                    solution.setText(valueOne+"/"+valueTwo);
                    bol=false;
                }
            }
        });

        }
    }
