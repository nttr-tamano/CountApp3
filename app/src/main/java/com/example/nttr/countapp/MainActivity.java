package com.example.nttr.countapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* ボタンを押すと数字が増える */
        Button btnIncrement = (Button) findViewById(R.id.btnIncrement);
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* テキスト欄の中身 */
                TextView textNumber = (TextView) findViewById(R.id.textNumber);
                String strNum;
                int num;
                strNum = (String) textNumber.getText();
                num = Integer.parseInt(strNum) + 1;
                textNumber.setText(String.valueOf(num));
            }
        });

        /* ボタンを押すと数字が減る */
        Button btnDecrement = (Button) findViewById(R.id.btnDecrement);
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* テキスト欄の中身 */
                TextView textNumber = (TextView) findViewById(R.id.textNumber);
                String strNum;
                int num;
                strNum = (String) textNumber.getText();
                num = Integer.parseInt(strNum) - 1;
                textNumber.setText(String.valueOf(num));
            }
        });

        /* ボタンを押すと0に戻る */
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* テキスト欄の中身 */
                TextView textNumber = (TextView) findViewById(R.id.textNumber);
                //String strNum;
                int num;
                //strNum = (String) textNumber.getText();
                final int intZero = 0; // 一応定数
                num = intZero;
                textNumber.setText(String.valueOf(num));
            }
        });

    }

}

// http://www.techscore.com/blog/2012/11/28/数値-⇔-文字列変換-java編/
