import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] notas = new double [5];

        int aprovados = 0;
        int reprovados = 0;
        double soma = 0;
        double media = 0;

        for(int i=0; i < notas.length; i++){
            System.out.printf("\nDigite a %d nota: %n", i+1);
            notas[i] = scan.nextDouble();

            soma+=notas[i];
            media = soma / notas.length; 

            if(notas[i] >=7){
                aprovados++;
            }else{
                reprovados++;
            }
        }
        scan.close();
        
        System.out.printf("\nA média da turma é: %.2f", media);
        System.out.printf("\nO total de alunos aprovados foi: %d", aprovados);
        System.out.printf("\nO total de alunos reprovados foi: %d", reprovados);
           }
    }