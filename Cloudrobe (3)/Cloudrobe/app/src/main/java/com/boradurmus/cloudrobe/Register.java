package com.boradurmus.cloudrobe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3, editTextPhone, editTextTextPassword, editTextNumber;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        editTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        TextView btngiris = findViewById(R.id.textView4);
        btngiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button4) {
            String email = editTextTextPersonName3.getText().toString();
            String password = editTextTextPassword.getText().toString();
            String name = editTextTextPersonName.getText().toString();
            String surname = editTextTextPersonName2.getText().toString();
            String telephone = editTextPhone.getText().toString();
            String iban = editTextNumber.getText().toString();


            if (name.isEmpty()) {
                editTextTextPersonName.setError("Adınızı giriniz!");
                editTextTextPersonName.requestFocus();
                return;
            }

            if (surname.isEmpty()) {
                editTextTextPersonName2.setError("Soyadınızı giriniz!");
                editTextTextPersonName2.requestFocus();
                return;
            }

            if (email.isEmpty()) {
                editTextTextPersonName3.setError("E-posta adresinizi giriniz!");
                editTextTextPersonName3.requestFocus();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editTextTextPersonName3.setError("Geçerli bir e-posta adresi giriniz!");
                editTextTextPersonName3.requestFocus();
                return;
            }

            if (telephone.isEmpty()) {
                editTextPhone.setError("Telefon numaranızı giriniz!");
                editTextPhone.requestFocus();
                return;
            }

            if (iban.isEmpty()) {
                editTextNumber.setError("IBAN'ınızı giriniz!");
                editTextNumber.requestFocus();
                return;
            }

            if (password.isEmpty()) {
                editTextTextPassword.setError("Parolanızı giriniz!");
                editTextTextPassword.requestFocus();
                return;
            }

            if (password.length() < 6) {
                editTextTextPassword.setError("Parolanız minimum 6 karakterden oluşmalıdır!");
                editTextTextPassword.requestFocus();
                return;
            }

            Intent regtomain = new Intent(Register.this, MainActivity.class);
            startActivity(regtomain);


        }
    }
}