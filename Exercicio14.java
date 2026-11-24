import java.util.Scanner;

public class Main {
    static void apresentar(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        apresentar(nome);
        System.out.print("Buscar qual nome? ");
        String busca = entrada.nextLine();
        if (nome.equalsIgnoreCase(busca)) {
            System.out.println(busca + " foi encontrado(a)!");
        } else {
            System.out.println(busca + " não foi encontrado.");
        }

        entrada.close();
    }
}