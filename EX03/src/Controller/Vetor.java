package Controller;

public class Vetor {

    // Construtor
    public Vetor() {
        super();
    }

    // Metodo recursivo que conta números pares no vetor
    public int contarPares(int[] vetor, int tamanho) {

        /*
         * Quando o tamanho for igual a 0,
         * significa que todas as posições do vetor
         * já foram analisadas.
         * Nesse caso, retorna-se 0.
         */
        if (tamanho == 0) {
            return 0;
        }

        /*
         * RELAÇÃO DE CHAMADA DOS PASSOS:
         * A quantidade de números pares até a posição n
         * é igual à quantidade até (n - 1),
         * somada de 1 caso o elemento atual seja par.
         */
        if (vetor[tamanho - 1] % 2 == 0) {
            return 1 + contarPares(vetor, tamanho - 1);
        } else {
            return contarPares(vetor, tamanho - 1);
        }
    }
}