/*
    Nesse programa vamos estudar o uso de array
    em Java e a manipulação de um array usando o
    FOR.
 */

public class Main{
    public static void main(String args[]){
        String[] alunos = {"Laura", "Fábio", "Téo", "Mateus"};

        int[] idade = new int[4];
        idade[0] = 20;
        idade[1] = 25;
        idade[2] = 26;
        idade[3] = 29;

        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno " + alunos[2] + " tem " + idade[2] + " anos. ");
        }

    }
}
