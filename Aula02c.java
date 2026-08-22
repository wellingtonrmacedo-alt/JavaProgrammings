
package aula02c;


import javax.swing.*;

import static javax.swing.JOptionPane.*;

// Nesse programa o uso do IF
public class Aula02c {

    public static void main(String[] args) {
       String nomeCompleto = showInputDialog(null, "Digite o nome do cliente:",
               "Lojas Peruanas", 3);

       int clienteVIP = JOptionPane.showConfirmDialog(null, "Esse cliente é VIP?",
               "Lojas Peruanas", JOptionPane.YES_NO_OPTION, 3);

       String valorStr = JOptionPane.showInputDialog(null,
               "Digite o valor da compra do cliente:", "Lojas Peruanas", 3);

        valorStr = valorStr.replace(".", "");
       valorStr = valorStr.replace(",",".");

       // Converter a string valorStr para tipode dados double
       double valor = Double.parseDouble(valorStr);

       if(clienteVIP == YES_OPTION){
           valor = valor - (valor * 10 / 100);
       }

       JOptionPane.showMessageDialog(null, "Valor a pagar: "
               + String.format("%,.2f", valor));

    }
    
}
