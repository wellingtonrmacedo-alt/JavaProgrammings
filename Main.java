import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String titulo = "Lojas Fantomas";
        SistemaLoja loja = new SistemaLoja();
        loja.nome = JOptionPane.showInputDialog(null,"Digite seu nome: ",
                titulo, 3 );
        loja.produto = JOptionPane.showInputDialog(null, "Digite o produto: ",
                titulo, 3);
        loja.preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço: ",
                titulo, 3));
        loja.numParcelas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de parcelas: ", titulo, 3));
        loja.vencimentos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite dia de vencimento: ", titulo, 3));

        //double aplicDesconto = loja.precoParcela();
        double valorComDesconto = loja.aplicarDesconto();
        while(loja.numParcelas == 1){
            JOptionPane.showMessageDialog(null,"Valor com Desconto: R$ "+valorComDesconto);
        }








    }
}