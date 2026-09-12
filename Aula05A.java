package objeto;

import javax.swing.JOptionPane;

/**
 * Nesse programa vamos estudar os métodos(funções) em Java,
 * começando com métodos sem retorno e sem parâmetro
 */


public class Aula05A{
    public static void main(String[] args){
        // Para chamar o método de instância precisamos criar um método
        Aula05A pessoa = new Aula05A();

        pessoa.apresentar();

        // Para chamar um metodo static, nao precisa criar o objeto
        mensagem();

        pessoa.apresentar();

        mensagem();

    }

    //Método de instância
    public void apresentar(){
        JOptionPane.showMessageDialog(null,
                "Olá, Essa mensagem pertence a um método.");
    }

    //Método estático (static)
    public static void mensagem(){
        JOptionPane.showMessageDialog(null,
                "Bem-vindo ao programa feito em java");
    }
}