package com.example.login_dz1_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText login, password;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListener();
    }

    private void initListener() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Вы ввели не правильные данные",
                            Toast.LENGTH_SHORT).show();
                }      else {
                    Toast.makeText(MainActivity.this, "Успешно!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init() {
        login = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.login);     
    }

}