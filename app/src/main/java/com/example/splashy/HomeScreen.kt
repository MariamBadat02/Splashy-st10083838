package com.example.splashy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class HomeScreen : AppCompatActivity() {


    private lateinit var italianButton: Button
    private lateinit var spanishButton: Button
    private lateinit var frenchButton: Button
    private lateinit var englishButton: Button
    private lateinit var welcomeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_screen)

        italianButton = findViewById(R.id.italianButton)
        spanishButton = findViewById(R.id.portugueseButton)
        frenchButton = findViewById(R.id.frenchButton)
        englishButton = findViewById(R.id.russianButton)
        welcomeTextView = findViewById(R.id.helloTextView)

        italianButton.setOnClickListener {
            welcomeTextView.setText(R.string.Ciao_Mondo)
        }

        spanishButton.setOnClickListener {
            welcomeTextView.setText(R.string.Bonjour_le_monde)
        }

        frenchButton.setOnClickListener {
            welcomeTextView.setText(R.string.Olá_mundo)
        }

        englishButton.setOnClickListener {
            welcomeTextView.setText(R.string.Привет_мир)
        }
    }
}
