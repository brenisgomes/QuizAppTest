package br.com.quizapptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.quizapptest.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupListeners()

    }

    private fun setupListeners() {
        binding.run {

            btnLogin.setOnClickListener {
                Toast.makeText(this@LoginActivity,"Login efetuado com sucesso!", Toast.LENGTH_SHORT).show()
            }

            btnBackLogin.setOnClickListener {
                startScreen(PasswordScreenActivity())
            }
        }

    }

    private fun startScreen(screen: AppCompatActivity) {
        startActivity(Intent(this, screen:: class.java))
    }
}