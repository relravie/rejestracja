package com.example.rejestracja;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText emailField = findViewById(R.id.emailField);
        EditText passwordField = findViewById(R.id.passwordField);
        EditText repeatPasswordField = findViewById(R.id.repeatPasswordField);
        TextView messageArea = findViewById(R.id.messageArea);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(v -> {
            String email = emailField.getText().toString().trim();
            String password = passwordField.getText().toString();
            String repeatPassword = repeatPasswordField.getText().toString();

            if (!email.contains("@")) {
                messageArea.setText("Nieprawidłowy adres email");
            } else if (!password.equals(repeatPassword)) {
                messageArea.setText("Hasła się różnią");
            } else {
                messageArea.setText("Witaj " + email);
            }
        });
    }
}
