import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

   
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        char jogador = 'X';
        int jogadas = 0;
        boolean venceu = false;

        System.out.println("=== JOGO DA VELHA ===");

        while (jogadas < 9 && !venceu) {

            System.out.println();
            System.out.println("  1   2   3");
            
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + " ");
                
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j]);

                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }

                System.out.println();

                if (i < 2) {
                    System.out.println(" ---+---+---");
                }
            }

      
            System.out.println("\nJogador " + jogador);

            System.out.print("Digite a linha (1 a 3): ");
            int linha = entrada.nextInt();

            System.out.print("Digite a coluna (1 a 3): ");
            int coluna = entrada.nextInt();

            if (linha < 1 || linha > 3 ||
                coluna < 1 || coluna > 3) {

                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

    
            if (tabuleiro[linha - 1][coluna - 1] != ' ') {
                System.out.println("Essa posição já está ocupada! Tente novamente.");
                continue;
            }

          
            tabuleiro[linha - 1][coluna - 1] = jogador;
            jogadas++;

   
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogador &&
                    tabuleiro[i][1] == jogador &&
                    tabuleiro[i][2] == jogador) {
                    venceu = true;
                }
            }


            for (int j = 0; j < 3; j++) {
                if (tabuleiro[0][j] == jogador &&
                    tabuleiro[1][j] == jogador &&
                    tabuleiro[2][j] == jogador) {
                    venceu = true;
                }
            }

    
            if (tabuleiro[0][0] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][2] == jogador) {
                venceu = true;
            }

    
            if (tabuleiro[0][2] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][0] == jogador) {
                venceu = true;
            }

            // Alterna entre X e O
            if (!venceu) {
                jogador = (jogador == 'X') ? 'O' : 'X';
            }
        }

  
        System.out.println("\n=== TABULEIRO FINAL ===");
        System.out.println("  1   2   3");

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println(" ---+---+---");
            }
        }

        if (venceu) {
            System.out.println("\nParabéns! Jogador " + jogador + " venceu!");
        } else {
            System.out.println("\nEmpate! Ninguém venceu.");
        }

        entrada.close();
    }
}