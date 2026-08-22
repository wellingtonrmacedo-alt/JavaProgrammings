package aula02c;

import javax.swing.*;

/**
 * Voce foi contratado para criar um programa que verifica o
 * indice de massa corporal de uma pessoa (IMC). Seu programa deve
 * solicitar o peso e a altura do cliente, calcular o IMC e informar
 * a classificação de acordo com a tabela:
 *
 *  Para encontraar o IMC utilize a fórmula:
 *  imc = peso / (altura * altura)
 *  Veja a interpretação do IMC
 *  IMC                 Classificação
 *  Menor que 18,5      Magreza
 *  Entre 18,5 e 24,9   Normal
 *  Entre 25,0 e 29,9   Sobrepeso
 *  Entre 30,0 e 34,9   Obesidade Grau I
 *  Entre 35,0 e 39,9   Obesidade Grau II
 *  Maior que 40,0      Obesidade Grau III
 *
 *  Utilize JOptionPane para solicitar o peso e a altura e para informar
 *  a classificação,
 */
public class Exercicio02c {

    public static void main(String[] args){

        String titulo = "Programa IMC";
        String declarePeso = JOptionPane.showInputDialog(null, "Informe o seu peso: ", titulo, 3);
        String declareAltura = JOptionPane.showInputDialog(null, "Informe o seu altura: ", titulo, 3);
        double peso = Double.parseDouble(declarePeso);
        double altura = Double.parseDouble(declareAltura);
        String result = "";

        double imc = peso/(altura*altura);

        if(imc<18.5) {
            result = "Magreza";
        }else if(imc>=18.5 && imc<=24.9){
            result = "Normal";
        }else if(imc>=25.0 && imc<=29.9){
            result = "Sobrepeso";
        }else if(imc>=30.0 && imc<=34.9){
            result = "Obesidade Grau 1";
        }else if(imc>=35.0 && imc<=39.9){
            result = "Obesidade Grau 2";
        }else{
            result = "Obesidade Grau 3";
        }

        String msg = "Você está com " + String.format("%,.2f", imc) + " que significa " + result;


        JOptionPane.showMessageDialog(null, msg, titulo, 1);


    }
}
