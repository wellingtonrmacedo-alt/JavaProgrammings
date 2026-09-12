/*
 * Nesse programa vamos definir 
 * o construtor de objetos
 */
package aula05f;

import javax.swing.JOptionPane;


public class Carro {
    
    String marca;
    String modelo;
    int ano;
    
    //Construtor
    public Carro(String marcaCarro, String modeloCarro, int anoCarro){
        this.marca = marcaCarro;
        this.modelo = modeloCarro;
        this.ano = anoCarro;
    }
    
    public void acelerar(int potencia){
        JOptionPane.showMessageDialog(null, "O carro " + this.modelo + " está acelerando "
        + potencia + " km/h");
    }
    
    public void imprimirDados(){
        String msg = "\nMarca do veiculo: " + this.marca;
        msg += "\nModelo do veículo: " + this.modelo;
        msg += "\nAno do veículo: " + this.ano;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
