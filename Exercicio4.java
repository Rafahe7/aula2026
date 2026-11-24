import java.util.Scanner;

public class TemperaturasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] temperaturas = new double[7];
        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura de " + dias[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;
        System.out.printf("%nMédia da semana: %.1f °C%n", media);

      
        System.out.println("Dias acima da média:");
        int indiceMaisQuente = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("%s (%.1f °C)%n", dias[i], temperaturas[i]);
            }

            if (temperaturas[i] > temperaturas[indiceMaisQuente]) {
                indiceMaisQuente = i;
            }
        }

        System.out.printf("Dia mais quente: %s (%.1f °C)%n", dias[indiceMaisQuente], temperaturas[indiceMaisQuente]);

        scanner.close();
    }
}