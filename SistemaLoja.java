public class SistemaLoja {

    String nome;
    String produto;
    double preco;
    int numParcelas;
    double valorParcela;
    int vencimentos;
    double desconto;

    public double precoParcela(){
        this.valorParcela = preco / numParcelas;
        return valorParcela;
    }

    public double aplicarDesconto(){
        desconto = preco * 0.10;
        return desconto;
    }



}
