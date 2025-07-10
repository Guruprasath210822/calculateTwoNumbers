package com.example.guru

import android.media.tv.TvView
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val firstNumber= binding.uiEtFirstNo.text
        val secondNumber= binding.uiEtSecNo.text
        binding.uiBtnAdd.setOnClickListener {
            if (binding.uiEtFirstNo.text?.isNotEmpty() == true && binding.uiEtSecNo.text?.isNotEmpty() == true){
                val text = firstNumber.toString().toInt().plus(secondNumber.toString().toInt())
                binding.uiEtAns.text = text.toString()
            } else {
                Toast.makeText(this,"pls enter valid number",Toast.LENGTH_SHORT).show()

            }
        }
        binding.uiBtnSub.setOnClickListener {
            if (binding.uiEtFirstNo.text?.isNotEmpty() == true && binding.uiEtSecNo.text?.isNotEmpty() == true){
                val text = firstNumber.toString().toInt().minus(secondNumber.toString().toInt())
                binding.uiEtAns.text = text.toString()



                binding
            } else {
                Toast.makeText(this,"pls enter valid number",Toast.LENGTH_SHORT).show()

            }
        }

        binding.uiBtnDiv.setOnClickListener {
            if (binding.uiEtFirstNo.text?.isNotEmpty() == true && binding.uiEtSecNo.text?.isNotEmpty() == true){
                val text = firstNumber.toString().toInt() * secondNumber.toString().toInt()
                Log.e("checkdataaaaaa","${text}")
                Log.e("checkdataaaaaa","${firstNumber}")
                Log.e("checkdataaaaaa","${secondNumber}")
                Log.e("checkdataaaaaa","${firstNumber.toString().toInt() * secondNumber.toString().toInt()}")
                binding.uiEtAns.text = text.toString()
            } else {
                Toast.makeText(this,"pls enter valid number",Toast.LENGTH_SHORT).show()

            }
        }

        binding.uiBtnMul.setOnClickListener {
            if (binding.uiEtFirstNo.text?.isNotEmpty() == true && binding.uiEtSecNo.text?.isNotEmpty() == true){
                val text = firstNumber.toString().toInt()/(secondNumber.toString().toInt())
                binding.uiEtAns.text = text.toString()
            } else {
                Toast.makeText(this,"pls enter valid number",Toast.LENGTH_SHORT).show()

            }
        }
    }
}