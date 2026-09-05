import javax.swing.*;

public class SistemaLoja {

    String nome;
    String produto;
    double preco;
    int numParcelas;
    double valorParcela;
    int vencimentos;
    double desconto;

    public void entradaDados(){
        String titulo = "Lojas Fantomas";
        this.nome = JOptionPane.showInputDialog(null,
                "Digite seu nome: ",
                titulo, 3 );
        this.produto = JOptionPane.showInputDialog(null,
                "Digite o produto: ",
                titulo, 3);
        this.preco = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o preço: ",
                titulo, 3));
        this.numParcelas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de parcelas: ", titulo, 3));
        this.vencimentos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um desse dia de vencimento: 05, 10, 15, 20, 25",
                titulo, 3));
    }

    public double precoParcela(){
        this.valorParcela = preco / numParcelas;
        return valorParcela;
    }

    public double aplicarDesconto(){
        desconto = preco - (preco * 0.10);
        return desconto;
    }

    public void imprimirCupom(){
        System.out.println("=".repeat(40));
        System.out.println("        Lojas Fantomas        ");
        System.out.println("=".repeat(40));
        System.out.println("Cliente: " + this.nome);
        System.out.println("Produto: " + this.produto);
        System.out.println("Valor: " + String.format("%.2f", this.preco));
        System.out.println("Parcelas: " + this.numParcelas);
        System.out.println("Valor das parcela: " + String.format("%.2f",
                this.precoParcela()) + " em "
                + this.numParcelas + " vezes.\n");
        System.out.println("=".repeat(40));
    }

    public void rodape(){
        System.out.println("=".repeat(40));
        System.out.println("Sistema de Loja SENAI GUARULHOS DUTRA");
        System.out.println("=".repeat(40));
        System.out.println("Muito Obrigado pela Compra!");
        System.out.println("        Volte Sempre!        ");
        System.out.println("=".repeat(40));
    }

}
