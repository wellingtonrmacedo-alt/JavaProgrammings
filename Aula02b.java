
package aula02b;

/**
 * Nesse programa vamos estudar o uso do tipo de classe String.
 */
public class Aula02b {
    
    public static void main(String[] args) {
        String nome = new String();
        nome = "Gaspar";
        
        String sobrenome = "Galego";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);
        
        // Número de caracteres da String (Inclusive espaços em branco)
        int tamanho = nomeCompleto.length();
        System.out.println("O nome completo tem " + tamanho + " caracteres.");
        
        // Exibi em letra maiúsculo
        System.out.println("Maiusculo: " + nomeCompleto.toUpperCase());
        
        // Exibir em letras minusculas
        System.out.println("Minusculas: " + nomeCompleto.toLowerCase());
        
        // Verificar se existe um conteúdo na variável
        System.out.println("Existe 'Gaspar' na variavel: " + nomeCompleto.contains("Gaspar"));
        System.out.println("Existe 'Jorge' na variavel: " + nomeCompleto.contains("Jorge"));
        
        // Verificar inicio da variável
        System.out.println("Variavel comeca com 'Gasp': " + nomeCompleto.startsWith("Gasp"));
        
        // Verifica o final da variável
        System.out.println("Variavel termina com 'lego': " + nomeCompleto.endsWith("lego"));
        
        // Comparar duas Strings
        String nome2 = "Gaspar Galego";
        
        System.out.println("As variaveis nomeCompleto e nome sao iguais: " + nomeCompleto.equals(nome2));
        
        nome2 = nome2.toUpperCase();
        
        System.out.println("As variaveis nomeCompleto e nome sao iguais" +
                " indepedente da caixa alta ou baixa: " + nomeCompleto.equalsIgnoreCase(nome2));
        
        nomeCompleto = "     " + nomeCompleto + "     ";
        System.out.println("Nome Completo: " + nomeCompleto);
        
        // Retirar espaços em branco no inicio e fim do texto
        nomeCompleto = nomeCompleto.trim();
        System.out.println("Nome Completo Limpo: " + nomeCompleto);
        
        // Substituir parte do texto
        nomeCompleto = nomeCompleto.replace("G", "R");
        System.out.println("Nome com letra alterada: " + nomeCompleto);
    }
    
}
