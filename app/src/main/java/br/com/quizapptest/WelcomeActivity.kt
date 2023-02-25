package br.com.quizapptest


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.quizapptest.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nextScreen()
        setupListeners()
    }

    private fun nextScreen() {
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupListeners() {
        binding.run {

            btnNext.setOnClickListener {
                startScreen(PasswordScreenActivity())
            }
        }

    }

    private fun startScreen(screen: AppCompatActivity) {
        startActivity(Intent(this, screen::class.java))
    }
}