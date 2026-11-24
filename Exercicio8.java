import java.util.Scanner;

public class MaiorMenorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][3];
        int maior = 0;
        int menor = 0;

        System.out.println("Entrada:");

        // Leitura da matriz 4x3 e comparação dos valores
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();

                // Inicializa maior e menor com o primeiro elemento lido
                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                } else {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                    if (matriz[i][j] < menor) {
                        menor = matriz[i][j];
                    }
                }
            }
        }

        // Exibição dos resultados
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}