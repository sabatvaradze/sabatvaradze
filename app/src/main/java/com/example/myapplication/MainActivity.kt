package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


     private lateinit var resultTextView: TextView
     private var operand: Double = 0.0
    private var operation:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }

    fun numberClick(clickedView: View) {

        if (clickedView is TextView) {
            val number = clickedView.text.toString()
            val resultText:String = resultTextView.text.toString()

            resultTextView.text = resultText + number

        }

    }


    fun operationClikck(view: View){
        if (view is TextView){
            var result:String = resultTextView.text.toString()

            if (result.isNotEmpty()) {
                this.operand = result.toDouble()
            }

            resultTextView.text = ""

            this.operation = view.text.toString()


   }


}

    fun equalsClick(view: View){
        val sec0perandText: String = resultTextView.text.toString()
        var sec0perand: Double = 0.0
        if (sec0perandText.isNotEmpty()){
            sec0perand = sec0perandText.toDouble()


        }
        when (this.operation) {
            "+" -> resultTextView.text = (operand + sec0perand).toString()
            "-" -> resultTextView.text = (operand - sec0perand).toString()
            "*" -> resultTextView.text = (operand * sec0perand).toString()
            "/" -> resultTextView.text = (operand / sec0perand).toString()
            "%" -> resultTextView.text = (operand * (sec0perand/100)).toString()
        }

    }
fun delete(view:View){
    resultTextView.text=""
    this.operation=""
    this.operand=0.0
}
 fun xarisxi(view:View){
     if(resultTextView.text.toString().isNotEmpty()){
         var fac=resultTextView.text.toString()
         operand=fac.toDouble()
         operation="%"
     }


 }


}