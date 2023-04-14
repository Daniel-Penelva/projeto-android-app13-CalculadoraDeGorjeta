package com.formacaoandroidstudio.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
 * 4º SeekBar. Trocar de wrap_content para Match constraints (configuração feita no Constraint Widget).
 *
 * Ligar as conexões dos componentes.
 *
 * Por fim vamos centralizar os componentes, indo em "constraintLayout" na aba 'Component Tree'. Em attributes
 * vai em 'layout_gravity' e marque o valor 'center'. E em 'layout_height' trocar por 'wrap_content'.
 *
 **/