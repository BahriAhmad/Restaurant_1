package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText password,username,confirmPassword;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    //instantiate
        password = findViewById(R.id.etPasswordReg);
        confirmPassword = findViewById(R.id.etConfirm);
        username = findViewById(R.id.etUsernameReg);
        register = findViewById(R.id.btnRegister);
    }
}