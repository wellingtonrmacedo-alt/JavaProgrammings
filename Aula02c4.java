package aula02c;

/**
 * Nesse programa vamos estudar o operador ternário
 */
public class Aula02c4 {

    public static void main(String args[]){

        boolean ehAluno = false;

        System.out.println((ehAluno ? "É aluno" : "Não é aluno" ));

        String nome = "Gaspar Galego Neve";

        System.out.println((nome.contains("Neve") ? "Contém o nome" : "Não contém o nome"));

        int idade = 18;
        String msg = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(msg);

    }
}
