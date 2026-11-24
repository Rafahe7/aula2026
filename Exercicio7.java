import java.util.Scanner;

public class RemoverRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] original = new int[10];
        int[] temp = new int[10];
        int qtdUnicos = 0;

        System.out.print("Entrada: ");
        for (int i = 0; i < original.length; i++) {
            original[i] = scanner.nextInt();

            boolean jaExiste = false;
            for (int j = 0; j < qtdUnicos; j++) {
                if (temp[j] == original[i]) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                temp[qtdUnicos] = original[i];
                qtdUnicos++;
            }
        }

        int[] semRepetidos = new int[qtdUnicos];
        for (int i = 0; i < qtdUnicos; i++) {
            semRepetidos[i] = temp[i];
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + (i < original.length - 1 ? " " : ""));
        }
        System.out.println();

        System.out.print("Sem repetidos: ");
        for (int i = 0; i < semRepetidos.length; i++) {
            System.out.print(semRepetidos[i] + (i < semRepetidos.length - 1 ? " " : ""));
        }
        System.out.println();


        int removidos = original.length - semRepetidos.length;
        System.out.println("Valores removidos: " + removidos);

        scanner.close();
    }
}