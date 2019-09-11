package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView b1;
    private EditText b2;
    private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);

        Intent intent=getIntent();
        String a_b=intent.getStringExtra("a_b");
        b1.setText(a_b);

        b3.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View view) {

                    Intent intent=new Intent();
                    intent.putExtra("data_return","666");
                    setResult(RESULT_OK,intent);
                    finish();
    }
            });



    }


}
