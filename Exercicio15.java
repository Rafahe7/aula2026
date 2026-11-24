
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] vendas = new double[5][7];

        String[] dias = {
            "Segunda", "Terca", "Quarta",
            "Quinta", "Sexta", "Sabado", "Domingo"
        };

        System.out.println("=== REGISTRO DE VENDAS ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nProduto " + (i + 1));

            for (int j = 0; j < 7; j++) {
                System.out.print("Venda de " + dias[j] + ": R$ ");
                vendas[i][j] = entrada.nextDouble();
            }
        }


        double maiorVenda = 0;
        int diaMaiorVenda = 0;

        System.out.println("\n=== TOTAL DE VENDAS POR DIA ===");

        for (int j = 0; j < 7; j++) {

            double totalDia = 0;

            for (int i = 0; i < 5; i++) {
                totalDia += vendas[i][j];
            }

            System.out.printf("%s: R$ %.2f%n", dias[j], totalDia);

    
            if (j == 0 || totalDia > maiorVenda) {
                maiorVenda = totalDia;
                diaMaiorVenda = j;
            }
        }

        System.out.println("\n=== RESULTADO ===");

        System.out.println("Dia com maior venda: " + dias[diaMaiorVenda]);

        System.out.printf("Total vendido: R$ %.2f%n", maiorVenda);

        entrada.close();
    }
}
