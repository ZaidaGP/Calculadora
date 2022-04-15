package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    var texto: TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto = findViewById(R.id.textView)

        val espression = Expression()
        val buttonC: Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{ buttonClearClick()}

        val buttonSigno: Button = findViewById(R.id.buttonSigno)
        buttonSigno.setOnClickListener{ buttonSignoClick()}

        val buttonPorcentaje: Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{ buttonPorcentajeClick()}

        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener{ buttonDivideClick()}

        /*Botones row 2*/

        val buttonSiete: Button = findViewById(R.id.buttonSiete)
        buttonSiete.setOnClickListener{ buttonSieteClick()}

        val buttonOcho: Button = findViewById(R.id.buttonOcho)
        buttonOcho.setOnClickListener{ buttonOchoClick()}

        val buttonNueve: Button = findViewById(R.id.buttonNueve)
        buttonNueve.setOnClickListener{ buttonNueveClick()}

        val buttonMultiplica: Button = findViewById(R.id.buttonMultiplica)
        buttonMultiplica.setOnClickListener{ buttonMultiplicaClick()}

        /*Botones row 3*/

        val buttonCuatro: Button = findViewById(R.id.buttonCuatro)
        buttonCuatro.setOnClickListener{ buttonCuatroClick()}

        val buttonCinco: Button = findViewById(R.id.buttonCinco)
        buttonCinco.setOnClickListener{ buttonCincoClick()}

        val buttonSeis: Button = findViewById(R.id.buttonSeis)
        buttonSeis.setOnClickListener{ buttonSeisClick()}

        val buttonResta: Button = findViewById(R.id.buttonResta)
        buttonResta.setOnClickListener{ buttonRestaClick()}

        /*Botones row 4*/

        val buttonUno: Button = findViewById(R.id.buttonUno)
        buttonUno.setOnClickListener{ buttonUnoClick()}

        val buttonDos: Button = findViewById(R.id.buttonDos)
        buttonDos.setOnClickListener{ buttonDosClick()}

        val buttonTres: Button = findViewById(R.id.buttonTres)
        buttonTres.setOnClickListener{ buttonTresClick()}

        val buttonSuma: Button = findViewById(R.id.buttonSuma)
        buttonSuma.setOnClickListener{ buttonSumaClick()}

        /*Botones row 4*/

        val buttonCero: Button = findViewById(R.id.buttonCero)
        buttonCero.setOnClickListener{ buttonCeroClick()}

        val buttonComa: Button = findViewById(R.id.buttonComa)
        buttonComa.setOnClickListener{ buttonComaClick()}

        val buttonIgual: Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener{ buttonIgualClick()}

    }

    private fun buttonIgualClick() {
        val expression = Expression(texto?.text.toString())
        texto?.text = expression.calculate().toString()
    }

    private fun buttonComaClick() {
        texto?.setText(texto?.text.toString() + ".")
    }

    private fun buttonCeroClick() {
        if (texto?.text == "0") texto?.text = "0"
        else texto?.setText(texto?.text.toString() + "0")
    }

    private fun buttonSumaClick() {
        texto?.setText(texto?.text.toString() + "+")
    }

    private fun buttonTresClick() {
        if (texto?.text == "0") texto?.text = "3"
        else texto?.setText(texto?.text.toString() + "3")

    }

    private fun buttonDosClick() {
        if (texto?.text == "0") texto?.text = "2"
        else texto?.setText(texto?.text.toString() + "2")
    }

    private fun buttonUnoClick() {
        if (texto?.text == "0") texto?.text = "1"
        else texto?.setText(texto?.text.toString() + "1")
    }

    private fun buttonRestaClick() {
        texto?.setText(texto?.text.toString() + "-")
    }

    private fun buttonSeisClick() {
        if (texto?.text == "0") texto?.text = "6"
        else texto?.setText(texto?.text.toString() + "6")
    }

    private fun buttonCincoClick() {
        if (texto?.text == "0") texto?.text = "5"
        else texto?.setText(texto?.text.toString() + "5")
    }

    private fun buttonCuatroClick() {
        if (texto?.text == "0") texto?.text = "4"
        else texto?.setText(texto?.text.toString() + "4")
    }

    private fun buttonMultiplicaClick() {
        texto?.setText(texto?.text.toString() + "*")
    }

    private fun buttonNueveClick() {
        if (texto?.text == "0") texto?.text = "9"
        else texto?.setText(texto?.text.toString() + "9")
    }

    private fun buttonOchoClick() {
        if (texto?.text == "0") texto?.text = "8"
        else texto?.setText(texto?.text.toString() + "8")
    }

    private fun buttonSieteClick() {
        if (texto?.text == "0") texto?.text = "7"
        else texto?.setText(texto?.text.toString() + "7")
    }

    private fun buttonDivideClick() {

        texto?.setText(texto?.text.toString() + "/")
    }

    private fun buttonPorcentajeClick() {
        texto?.setText(texto?.text.toString() + "%")
    }

    private fun buttonSignoClick() {
        texto?.setText(texto?.text.toString() + "+-")
    }

    private fun buttonClearClick() {

        texto?.text  = "0"

    }


}