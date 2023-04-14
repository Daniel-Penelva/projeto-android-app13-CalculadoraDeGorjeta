package com.formacaoandroidstudio.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    /* criando os atributos dos componentes */
    private EditText editValor;
    private TextView textPorcentagem, textGorjeta, textTotal;
    private SeekBar seekBarGorjeta;

    /* Definir o valor da porcentagem */
    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Capturando os ids dos componentes */
        editValor = findViewById(R.id.editValor);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textGorjeta = findViewById(R.id.textGorjeta);
        textTotal = findViewById(R.id.textTotal);
        seekBarGorjeta = findViewById(R.id.seekBarGorjeta);

        // Adicionar um listener no seekBarGorjeta
        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                // Vai receber o progress que define o valor do progresso da barra.
                porcentagem = progress;

                //Vamos usar a Class Math e afunção round para arredondar o valor de porcentagem para um número sem vírgula.
                textPorcentagem.setText(Math.round(porcentagem) + " %");

                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    /* Método Calcular */
    public void calcular(){

        // Recupera e converte o valor do editText para uma String
        String valorRecuperado = editValor.getText().toString();

        // Verifica se o usuário digitou no campo de texto
        if(valorRecuperado == null || valorRecuperado.equals("")){

            Toast.makeText(getApplicationContext(), "Digite o valor primeiro", Toast.LENGTH_LONG).show();

        }else{
            // Converter String para Double do valor do campo EditText.
            double valorDigitado = Double.parseDouble(valorRecuperado);

            // Calcular a gorjeta
           double gorjeta = valorDigitado * (porcentagem/100);

           // Atribuir o valor no campo de texto da gorjeta
            textGorjeta.setText("R$ " + Math.round(gorjeta));

            // Calcular total
            double total = valorDigitado + gorjeta;

            // Atribuir o valor no campo de texto do total
            textTotal.setText("R$ " + total);
        }
    }
}


/**
 * Anotações - Layout
 *
 * Em Attributes:
 *
 * 1º Add o componente da imagem e a imagem. Fazer as conexões superior, direito e esquerdo. Configurar um espaçamento
 * de 32 para a conexão da direita e da esquerda. No layout_height configura um tamanho de 200dp. E Trocar de wrap_content
 * para Match constraints (configuração feita no Constraint Widget).
 *
 * 2º TextInputLayout. Definir o layout_width para 200dp. Depois ligas as conexões superior, esquerda e direita. Configurar
 * um espaçamento de 32 para a conexão da direita e da esquerda tanto para '' quanto para 'textInputEditText'.E Trocar de wrap_content para Match constraints
 * (configuração feita no Constraint Widget). Em  no inputType colocar o valor 'numberDecimal'. E no
 * 'hint' colocar o texto da caixa.
 *
 * 3º TextView em text colocar '0%'. Trocar de wrap_content para Match constraints (configuração feita no Constraint Widget).
 * Colocar um layout_width de 70dp e textSize 16dp. Copia e cola duas vezes e troca o text para 'Gorjeta' e para 'Total'.
 * Para 'R$ 0.00' foi feito um background.
 *
 * 4º SeekBar. Trocar de wrap_content para Match constraints (configuração feita no Constraint Widget). Em 'max' coloque
 * o valor 100.
 *
 * Ligar as conexões dos componentes.
 *
 * Por fim vamos centralizar os componentes, indo em "constraintLayout" na aba 'Component Tree'. Em attributes
 * vai em 'layout_gravity' e marque o valor 'center'. E em 'layout_height' trocar por 'wrap_content'.
 *
 **/