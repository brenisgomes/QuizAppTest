package br.com.quizapptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.quizapptest.databinding.ActivityPasswordScreenBinding

class PasswordScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPasswordScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        binding.run {

            btnNext.setOnClickListener {
                startScreen(LoginActivity())
            }
        }
    }

    private fun startScreen(screen: AppCompatActivity) {
        startActivity(Intent(this, screen::class.java))
    }
}