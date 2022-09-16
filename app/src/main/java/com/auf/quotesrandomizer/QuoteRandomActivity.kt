package com.auf.quotesrandomizer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.auf.quotesrandomizer.databinding.ActivityGetRandomQuotesBinding


class QuoteRandomActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityGetRandomQuotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetRandomQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = getIntent()

        var whatQuote = intent.getExtras()?.getString("Quotess");
        binding.textView3.text = whatQuote

        binding.randomizer.setOnClickListener(this)

        if(whatQuote == "Love"){
            val lovequotess = loveqoutes.getQuote()
            binding.textView3.text = lovequotess
        }
        else if(whatQuote == "Motivational"){
            val lovequotess = motivationalquotes.getQuotes()
            binding.textView3.text = lovequotess
        }
        else if(whatQuote == "Inspirational"){
            val lovequotess = inspirationalquotes.getQuotess()
            binding.textView3.text = lovequotess
        }

    }

    override fun onClick(p0: View?) {
        val intent = getIntent()
        var whatQuote = intent.getExtras()?.getString("Quotess");
        when(p0!!.id){
            (R.id.randomizer)->{
                if(whatQuote == "Love"){
                    val lovequotess = loveqoutes.getQuote()
                    binding.textView3.text = lovequotess
                }
                else if(whatQuote == "Motivational"){
                    val lovequotess = motivationalquotes.getQuotes()
                    binding.textView3.text = lovequotess
                }
                else if(whatQuote == "Inspirational"){
                    val lovequotess = inspirationalquotes.getQuotess()
                    binding.textView3.text = lovequotess
                }
            }
        }
    }
}