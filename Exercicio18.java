
import java.util.Scanner;

public class Main {

    // Método que verifica se um número é primo
    static boolean ehPrimo(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método que filtra os números primos do vetor
    static int[] filtrarPrimos(int[] v) {

        int quantidade = 0;

        // Conta quantos números primos existem
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                quantidade++;
            }
        }

        // Cria um novo vetor com o tamanho correto
        int[] primos = new int[quantidade];

        int posicao = 0;

        // Copia somente os números primos
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                primos[posicao] = v[i];
                posicao++;
            }
        }

        return primos;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[8];

        // Lê os 8 números
        System.out.println("Digite 8 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Chama o método para filtrar os primos
        int[] resultado = filtrarPrimos(numeros);

        // Mostra os números primos
        System.out.println("\nNúmeros primos encontrados:");

        if (resultado.length == 0) {
            System.out.println("Nenhum número primo encontrado.");
        } else {
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(resultado[i] + " ");
            }
        }

        System.out.println();

        entrada.close();
    }
}
