package com.example.richtexteditor

import android.graphics.Paint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.view.View
import com.example.richtexteditor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun negrito(view: View) {
        val spannableString = SpannableStringBuilder(binding.editTextTexto.text)
        spannableString.setSpan(
            StyleSpan(Typeface.BOLD),
            binding.editTextTexto.selectionStart,
            binding.editTextTexto.selectionEnd,
            0
        )

        binding.editTextTexto.text = spannableString
    }

    fun italico(view: View) {
        val spannableString = SpannableStringBuilder(binding.editTextTexto.text)
        spannableString.setSpan(
            StyleSpan(Typeface.ITALIC),
            binding.editTextTexto.selectionStart,
            binding.editTextTexto.selectionEnd,
            0
        )

        binding.editTextTexto.text = spannableString
    }

    fun underLine(view: View) {
        val spannableString = SpannableStringBuilder(binding.editTextTexto.text)
        spannableString.setSpan(
            UnderlineSpan(),
            binding.editTextTexto.selectionStart,
            binding.editTextTexto.selectionEnd,
            0
        )

        binding.editTextTexto.text = spannableString
    }

    fun esquerda(view: View) {

        binding.editTextTexto.textAlignment = View.TEXT_ALIGNMENT_TEXT_START

    }

    fun centro(view: View) {

        binding.editTextTexto.textAlignment = View.TEXT_ALIGNMENT_CENTER
    }

    fun direita(view: View) {

        binding.editTextTexto.textAlignment = View.TEXT_ALIGNMENT_TEXT_END


    }

    fun limpar(view: View) {

        val spannableString = binding.editTextTexto.text.toString()
        binding.editTextTexto.setText(spannableString)



    }
}