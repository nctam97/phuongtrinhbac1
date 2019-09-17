package com.example.phuongtrinhbac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editA, editB;
    Button btnTinh;
    TextView textkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editA=(EditText)findViewById(R.id.editText_A);
        editB=(EditText)findViewById(R.id.editText_B);
        btnTinh=(Button)findViewById(R.id.button_tinh);
        textkq=(TextView)findViewById(R.id.textView_kq);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1=editA.getText().toString();
                int SoA=Integer.parseInt(chuoi1);
                String chuoi2=editB.getText().toString();
                int SoB=Integer.parseInt(chuoi2);
                if (SoA == 0) {
                    if (SoB == 0) {
                        textkq.setText("Phương trình này có vô số nghiệm.");
                    } else {
                        textkq.setText("Phương trình vô nghiệm.");
                    }
                } else {
                    double kq=(double)-SoB/SoA;
                    textkq.setText("Phương trình có nghiệm x = :"+" "+ String.valueOf(kq));
                }
            }
        });
    }
}
