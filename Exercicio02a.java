package exercicio02a;

/**
1. Crie um novo projeto chamado `Exercicio02a.java`.
2. Declare uma variável `String` chamada `frase` com o valor "A linguagem Java é poderosa.".
3. Usando os métodos de `String`, faça e imprima o seguinte:
    - Imprima o comprimento da frase. ok
    - Imprima a frase em letras maiúsculas.ok
    - Verifique e imprima se a frase contém a palavra "Java".ok
    - Substitua e imprima a palavra 'poderosa' por 'incrível'ok * 
 */
public class Exercicio02a {

    
    public static void main(String[] args) {
        
        // Imprima o comprimento da frase.
        String frase = "A linguagem Java eh poderosa";
        System.out.println("Comprimento da frase eh: " + frase.length());
        
        // Imprima a frase em letras maiúsculas.
        System.out.println("Letras Maiusculas: " + frase.toUpperCase());
        
        // Verifique e imprima se a frase contém a palavra "Java".
        System.out.println("Contem a palavra Java?: " + frase.contains("Java"));
        
        // Substitua e imprima a palavra 'poderosa' por 'incrível'
        System.out.println("Trocando a palavra poderosa por incrivel: " + frase.replace("poderosa", "incrivel"));
    }
    
}
