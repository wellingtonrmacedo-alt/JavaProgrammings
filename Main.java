//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();

        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(100) + 1;
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }


    }

}
