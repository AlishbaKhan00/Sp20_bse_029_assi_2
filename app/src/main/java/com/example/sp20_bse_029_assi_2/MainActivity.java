package com.example.sp20_bse_029_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String code = "3745";
    public TextView txt_code;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button back_btn;
    public Button open_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        txt_code = findViewById  (R.id.txt_code);

        btn1 = findViewById   (R.id.btn1);

        btn2 = findViewById   (R.id.btn2);

        btn3 = findViewById   (R.id.btn3);

        btn4 = findViewById   (R.id.btn4);

        btn5 = findViewById   (R.id.btn5);

        btn6 = findViewById   (R.id.btn6);

        btn7 = findViewById   (R.id.btn7);

        btn8 = findViewById   (R.id.btn8);

        btn9 = findViewById   (R.id.btn9);

        btn0 = findViewById   (R.id.btn0);

        back_btn = findViewById (R.id.back_btn);

        open_btn = findViewById (R.id.btn_open);

    }

    private void setText (int a)
    {
        String prevText = txt_code.getText().toString();

        if(prevText.length() >= 4){
            return;
        }
        txt_code.setText (prevText + a);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                setText(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setText(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                setText(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(9);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(0);
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String pText = txt_code.getText().toString();
                if(pText.length() > 0){
                    txt_code.setText(pText.substring(0, pText.length() - 1));
                }
            }
        });
        open_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String pText = txt_code.getText().toString();
                if(pText.equals(code)){
                    Intent intent = new Intent(getApplicationContext(), MessageActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText (MainActivity.this, " wrong Key ",  Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}