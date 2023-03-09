package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener {
            binding.inputttext.text=" "
            binding.outputtext.text=" " }

        binding.btn0.setOnClickListener {
            binding.inputttext.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.inputttext.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputttext.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputttext.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputttext.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputttext.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputttext.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputttext.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputttext.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputttext.append("9")
        }
        binding.btnDot.setOnClickListener{
            binding.inputttext.append( ".")
        }
        binding.btnAdd.setOnClickListener {
            binding.inputttext.append(" + ")
        }
        binding.btnSub.setOnClickListener {
            binding.inputttext.append(" - ")
        }
        binding.btnMulti.setOnClickListener {
            binding.inputttext.append(" * ")
        }
        binding.btnDiv.setOnClickListener {
            binding.inputttext.append(" / ")
        }

        binding.btnEqual.setOnClickListener {

            val expression = ExpressionBuilder(binding.inputttext.text.toString()).build()
            val result= expression.evaluate()
            val longresult=result.toLong()

            if(result==longresult.toDouble()){
                binding.outputtext.text=longresult.toString()
            }else{
                binding.outputtext.text=result.toString()
            }

        }


    }
}