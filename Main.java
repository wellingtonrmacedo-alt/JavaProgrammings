
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SistemaLoja loja = new SistemaLoja();

        loja.entradaDados();

        loja.imprimirCupom();

        LocalDate data = LocalDate.of(2026, 9, loja.vencimentos);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        double valorParcela = loja.precoParcela();
        if(loja.numParcelas == 1){
            valorParcela = loja.aplicarDesconto();
            System.out.println("Parcela Única com desconto de 10% a vista: "
            + data.format(formato) + " - R$ " + String.format("%.2f", valorParcela));
        }

        int parcela = 1;

        while(parcela <= loja.numParcelas){
            System.out.println("Parcela " + parcela + ": " + data.format(formato)
            + " - R$ " + String.format("%.2f", valorParcela));

            data = data.plusMonths(1);
            parcela++;
        }

        loja.rodape();


    }
}