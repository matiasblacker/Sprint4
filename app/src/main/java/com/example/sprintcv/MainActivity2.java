package com.example.sprintcv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buttonLinkedIn = findViewById(R.id.button5);
        Button buttonGitHub = findViewById(R.id.button6);
        Button buttonCorreo = findViewById(R.id.button7);

        buttonLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir perfil de LinkedIn
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.linkedin.com/in/matias-perez-sd94/")); // Cambia "tu_perfil" por tu perfil real
                startActivity(intent);
            }
        });

        buttonGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir perfil de GitHub
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/matiasblacker")); // Cambia "tu_usuario" por tu usuario real
                startActivity(intent);
            }
        });
        buttonCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir Gmail con dirección ya lista
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:matias.perez.sd94@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Necesito solicitar servicios de IT"); // Puedes cambiar el asunto
                startActivity(intent);
            }
        });
    }
}