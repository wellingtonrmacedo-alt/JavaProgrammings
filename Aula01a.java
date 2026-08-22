package aula01a;
/**
 * Nesses programas vamos estudar as 
 * variaveis do tipo primitivo
 * 
 */
public class Aula01a{

    public static void main(String args[]){
        System.out.println("Wellington Macedo");
        System.out.println("=================");
        System.out.println("--- Tipos Primitivos ---");
        
        // Tipo byte: -128 até 127
        byte idadeAluno;
        byte temperaturaAtual;
        idadeAluno = 18;
        temperaturaAtual = 27;
        System.out.println("Idade do aluno: " + idadeAluno);
        System.out.println("Temperatura atual: " + temperaturaAtual + " graus.");
        
        // Tipo short: -32768 até 32.767
        short populacaoGuara = 18606;
        short anoInicial = 2026;
        System.out.println("Populacao de Guara: " + populacaoGuara);
        System.out.println("Ano Inicial: " + anoInicial);
        
        //Tipo int: - 2 bilhões até 2 bilhões
        int impostoSaoPaulo = 1200000000;
        int premioMegaSena = 89456000;
        System.out.println("Imposto Arrecadado do Estado de Sao Paulo por dia: " + impostoSaoPaulo);
        System.out.println("Premio da Megasena: " + premioMegaSena);
        
        //Tipo long: 9 quintilhões
        long impostoBrasil = 2_886_000_000_000L;
        long populacaoMundial = 7_800_000_000L;
        System.out.println("Arrecadacao de imposto no Brasil: " + impostoBrasil);
        System.out.println("Populacao mundial: " + populacaoMundial);
        
        //Tipo float: Números com 7 casas decimais
        float altura = 1.75f;
        float microValor = 12345.123456711f;
        System.out.println("Altura: " + altura);
        System.out.println("Micro valor: " + microValor);
        
        //Tipo double: Números com 15 casas decimais
        double pi = 3.14159226535978463;
        double indice = 123456789.45678912345678;
        double premio = 55_000_000.00;
        
        System.out.printf("Numero do Pi: %.10f\n", pi);
        System.out.printf("Indice: %,.15f%n", indice);
        System.out.printf("Premio: R$ %,.2f%n", premio);
        
    }
}
