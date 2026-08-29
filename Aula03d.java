
package aula03d;

import javax.swing.JOptionPane;

/**
 * Nesse programa vamos fazer uma tabuada com o while
 * @author Aluno
 */
public class Aula03d {

    
    public static void main(String[] args) {
        
        String numeroStr = JOptionPane.showInputDialog(null,
                "Digite o numero para a tabuada: ",
                "Sistema de Tabuada, 3");

        int numero = Integer.parseInt(numeroStr);
        int contador = 1;
        String msg = "";
        
        while(contador <= 10){
            int total = numero * contador;
            msg += numero + "X" + contador + " = " + total + "\n";
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, msg,
                "Sistema de Tabuada", 1);
        
    }
    
}
