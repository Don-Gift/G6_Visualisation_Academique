package com.itn.visualisation.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.itn.visualisation.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etStudentId;
    private Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etStudentId = findViewById(R.id.etStudentId);
        btnContinue = findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(v -> {
            String idText = etStudentId.getText().toString().trim();
            if (idText.isEmpty()) {
                Toast.makeText(this, "Veuillez entrer votre ID !", Toast.LENGTH_SHORT).show();
                return;
            }
            int studentId = Integer.parseInt(idText);
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("student_id", studentId);
            startActivity(intent);
        });
    }
}