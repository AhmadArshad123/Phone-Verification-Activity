package com.example.phoneverification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    Button btn;
    CountryCodePicker ccp;
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open_activity_2();
    }


    public void cpp_selector()
    {
        ccp = (CountryCodePicker) findViewById(R.id.ccp);

        ccp.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {

            }
        });
    }
    public void open_activity_2()
    {
        btn =(Button) findViewById(R.id.code_button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    open_activity2();
                    }
                });
    }

    public void open_activity2()
    {
        Intent intent =new Intent(this,SecondActivity.class );
        startActivity(intent);
    }
}