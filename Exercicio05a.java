/*
 * Uma escola deseja criar um pequeno sistema para calcular a média dos alunos
 * Crie um programa que recebe o nome do aluno e tre notas.
 * Crie um método sem retorno e com parametro para receber o nome do aluno
 * e imprimir a mensagem: "Fulano localizado no sistema"
 * Crie um método com retorno e com parametro para receber as três notas,
 * calcular a média e retornar essa média para o método chamador (main), 
 * Imprima a média do aluno.
 */
package exercicio05a;

import javax.swing.JOptionPane;


public class Exercicio05a {

    
    public static void main(String[] args) {
       
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
        nomeAluno(nome);
        
        Exercicio05a exerc = new Exercicio05a();
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota2: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota3: "));
        double media = exerc.medias(nota1,nota2,nota3);
        
        JOptionPane.showMessageDialog(null, "A média do aluno " + nome + " foi " 
            + String.format("%.2f", media));
        
        
    }
    
    public static void nomeAluno(String nome){
       JOptionPane.showMessageDialog(null, nome + " localizado no sistema");
    }
    
    public double medias(double nota1, double nota2, double nota3){
        
        double media = ((nota1+nota2+nota3) / 3);        
        return media;
        
        
    }
    
    
    
}
