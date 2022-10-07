package com.example.p1holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declaracion de variable miembro de instancia(ivars)

    private Button mHelloButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inflar los widgets ligar la vista con el modelo

        mHelloButton=findViewById(R.id.hello_button);
    }
}