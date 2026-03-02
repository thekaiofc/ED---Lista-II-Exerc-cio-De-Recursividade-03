package View;

import java.util.Scanner;
import Controller.Vetor;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("O tamanho deve ser maior que zero.");
        } else {

            int[] vetor = new int[n];

            // Entrada apenas de números naturais diferentes de zero
            for (int i = 0; i < n; i++) {

                int valor;

                do {
                    System.out.print("Digite um número natural diferente de zero: ");
                    valor = sc.nextInt();

                    if (valor <= 0) {
                        System.out.println("Valor inválido! Deve ser natural e diferente de zero.");
                    }

                } while (valor <= 0);

                vetor[i] = valor;
            }

            // Instanciando a classe de controle
            Vetor controller = new Vetor();

            int totalPares = controller.contarPares(vetor, n);

            System.out.println("Quantidade de números pares no vetor: " + totalPares);
        }

        sc.close();
    }
}