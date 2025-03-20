package Ex03;

import pilhas.PilhaInt;

import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt binario = new PilhaInt();
        binario.init();
        int decimal, resto;
        System.out.println("Informe o número decimal positivo que deseja converter: ");
        decimal = sc.nextInt();

        System.out.println("Valor de " + decimal + " em binário: ");
        while (decimal != 0) {
            resto = decimal % 2;
            decimal /= 2;

            binario.push(resto);

        }

        binario.esvaziar();

        sc.close();
    }
}
