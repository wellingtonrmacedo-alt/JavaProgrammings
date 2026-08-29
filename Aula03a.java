
package aula03a;

import javax.swing.*;

/**
 * Nesse programa vamos fazer uma revisão if, else if,
 * else e operador ternário. *
 */
public class Aula03a{
    // Operador ternário
    public static void main(String args[]){
        int idade = 20;

        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println("Aluno: " + resultado);

        boolean ehAluno = true;
        System.out.println(ehAluno ? "Aluno ativo" : "Aluno ausente");

        // Desvio Condicional

        String horaStr = JOptionPane.showInputDialog(null,
                "Digite a hora de entrada no formato 'HH': ", "Senai Guarulhos Dutra", 3);

        int hora = Integer.parseInt(horaStr);
        String msg;

        if(hora >= 7 && hora <= 12){
            msg = "Turno: Manhã";
        }else if(hora >= 13 && hora <= 17){
            msg = "Turno: Tarde";
        }else if(hora >=18 && hora <= 23){
            msg = "Turno: Noite";
        }else{
            msg = "Hora Inválida";
        }

        JOptionPane.showMessageDialog(null, msg, "Senai", 1);

    }
    
}
