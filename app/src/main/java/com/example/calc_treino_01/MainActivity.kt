package com.example.calc_treino_01

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calc_treino_01.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val calculo = binding.calculo

       binding.button0.setOnClickListener {
           calculo.text = "${calculo.text}0"
       }

        binding.button1.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }

        binding.button2.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        binding.button3.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.button4.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }

        binding.button5.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }

        binding.button6.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }

        binding.button7.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }

        binding.button8.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }

        binding.button9.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }

        binding.buttonPonto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        binding.buttonMais.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.buttonMenos.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }

        binding.buttonVezes.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }

        binding.buttonDivis.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }

        binding.buttonElev.setOnClickListener {
            calculo.text = "${calculo.text}^"
        }

        binding.buttonIgual.setOnClickListener {
            val resultadoCalc = Expression(calculo.text.toString()).calculate()


            if(resultadoCalc.isNaN()) {
                binding.resultado.text = "Expressão inválida"
            } else{
                binding.resultado.text = resultadoCalc.toString()
            }

            //setar em resultado

            binding.resultado.text = resultadoCalc.toString()

        }

        binding.buttonParenAbr.setOnClickListener {
            calculo.text = "${calculo.text}("
        }

        binding.buttonParenFech.setOnClickListener {
            calculo.text = "${calculo.text})"
        }

        binding.buttonPorce.setOnClickListener {
            calculo.text = "${calculo.text}%"
        }

        binding.buttonRaiz.setOnClickListener {
            calculo.text = "${calculo.text}√"
        }

        binding.buttonCe.setOnClickListener {
            calculo.text = " "
            binding.resultado.text = " "
        }

        binding.buttonExit.setOnClickListener {
            finish()
        }

        binding.buttonDel.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

    }
}