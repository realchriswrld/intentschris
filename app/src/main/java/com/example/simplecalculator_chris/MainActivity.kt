package com.example.simplecalculator_chris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtanswer:TextView
    private lateinit var edtfirstnumber:EditText
    private lateinit var edtsecondnumber:EditText
    private lateinit var edtbtnadd:Button
    private lateinit var result_two_display:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtanswer = findViewById(R.id.txtanswer)
        edtfirstnumber = findViewById(R.id.edtfirstnumber)
        edtsecondnumber = findViewById(R.id.edtsecondnumber)
        edtbtnadd = findViewById(R.id.edtbtnadd)
        result_two_display = findViewById(R.id.display_result_two)

        edtbtnadd.setOnClickListener {
            var first_num = edtfirstnumber.text.toString().trim()//50
            var second_num = edtsecondnumber.text.toString().trim()//20

            //validation od edit text
            if (first_num.isEmpty() || second_num.isEmpty() ){
                Toast.makeText(this, "Please Enter a valid number", Toast.LENGTH_SHORT).show()
            }  else{
                //means has some data
                var result = first_num.toDouble() + second_num.toDouble()
                result_two_display.text = result.toString()
                //Toast.makeText(this, "Answer is " + result, Toast.LENGTH_SHORT).show()
                //txtanswer.text = result.toString()
            }

        }

    }
}